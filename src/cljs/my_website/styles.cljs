(ns my-website.styles
  (:require-macros [cljss.core])
  (:require
    [cljss.core :as css :refer-macros [defstyles]]))

(def background-color "#0f0f0f")

(defstyles
  main
  []
  {:display "flex",
   :align-items "center",
   :justify-content "center",
   :width "100%",
   :height "100vh",
   :background-color background-color})

(defstyles main__container [] {:position "relative"})

(defstyles main__logo [] {:width "460px", :height "110px"})

(defstyles
  main__svg-el
  [animation-delay]
  {:stroke "#88888838",
   :stroke-width 1,
   :stroke-dasharray 1000,
   :stroke-dashoffset 1000,
   :animation "dash 1s ease forwards",
   :animation-delay animation-delay})