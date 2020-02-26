(ns my-website.views
  (:require-macros [cljss.core])
  (:require
    [cljss.core :as css :refer-macros [defstyles]]
    [my-website.styles :as s]))

(defn main [] [:div {:class (s/color-it)} "Hey, there!"])