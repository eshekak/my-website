(ns my-website.core
  (:require
    [reagent.core :as reagent]
    [re-frame.core :as re-frame]
    [my-website.pages.home.views :refer [home]]
    [my-website.config :as config]))

(defn dev-setup [] (when config/debug? (println "dev mode")))

(defn ^:dev/after-load mount-root
  []
  (re-frame/clear-subscription-cache!)
  (reagent/render [home] (.getElementById js/document "app")))

(defn init [] (dev-setup) (mount-root))
