(ns my-website.styles.svg
  (:require-macros [cljss.core])
  (:require
    [cljss.core :as css :refer-macros [defstyles]]))

(defstyles
  el
  [{stroke :stroke,
    stroke-width :stroke-width,
    animation-delay :animation-delay}]
  {:stroke stroke,
   :stroke-width stroke-width,
   :stroke-dasharray 1000,
   :stroke-dashoffset 1000,
   :animation "svg 1s ease forwards",
   :animation-delay animation-delay})