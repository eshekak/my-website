(ns app.init
  (:require
    ["http" :as http]))


(def port
  (if-let [env-port (. js/process.env -PORT)]
    env-port
    8080))


(defn request-handler
  [req res]
  (.end res (str "<!DOCTYPE html><html lang='en'><head><meta charset='utf-8'><meta name='viewport' content='width=device-width,initial-scale=1'><meta name='description' content='Alexander Olenev. Personally about code on my website!'><title>Alexander Olenev</title></head><body><noscript>Please enable JavaScript to continue.</noscript></body></html>")))


(defonce server-refs
  (volatile! nil))


(defn main
  [& args]
  (js/console.log "Starting server")
  (let [server (http/createServer #(request-handler %1 %2))]

    (.listen server port
             (fn [err]
               (if err
                 (js/console.error "Server start failed")
                 (js/console.info "Http server running"))))

    (vreset! server-refs server)))
