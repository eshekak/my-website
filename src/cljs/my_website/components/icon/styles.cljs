(ns my-website.components.icon.styles
  (:require
    [cljss.core :as css :refer-macros [defstyles]]))

(defstyles
  social-icons
  []
  {:display "flex",
   :align-items "center",
   :justify-content "center",
   :margin-top "2rem",
   ::css/media {[:screen :and [:max-width "500px"]] {:margin-top "1rem"}}})

(defstyles
  social-icons--container
  []
  {:display "flex", :justify-content "space-between", :width "25%"})

(defstyles
  social-icons--image
  []
  {:display "block",
   :height "1.75rem",
   :opacity 1,
   :background-size "cover",
   :animation "social-icon 1s ease forwards",
   :animation-duration "3s",
   :animation-delay "2100ms",
   :&:hover {:cursor "pointer"},
   ::css/media {[:screen :and [:max-width "500px"]] {:height "1.5rem"}}})
