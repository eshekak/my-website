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
    [logo-line {:x1 75, :y1 105, :x2 385, :y2 105, :animation-delay "600ms"}]
    ;   Vertical lines
    ;    Name
    [logo-line {:x1 5, :y1 0, :x2 5, :y2 60, :animation-delay "800ms"}]
    [logo-line {:x1 55, :y1 0, :x2 55, :y2 60, :animation-delay "900ms"}]
    [logo-line {:x1 105, :y1 0, :x2 105, :y2 60, :animation-delay "1000ms"}]
    [logo-line {:x1 155, :y1 0, :x2 155, :y2 60, :animation-delay "1100ms"}]
    [logo-line {:x1 205, :y1 0, :x2 205, :y2 60, :animation-delay "1200ms"}]
    [logo-line {:x1 255, :y1 0, :x2 255, :y2 60, :animation-delay "1300ms"}]
    [logo-line {:x1 305, :y1 0, :x2 305, :y2 60, :animation-delay "1400ms"}]
    [logo-line {:x1 355, :y1 0, :x2 355, :y2 60, :animation-delay "1500ms"}]
    [logo-line {:x1 405, :y1 0, :x2 405, :y2 60, :animation-delay "1600ms"}]
    [logo-line {:x1 455, :y1 0, :x2 455, :y2 60, :animation-delay "1700ms"}]
    ;   Surname
    [logo-line {:x1 80, :y1 50, :x2 80, :y2 110, :animation-delay "1800ms"}]
    [logo-line {:x1 130, :y1 50, :x2 130, :y2 110, :animation-delay "1900ms"}]
    [logo-line {:x1 180, :y1 50, :x2 180, :y2 110, :animation-delay "2000ms"}]
    [logo-line {:x1 230, :y1 50, :x2 230, :y2 110, :animation-delay "2100ms"}]
    [logo-line {:x1 280, :y1 50, :x2 280, :y2 110, :animation-delay "2200ms"}]
    [logo-line {:x1 330, :y1 50, :x2 330, :y2 110, :animation-delay "2300ms"}]
    [logo-line
     {:x1 380, :y1 50, :x2 380, :y2 110, :animation-delay "2400ms"}]]])