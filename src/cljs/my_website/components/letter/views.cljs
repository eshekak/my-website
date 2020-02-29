(ns my-website.components.letter.views
  (:require
    [my-website.styles :as s]
    [my-website.components.letter.styles :refer
     [letter--position custom-styles]]
    [my-website.components.letter.letters :refer [letters]]))

(defn letter
  [{animation-delay :animation-delay, letter :letter, :as all}]
  [:div {:class (letter--position all)}
   [:svg
    {:x "0px", :y "0px", :width "100%", :height "100%", :viewBox "0 0 255 255"}
    [:path
     {:class (s/main__svg-el (custom-styles animation-delay)),
      :fill "transparent",
      :d (get letters letter)}]]])