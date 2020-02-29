(ns my-website.letter.generator
  (:require-macros [cljss.core])
  (:require
    [cljss.core :as css :refer-macros [defstyles]]
    [my-website.styles :as s]
    [my-website.letter.letters :refer [letters]]
    [my-website.styles.colors :refer [color-text-primary]]))

; Styles
(defn custom-styles
  [animation-delay]
  {:stroke color-text-primary,
   :stroke-width 4,
   :animation-delay animation-delay})

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
      :d (get letters letter)}]]])