(ns my-website.components.icon.styles
  (:require
    [cljss.core :as css :refer-macros [defstyles]]))

(defstyles
  social-icons
  []
  {:display "flex",
   :align-items "center",
   :justify-content "center",
   :margin-top "2rem"})

(defstyles
  social-icons--container
  []
  {:display "flex", :justify-content "space-between", :width "25%"})

(defstyles
  social-icons--image
  [img-src]
  {:display "block",
   :width "1.75rem",
   :height "1.75rem",
   :opacity 1,
   :background-image (str "url('" img-src "')"),
   :background-size "cover",
   :animation "social-icon 1s ease forwards",
   :animation-duration "3s",
   :animation-delay "2100ms",
   :&:hover {:cursor "pointer"}})
