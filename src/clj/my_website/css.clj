(ns my-website.css
  (:require
    [garden.def :refer [defstyles]]))

(defstyles screen [:body :html {:margin 0, :width "100%", :height "100%"}])
