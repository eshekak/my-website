(ns my-website.views
  (:require-macros [cljss.core])
  (:require
    [my-website.styles :as s]
    [my-website.letters.A :as A]))

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
   [:div {:class (s/main__container)}
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
     [circle {:cx 430, :cy 30, :r 25, :animation-delay "4850ms"}]
     ;   Surname cells
     ;    First surname letter cell
     [line {:x1 76, :y1 51, :x2 134, :y2 109, :animation-delay "3400ms"}]
     [line {:x1 134, :y1 51, :x2 76, :y2 109, :animation-delay "3450ms"}]
     [circle {:cx 105, :cy 80, :r 12.5, :animation-delay "4900ms"}]
     [circle {:cx 105, :cy 80, :r 25, :animation-delay "4950ms"}]
     ;    Second surname letter cell
     [line {:x1 126, :y1 51, :x2 184, :y2 109, :animation-delay "3500ms"}]
     [line {:x1 184, :y1 51, :x2 126, :y2 109, :animation-delay "3550ms"}]
     [circle {:cx 155, :cy 80, :r 12.5, :animation-delay "5000ms"}]
     [circle {:cx 155, :cy 80, :r 25, :animation-delay "5050ms"}]
     ;    Third surname letter cell
     [line {:x1 176, :y1 51, :x2 234, :y2 109, :animation-delay "3600ms"}]
     [line {:x1 234, :y1 51, :x2 176, :y2 109, :animation-delay "3650ms"}]
     [circle {:cx 205, :cy 80, :r 12.5, :animation-delay "5100ms"}]
     [circle {:cx 205, :cy 80, :r 25, :animation-delay "5150ms"}]
     ;    Fourth surname letter cell
     [line {:x1 226, :y1 51, :x2 284, :y2 109, :animation-delay "3700ms"}]
     [line {:x1 284, :y1 51, :x2 226, :y2 109, :animation-delay "3750ms"}]
     [circle {:cx 255, :cy 80, :r 12.5, :animation-delay "5200ms"}]
     [circle {:cx 255, :cy 80, :r 25, :animation-delay "5250ms"}]
     ;    Fifth surname letter cell
     [line {:x1 276, :y1 51, :x2 334, :y2 109, :animation-delay "3800ms"}]
     [line {:x1 334, :y1 51, :x2 276, :y2 109, :animation-delay "3850ms"}]
     [circle {:cx 305, :cy 80, :r 12.5, :animation-delay "5300ms"}]
     [circle {:cx 305, :cy 80, :r 25, :animation-delay "5350ms"}]
     ;    Sixth surname letter cell
     [line {:x1 326, :y1 51, :x2 384, :y2 109, :animation-delay "3900ms"}]
     [line {:x1 384, :y1 51, :x2 326, :y2 109, :animation-delay "3950ms"}]
     [circle {:cx 355, :cy 80, :r 12.5, :animation-delay "5400ms"}]
     [circle {:cx 355, :cy 80, :r 25, :animation-delay "5450ms"}]]
    ;   Letters
    ;    Name
    ;   A
    [A/A {:top "-16px", :left "-15px", :animation-delay "5500ms", :letter :A}]
    ;    L
    [A/A {:top "-16px", :left "35px", :animation-delay "5550ms", :letter :L}]
    ;    E
    [A/A {:top "-16px", :left "85px", :animation-delay "5600ms", :letter :E}]
    ;    X
    [A/A {:top "-16px", :left "135px", :animation-delay "5650ms", :letter :X}]
    ;    A
    [A/A {:top "-16px", :left "185px", :animation-delay "5700ms", :letter :A}]
    ;    N
    [A/A {:top "-16px", :left "235px", :animation-delay "5750ms", :letter :N}]
    ;    D
    [A/A {:top "-16px", :left "285px", :animation-delay "5800ms", :letter :D}]
    ;    E
    [A/A {:top "-16px", :left "335px", :animation-delay "5850ms", :letter :E}]
    ;    R
    [A/A {:top "-16px", :left "385px", :animation-delay "5900ms", :letter :R}]
    ;    Surname
    ;    O
    [A/A {:top "34px", :left "60px", :animation-delay "5950ms", :letter :O}]
    ;    L
    [A/A {:top "34px", :left "110px", :animation-delay "6000ms", :letter :L}]
    ;    E
    [A/A {:top "34px", :left "160px", :animation-delay "6050ms", :letter :E}]
    ;    N
    [A/A {:top "34px", :left "210px", :animation-delay "6100ms", :letter :N}]
    ;    E
    [A/A {:top "34px", :left "260px", :animation-delay "6150ms", :letter :E}]
    ;    V
    [A/A {:top "34px", :left "310px", :animation-delay "6200ms", :letter :V}]]])
