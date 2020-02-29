(ns my-website.components.letter.views
  (:require
    [my-website.styles.svg :as s-svg]
    [my-website.components.letter.styles :as s-letter]
    [my-website.components.letter.letters :refer [letters]]
    [my-website.styles.colors :refer [color-text-primary]]))

(defn letter
  [{animation-delay :animation-delay, letter :letter, :as all}]
  [:div {:class (s-letter/letter all)}
   [:svg
    {:x "0px", :y "0px", :width "100%", :height "100%", :viewBox "0 0 255 255"}
    [:path
     {:class
        (s-svg/el
          {:stroke color-text-primary,
           :stroke-width 4,
           :animation-delay animation-delay}),
      :fill "transparent",
      :d (get letters letter)}]]])