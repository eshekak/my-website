(ns my-website.styles
  (:require-macros [cljss.core])
  (:require
    [cljss.core :as css :refer-macros [defstyles]]))

(defstyles
  main
  []
  {:display "flex",
   :align-items "center",
   :justify-content "center",
   :width "100%",
   :height "100vh",
   :background-color "#0a0a0a"})

(defstyles main__container [] {:position "relative"})

(defstyles main__logo [] {:width "460px", :height "110px"})

(defstyles
  main__svg-el
  [{stroke :stroke,
    stroke-width :stroke-width,
    animation-delay :animation-delay}]
  {:stroke stroke,
   :stroke-width stroke-width,
   :stroke-dasharray 1000,
   :stroke-dashoffset 1000,
   :animation "dash 1s ease forwards",
   :animation-delay animation-delay})