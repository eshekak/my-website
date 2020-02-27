(ns my-website.letters.A
  (:require-macros [cljss.core])
  (:require
    [cljss.core :as css :refer-macros [defstyles]])
  (:require
    [my-website.styles :as s])
  (:require
    [my-website.letters.letters :as letters]))

; TODO: Generate this defstyles with defstyles in the main ns
(defstyles
  letter--animation
  [animation-delay]
  {:stroke "#f5f5f7",
   :stroke-width 4,
   :stroke-dasharray 1000,
   :stroke-dashoffset 1000,
   :animation "dash 1s ease forwards",
   :animation-delay animation-delay})

(defstyles
  letter--position
  [{top :top, left :left}]
  {:position "absolute", :top top, :left left, :width "90px"})

(defn A
  [{animation-delay :animation-delay, letter :letter, :as all}]
  [:div {:class (letter--position all)}
   [:svg
    {:x "0px", :y "0px", :width "100%", :height "100%", :viewBox "0 0 255 255"}
    [:path
     {:class (letter--animation animation-delay),
      :fill "transparent",
      ; Create a map of letters` pathes in a separate file and add logic of
      ; their pulling
      :d (get letters/letters-map letter)}]]])