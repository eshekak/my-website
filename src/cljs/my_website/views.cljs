(ns my-website.views
  (:require-macros [cljss.core])
  (:require
    [my-website.styles :as s]
    [my-website.letter.generator :refer [gen-letter]]))

; Styles
(defn custom-styles
  [animation-delay]
  {:stroke "#424245", :stroke-width 1, :animation-delay animation-delay})

; Markup
(defn line
  [{x1 :x1, y1 :y1, x2 :x2, y2 :y2, animation-delay :animation-delay}]
  [:line
   {:class (s/main__svg-el (custom-styles animation-delay)),
    :x1 x1,
    :y1 y1,
    :x2 x2,
    :y2 y2}])

(defn circle
  [{cx :cx, cy :cy, r :r, animation-delay :animation-delay}]
  [:circle
   {:class (s/main__svg-el (custom-styles animation-delay)),
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
     [line {:x1 0, :y1 55, :x2 460, :y2 55, :animation-delay "50ms"}]
     [line {:x1 75, :y1 105, :x2 385, :y2 105, :animation-delay "100ms"}]
     ;   Vertical lines
     ;    Name
     [line {:x1 5, :y1 0, :x2 5, :y2 60, :animation-delay "150ms"}]
     [line {:x1 55, :y1 0, :x2 55, :y2 60, :animation-delay "200ms"}]
     [line {:x1 105, :y1 0, :x2 105, :y2 60, :animation-delay "250ms"}]
     [line {:x1 155, :y1 0, :x2 155, :y2 60, :animation-delay "300ms"}]
     [line {:x1 205, :y1 0, :x2 205, :y2 60, :animation-delay "350ms"}]
     [line {:x1 255, :y1 0, :x2 255, :y2 60, :animation-delay "400ms"}]
     [line {:x1 305, :y1 0, :x2 305, :y2 60, :animation-delay "450ms"}]
     [line {:x1 355, :y1 0, :x2 355, :y2 60, :animation-delay "500ms"}]
     [line {:x1 405, :y1 0, :x2 405, :y2 60, :animation-delay "550ms"}]
     [line {:x1 455, :y1 0, :x2 455, :y2 60, :animation-delay "600ms"}]
     ;   Surname
     [line {:x1 80, :y1 50, :x2 80, :y2 110, :animation-delay "650ms"}]
     [line {:x1 130, :y1 50, :x2 130, :y2 110, :animation-delay "700ms"}]
     [line {:x1 180, :y1 50, :x2 180, :y2 110, :animation-delay "750ms"}]
     [line {:x1 230, :y1 50, :x2 230, :y2 110, :animation-delay "800ms"}]
     [line {:x1 280, :y1 50, :x2 280, :y2 110, :animation-delay "850ms"}]
     [line {:x1 330, :y1 50, :x2 330, :y2 110, :animation-delay "900ms"}]
     [line {:x1 380, :y1 50, :x2 380, :y2 110, :animation-delay "950ms"}]
     ;    Name cells
     ;   First name letter cell
     [line {:x1 1, :y1 1, :x2 59, :y2 59, :animation-delay "1000ms"}]
     [line {:x1 59, :y1 1, :x2 1, :y2 59, :animation-delay "1050ms"}]
     [circle {:cx 30, :cy 30, :r 12.5, :animation-delay "2500ms"}]
     [circle {:cx 30, :cy 30, :r 25, :animation-delay "2550ms"}]
     ;   Second name letter cell
     [line {:x1 51, :y1 1, :x2 109, :y2 59, :animation-delay "1100ms"}]
     [line {:x1 109, :y1 1, :x2 51, :y2 59, :animation-delay "1150ms"}]
     [circle {:cx 80, :cy 30, :r 12.5, :animation-delay "2600ms"}]
     [circle {:cx 80, :cy 30, :r 25, :animation-delay "2650ms"}]
     ;   Third name letter cell
     [line {:x1 101, :y1 1, :x2 159, :y2 59, :animation-delay "1200ms"}]
     [line {:x1 159, :y1 1, :x2 101, :y2 59, :animation-delay "1250ms"}]
     [circle {:cx 130, :cy 30, :r 12.5, :animation-delay "2700ms"}]
     [circle {:cx 130, :cy 30, :r 25, :animation-delay "2750ms"}]
     ;   Fourth name letter cell
     [line {:x1 151, :y1 1, :x2 209, :y2 59, :animation-delay "1300ms"}]
     [line {:x1 209, :y1 1, :x2 151, :y2 59, :animation-delay "1350ms"}]
     [circle {:cx 180, :cy 30, :r 12.5, :animation-delay "2800ms"}]
     [circle {:cx 180, :cy 30, :r 25, :animation-delay "2850ms"}]
     ;   Fifth name letter cell
     [line {:x1 201, :y1 1, :x2 259, :y2 59, :animation-delay "1400ms"}]
     [line {:x1 259, :y1 1, :x2 201, :y2 59, :animation-delay "1450ms"}]
     [circle {:cx 230, :cy 30, :r 12.5, :animation-delay "2900ms"}]
     [circle {:cx 230, :cy 30, :r 25, :animation-delay "2950ms"}]
     ;   Fifth name letter cell
     [line {:x1 251, :y1 1, :x2 309, :y2 59, :animation-delay "1500ms"}]
     [line {:x1 309, :y1 1, :x2 251, :y2 59, :animation-delay "1550ms"}]
     [circle {:cx 280, :cy 30, :r 12.5, :animation-delay "3000ms"}]
     [circle {:cx 280, :cy 30, :r 25, :animation-delay "3050ms"}]
     ;   Sixth name letter cell
     [line {:x1 301, :y1 1, :x2 359, :y2 59, :animation-delay "1600ms"}]
     [line {:x1 359, :y1 1, :x2 301, :y2 59, :animation-delay "1650ms"}]
     [circle {:cx 330, :cy 30, :r 12.5, :animation-delay "3100ms"}]
     [circle {:cx 330, :cy 30, :r 25, :animation-delay "3150ms"}]
     ;   Seventh name letter cell
     [line {:x1 351, :y1 1, :x2 409, :y2 59, :animation-delay "1700ms"}]
     [line {:x1 409, :y1 1, :x2 351, :y2 59, :animation-delay "1750ms"}]
     [circle {:cx 380, :cy 30, :r 12.5, :animation-delay "3200ms"}]
     [circle {:cx 380, :cy 30, :r 25, :animation-delay "3250ms"}]
     ;   Eighth name letter cell
     [line {:x1 401, :y1 1, :x2 459, :y2 59, :animation-delay "1800ms"}]
     [line {:x1 459, :y1 1, :x2 401, :y2 59, :animation-delay "1850ms"}]
     [circle {:cx 430, :cy 30, :r 12.5, :animation-delay "3300ms"}]
     [circle {:cx 430, :cy 30, :r 25, :animation-delay "3350ms"}]
     ;   Surname cells
     ;    First surname letter cell
     [line {:x1 76, :y1 51, :x2 134, :y2 109, :animation-delay "1900ms"}]
     [line {:x1 134, :y1 51, :x2 76, :y2 109, :animation-delay "1950ms"}]
     [circle {:cx 105, :cy 80, :r 12.5, :animation-delay "3400ms"}]
     [circle {:cx 105, :cy 80, :r 25, :animation-delay "3450ms"}]
     ;    Second surname letter cell
     [line {:x1 126, :y1 51, :x2 184, :y2 109, :animation-delay "2000ms"}]
     [line {:x1 184, :y1 51, :x2 126, :y2 109, :animation-delay "2050ms"}]
     [circle {:cx 155, :cy 80, :r 12.5, :animation-delay "3500ms"}]
     [circle {:cx 155, :cy 80, :r 25, :animation-delay "3550ms"}]
     ;    Third surname letter cell
     [line {:x1 176, :y1 51, :x2 234, :y2 109, :animation-delay "2100ms"}]
     [line {:x1 234, :y1 51, :x2 176, :y2 109, :animation-delay "2150ms"}]
     [circle {:cx 205, :cy 80, :r 12.5, :animation-delay "3600ms"}]
     [circle {:cx 205, :cy 80, :r 25, :animation-delay "3650ms"}]
     ;    Fourth surname letter cell
     [line {:x1 226, :y1 51, :x2 284, :y2 109, :animation-delay "2200ms"}]
     [line {:x1 284, :y1 51, :x2 226, :y2 109, :animation-delay "2250ms"}]
     [circle {:cx 255, :cy 80, :r 12.5, :animation-delay "3700ms"}]
     [circle {:cx 255, :cy 80, :r 25, :animation-delay "3750ms"}]
     ;    Fifth surname letter cell
     [line {:x1 276, :y1 51, :x2 334, :y2 109, :animation-delay "2300ms"}]
     [line {:x1 334, :y1 51, :x2 276, :y2 109, :animation-delay "2350ms"}]
     [circle {:cx 305, :cy 80, :r 12.5, :animation-delay "3800ms"}]
     [circle {:cx 305, :cy 80, :r 25, :animation-delay "3850ms"}]
     ;    Sixth surname letter cell
     [line {:x1 326, :y1 51, :x2 384, :y2 109, :animation-delay "2400ms"}]
     [line {:x1 384, :y1 51, :x2 326, :y2 109, :animation-delay "2450ms"}]
     [circle {:cx 355, :cy 80, :r 12.5, :animation-delay "3900ms"}]
     [circle {:cx 355, :cy 80, :r 25, :animation-delay "3950ms"}]]
    ;   Letters
    ;    Name
    ;   A
    [gen-letter
     {:top "-16px", :left "-15px", :animation-delay "4000ms", :letter :A}]
    ;    L
    [gen-letter
     {:top "-16px", :left "35px", :animation-delay "4050ms", :letter :L}]
    ;    E
    [gen-letter
     {:top "-16px", :left "85px", :animation-delay "4100ms", :letter :E}]
    ;    X
    [gen-letter
     {:top "-16px", :left "135px", :animation-delay "4150ms", :letter :X}]
    ;    A
    [gen-letter
     {:top "-16px", :left "185px", :animation-delay "4200ms", :letter :A}]
    ;    N
    [gen-letter
     {:top "-16px", :left "235px", :animation-delay "4250ms", :letter :N}]
    ;    D
    [gen-letter
     {:top "-16px", :left "285px", :animation-delay "4300ms", :letter :D}]
    ;    E
    [gen-letter
     {:top "-16px", :left "335px", :animation-delay "4350ms", :letter :E}]
    ;    R
    [gen-letter
     {:top "-16px", :left "385px", :animation-delay "4400ms", :letter :R}]
    ;    Surname
    ;    O
    [gen-letter
     {:top "34px", :left "60px", :animation-delay "4450ms", :letter :O}]
    ;    L
    [gen-letter
     {:top "34px", :left "110px", :animation-delay "4500ms", :letter :L}]
    ;    E
    [gen-letter
     {:top "34px", :left "160px", :animation-delay "4550ms", :letter :E}]
    ;    N
    [gen-letter
     {:top "34px", :left "210px", :animation-delay "4600ms", :letter :N}]
    ;    E
    [gen-letter
     {:top "34px", :left "260px", :animation-delay "4650ms", :letter :E}]
    ;    V
    [gen-letter
     {:top "34px", :left "310px", :animation-delay "4700ms", :letter :V}]
    ;    Frontend developer
    [:h1 {:class (s/main__occupation)} "Frontend developer"]]])
