(ns my-website.components.letter.views
  (:require
    [my-website.styles.svg :as s-svg]
    [my-website.components.letter.styles :as s-letter]
    [my-website.components.letter.letters :refer [letters]]))

(defn letter
  [{animation-delay :animation-delay, letter :letter, :as all}]
  [:div {:class (s-letter/position all)}
   [:svg
    {:x "0px", :y "0px", :width "100%", :height "100%", :viewBox "0 0 255 255"}
    [:path
     {:class (s-svg/el (s-letter/custom-styles animation-delay)),
      :fill "transparent",
      :d (get letters letter)}]]])