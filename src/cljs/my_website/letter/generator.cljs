(ns my-website.letter.generator
  (:require-macros [cljss.core])
  (:require
    [cljss.core :as css :refer-macros [defstyles]])
  (:require
    [my-website.styles :as s])
  (:require
    [my-website.letter.letters :refer [letters]]))

; Styles
(defn custom-styles
  [animation-delay]
  {:stroke "#f5f5f7", :stroke-width 3, :animation-delay animation-delay})

(defstyles
  letter--position
  [{top :top, left :left}]
  {:position "absolute", :top top, :left left, :width "90px"})

; Markup
(defn gen-letter
  [{animation-delay :animation-delay, letter :letter, :as all}]
  [:div {:class (letter--position all)}
   [:svg
    {:x "0px", :y "0px", :width "100%", :height "100%", :viewBox "0 0 255 255"}
    [:path
     {:class (s/main__svg-el (custom-styles animation-delay)),
      :fill "transparent",
      ; Create a map of letters` pathes in a separate file and add logic of
      ; their pulling
      :d (get letters letter)}]]])