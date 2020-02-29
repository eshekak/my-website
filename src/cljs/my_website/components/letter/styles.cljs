(ns my-website.components.letter.styles
  (:require
    [cljss.core :as css :refer-macros [defstyles]]
    [my-website.styles.colors :refer [color-text-primary]]))

(defstyles
  position
  [{top :top, left :left}]
  {:position "absolute", :top top, :left left, :width "90px"})