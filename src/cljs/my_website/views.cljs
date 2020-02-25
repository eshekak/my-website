(ns my-website.views
  (:require-macros [cljss.core])
  (:require
    [cljss.core :as css :refer-macros [defstyles]]))

(defstyles color-it [] {:color "blue"})

(defn main [] [:div {:class (color-it)} "Hey, there!"])