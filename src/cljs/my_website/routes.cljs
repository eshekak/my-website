(ns my-website.routes
  (:require
    [bidi.bidi :as bidi]
    [pushy.core :as pushy]
    [my-website.db :as db]))

(def app-routes ["/" {"" :home}])

(defn set-page! [match] (swap! db/state assoc :page match))

(def history (pushy/pushy set-page! (partial bidi/match-route app-routes)))

(pushy/start! history)
