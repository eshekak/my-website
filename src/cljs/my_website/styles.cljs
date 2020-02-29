(ns my-website.styles
  (:require-macros [cljss.core])
  (:require
    [cljss.core :as css :refer-macros [defstyles]]
    [my-website.styles.colors :refer [color-primary]]))

(defstyles
  main
  []
  {:display "flex",
   :align-items "center",
   :justify-content "center",
   :width "100%",
   :height "100vh",
   :text-align "center"})

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

(defstyles
  main__occupation
  []
  {:margin 0,
   :margin-top "0.5rem",
   :color color-primary,
   :font-size "1.75rem",
   :animation "appear 1s ease forwards",
   :animation-delay "1900ms"})

(defstyles
  main__email
  []
  {:display "block",
   :margin-top "0.5rem",
   :color color-primary,
   :font-size "1.33rem",
   :animation "appear 1s ease forwards",
   :animation-delay "2100ms"})
