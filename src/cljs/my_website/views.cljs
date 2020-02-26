(ns my-website.views
  (:require-macros [cljss.core])
  (:require
    [my-website.styles :as s]))

(defn logo-line
  [{x1 :x1, y1 :y1, x2 :x2, y2 :y2, animation-delay :animation-delay}]
  [:line
   {:class (s/main__logo-line animation-delay),
    :x1 x1,
    :y1 y1,
    :x2 x2,
    :y2 y2}])

(defn main
  []
  [:div {:class (s/main)}
   [:svg {:class (s/main__logo)}
    ;    Horizontal lines
    [logo-line {:x1 0, :y1 5, :x2 460, :y2 5, :animation-delay 0}]
    [logo-line {:x1 0, :y1 55, :x2 460, :y2 55, :animation-delay "300ms"}]
    [logo-line {:x1 75, :y1 105, :x2 385, :y2 105, :animation-delay "600ms"}]]])