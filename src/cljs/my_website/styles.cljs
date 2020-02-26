(ns my-website.styles
  (:require-macros [cljss.core])
  (:require
    [cljss.core :as css :refer-macros [defstyles]]))

(defstyles
  color-it
  []
  {:display "flex",
   :align-items "center",
   :justify-content "center",
   :width "100%",
   :height "100vh",
   :background-color "#0f0f0f"})