(ns my-website.letter.generator
  (:require-macros [cljss.core])
  (:require
    [my-website.styles :as s]
    [my-website.letter.style :refer [letter--position custom-styles]]
    [my-website.letter.letters :refer [letters]]))

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