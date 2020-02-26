(ns my-website.styles
  (:require-macros [cljss.core])
  (:require
    [cljss.core :as css :refer-macros [defstyles defkeyframes]]))

(defkeyframes dash [] {:to {:stroke-dashoffset 0}})

(defstyles
  main
  []
  {:display "flex",
   :align-items "center",
   :justify-content "center",
   :width "100%",
   :height "100vh",
   :background-color "#0f0f0f"})

(defstyles main__logo [] {:width "460px"})

(defstyles
  main__svg-el
  [animation-delay]
  {:stroke "#888888",
   :stroke-width 1,
   :stroke-dasharray 1000,
   :stroke-dashoffset 1000,
   :animation "dash 1s ease forwards",
   :animation-delay animation-delay})