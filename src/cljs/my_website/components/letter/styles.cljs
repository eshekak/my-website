(ns my-website.components.letter.styles
  (:require
    [cljss.core :as css :refer-macros [defstyles]]
    [my-website.styles.colors :refer [color-text-primary]]))

(defn custom-styles
  [animation-delay]
  {:stroke color-text-primary,
   :stroke-width 4,
   :animation-delay animation-delay})

(defstyles
  letter--position
  [{top :top, left :left}]
  {:position "absolute", :top top, :left left, :width "90px"})