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
  {:display "flex", :justify-content "space-evenly", :width "35%"})

(defstyles
  social-icons--image
  [img-src]
  {:display "block",
   :width "1.75rem",
   :height "1.75rem",
   :background-image (str "url('" img-src "')"),
   :background-size "cover",
   :&:hover {:cursor "pointer"}})
