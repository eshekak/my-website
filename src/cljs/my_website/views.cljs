(ns my-website.views
  (:require-macros [cljss.core])
  (:require
    [my-website.styles :as s]))

(defn line
  [{x1 :x1, y1 :y1, x2 :x2, y2 :y2, animation-delay :animation-delay}]
  [:line
   {:class (s/main__svg-el animation-delay), :x1 x1, :y1 y1, :x2 x2, :y2 y2}])

(defn circle
  [{cx :cx, cy :cy, r :r, animation-delay :animation-delay}]
  [:circle
   {:class (s/main__svg-el animation-delay),
    :cx cx,
    :cy cy,
    :r r,
    :fill "none"}])

(defn main
  []
  [:div {:class (s/main)}
   [:svg {:class (s/main__logo)}
    ;    Horizontal lines
    [line {:x1 0, :y1 5, :x2 460, :y2 5, :animation-delay 0}]
    [line {:x1 0, :y1 55, :x2 460, :y2 55, :animation-delay "300ms"}]
    [line {:x1 75, :y1 105, :x2 385, :y2 105, :animation-delay "600ms"}]
    ;   Vertical lines
    ;    Name
    [line {:x1 5, :y1 0, :x2 5, :y2 60, :animation-delay "800ms"}]
    [line {:x1 55, :y1 0, :x2 55, :y2 60, :animation-delay "900ms"}]
    [line {:x1 105, :y1 0, :x2 105, :y2 60, :animation-delay "1000ms"}]
    [line {:x1 155, :y1 0, :x2 155, :y2 60, :animation-delay "1100ms"}]
    [line {:x1 205, :y1 0, :x2 205, :y2 60, :animation-delay "1200ms"}]
    [line {:x1 255, :y1 0, :x2 255, :y2 60, :animation-delay "1300ms"}]
    [line {:x1 305, :y1 0, :x2 305, :y2 60, :animation-delay "1400ms"}]
    [line {:x1 355, :y1 0, :x2 355, :y2 60, :animation-delay "1500ms"}]
    [line {:x1 405, :y1 0, :x2 405, :y2 60, :animation-delay "1600ms"}]
    [line {:x1 455, :y1 0, :x2 455, :y2 60, :animation-delay "1700ms"}]
    ;   Surname
    [line {:x1 80, :y1 50, :x2 80, :y2 110, :animation-delay "1800ms"}]
    [line {:x1 130, :y1 50, :x2 130, :y2 110, :animation-delay "1900ms"}]
    [line {:x1 180, :y1 50, :x2 180, :y2 110, :animation-delay "2000ms"}]
    [line {:x1 230, :y1 50, :x2 230, :y2 110, :animation-delay "2100ms"}]
    [line {:x1 280, :y1 50, :x2 280, :y2 110, :animation-delay "2200ms"}]
    [line {:x1 330, :y1 50, :x2 330, :y2 110, :animation-delay "2300ms"}]
    [line {:x1 380, :y1 50, :x2 380, :y2 110, :animation-delay "2400ms"}]
    ;    Name cells
    ;   First name letter cell
    [line {:x1 1, :y1 1, :x2 59, :y2 59, :animation-delay "2500ms"}]
    [line {:x1 59, :y1 1, :x2 1, :y2 59, :animation-delay "2550ms"}]
    [circle {:cx 30, :cy 30, :r 12.5, :animation-delay "4000ms"}]
    [circle {:cx 30, :cy 30, :r 25, :animation-delay "4050ms"}]
    ;   Second name letter cell
    [line {:x1 51, :y1 1, :x2 109, :y2 59, :animation-delay "2600ms"}]
    [line {:x1 109, :y1 1, :x2 51, :y2 59, :animation-delay "2650ms"}]
    [circle {:cx 80, :cy 30, :r 12.5, :animation-delay "4100ms"}]
    [circle {:cx 80, :cy 30, :r 25, :animation-delay "4150ms"}]
    ;   Third name letter cell
    [line {:x1 101, :y1 1, :x2 159, :y2 59, :animation-delay "2700ms"}]
    [line {:x1 159, :y1 1, :x2 101, :y2 59, :animation-delay "2750ms"}]
    [circle {:cx 130, :cy 30, :r 12.5, :animation-delay "4200ms"}]
    [circle {:cx 130, :cy 30, :r 25, :animation-delay "4250ms"}]
    ;   Fourth name letter cell
    [line {:x1 151, :y1 1, :x2 209, :y2 59, :animation-delay "2800ms"}]
    [line {:x1 209, :y1 1, :x2 151, :y2 59, :animation-delay "2850ms"}]
    [circle {:cx 180, :cy 30, :r 12.5, :animation-delay "4300ms"}]
    [circle {:cx 180, :cy 30, :r 25, :animation-delay "4350ms"}]
    ;   Fifth name letter cell
    [line {:x1 201, :y1 1, :x2 259, :y2 59, :animation-delay "2900ms"}]
    [line {:x1 259, :y1 1, :x2 201, :y2 59, :animation-delay "2950ms"}]
    [circle {:cx 230, :cy 30, :r 12.5, :animation-delay "4400ms"}]
    [circle {:cx 230, :cy 30, :r 25, :animation-delay "4450ms"}]
    ;   Fifth name letter cell
    [line {:x1 251, :y1 1, :x2 309, :y2 59, :animation-delay "3000ms"}]
    [line {:x1 309, :y1 1, :x2 251, :y2 59, :animation-delay "3050ms"}]
    [circle {:cx 280, :cy 30, :r 12.5, :animation-delay "4500ms"}]
    [circle {:cx 280, :cy 30, :r 25, :animation-delay "4550ms"}]
    ;   Sixth name letter cell
    [line {:x1 301, :y1 1, :x2 359, :y2 59, :animation-delay "3100ms"}]
    [line {:x1 359, :y1 1, :x2 301, :y2 59, :animation-delay "3150ms"}]
    [circle {:cx 330, :cy 30, :r 12.5, :animation-delay "4600ms"}]
    [circle {:cx 330, :cy 30, :r 25, :animation-delay "4650ms"}]
    ;   Seventh name letter cell
    [line {:x1 351, :y1 1, :x2 409, :y2 59, :animation-delay "3200ms"}]
    [line {:x1 409, :y1 1, :x2 351, :y2 59, :animation-delay "3250ms"}]
    [circle {:cx 380, :cy 30, :r 12.5, :animation-delay "4700ms"}]
    [circle {:cx 380, :cy 30, :r 25, :animation-delay "4750ms"}]
    ;   Eighth name letter cell
    [line {:x1 401, :y1 1, :x2 459, :y2 59, :animation-delay "3300ms"}]
    [line {:x1 459, :y1 1, :x2 401, :y2 59, :animation-delay "3350ms"}]
    [circle {:cx 430, :cy 30, :r 12.5, :animation-delay "4800ms"}]
    [circle {:cx 430, :cy 30, :r 25, :animation-delay "4850ms"}]]])
