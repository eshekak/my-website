(ns my-website.pages.home.views
  (:require
    [my-website.pages.home.styles :as s-home]
    [my-website.styles.svg :as s-svg]
    [my-website.components.letter.views :as v-letter]
    [my-website.styles.colors :refer [color-secondary]]))

; Markup
(defn line
  [{x1 :x1, y1 :y1, x2 :x2, y2 :y2, animation-delay :animation-delay}]
  [:line
   {:class
      (s-svg/el
        {:stroke color-secondary,
         :stroke-width 1,
         :animation-delay animation-delay}),
    :x1 x1,
    :y1 y1,
    :x2 x2,
    :y2 y2}])

(defn circle
  [{cx :cx, cy :cy, r :r, animation-delay :animation-delay}]
  [:circle
   {:class
      (s-svg/el
        {:stroke color-secondary,
         :stroke-width 1,
         :animation-delay animation-delay}),
    :cx cx,
    :cy cy,
    :r r,
    :fill "none"}])

(defn home
  []
  [:div {:class (s-home/home)}
   [:div {:class (s-home/home-container)}
    [:svg {:class (s-home/home-logo)}
     ;    Horizontal lines
     [line {:x1 0, :y1 "4.54%", :x2 "100%", :y2 "4.54%", :animation-delay 0}]
     [line {:x1 0, :y1 "50%", :x2 "100%", :y2 "50%", :animation-delay "20ms"}]
     [line
      {:x1 "16.3%",
       :y1 "95.5%",
       :x2 "83.7%",
       :y2 "95.5%",
       :animation-delay "40ms"}]
     ;   Vertical lines
     ;    Name
     [line
      {:x1 "1.08%", :y1 0, :x2 "1.08%", :y2 "54.54%", :animation-delay "60ms"}]
     [line
      {:x1 "11.95%",
       :y1 0,
       :x2 "11.95%",
       :y2 "54.54%",
       :animation-delay "80ms"}]
     [line
      {:x1 "22.82%",
       :y1 0,
       :x2 "22.82%",
       :y2 "54.54%",
       :animation-delay "100ms"}]
     [line
      {:x1 "33.69%",
       :y1 0,
       :x2 "33.69%",
       :y2 "54.54%",
       :animation-delay "120ms"}]
     [line
      {:x1 "44.56%",
       :y1 0,
       :x2 "44.56%",
       :y2 "54.54%",
       :animation-delay "140ms"}]
     [line
      {:x1 "55.43%",
       :y1 0,
       :x2 "55.43%",
       :y2 "54.54%",
       :animation-delay "160ms"}]
     [line
      {:x1 "66.3%", :y1 0, :x2 "66.3%", :y2 "54.54%", :animation-delay "180ms"}]
     [line
      {:x1 "77.17%",
       :y1 0,
       :x2 "77.17%",
       :y2 "54.54%",
       :animation-delay "200ms"}]
     [line
      {:x1 "88.04%",
       :y1 0,
       :x2 "88.04%",
       :y2 "54.54%",
       :animation-delay "220ms"}]
     [line
      {:x1 "98.92%",
       :y1 0,
       :x2 "98.92%",
       :y2 "54.54%",
       :animation-delay "240ms"}]
     ;   Surname
     [line
      {:x1 "17.39%",
       :y1 "45.45%",
       :x2 "17.39%",
       :y2 "100%",
       :animation-delay "260ms"}]
     [line
      {:x1 "28.26%",
       :y1 "45.45%",
       :x2 "28.26%",
       :y2 "100%",
       :animation-delay "280ms"}]
     [line
      {:x1 "39.13%",
       :y1 "45.45%",
       :x2 "39.13%",
       :y2 "100%",
       :animation-delay "300ms"}]
     [line
      {:x1 "50%",
       :y1 "45.45%",
       :x2 "50%",
       :y2 "100%",
       :animation-delay "320ms"}]
     [line
      {:x1 "60.87%",
       :y1 "45.45%",
       :x2 "60.87%",
       :y2 "100%",
       :animation-delay "340ms"}]
     [line
      {:x1 "71.74%",
       :y1 "45.45%",
       :x2 "71.74%",
       :y2 "100%",
       :animation-delay "360ms"}]
     [line
      {:x1 "82.61%",
       :y1 "45.45%",
       :x2 "82.61%",
       :y2 "100%",
       :animation-delay "380ms"}]
     ;    Name cells
     ;   First name letter cell
     [line
      {:x1 "0.217%",
       :y1 "0.9%",
       :x2 "12.82%",
       :y2 "53.63%",
       :animation-delay "400ms"}]
     [line
      {:x1 "12.82%",
       :y1 "0.9%",
       :x2 "0.217%",
       :y2 "53.63%",
       :animation-delay "420ms"}]
     [circle {:cx "6.52%", :cy "27.27%", :r "3.75%", :animation-delay "1000ms"}]
     [circle {:cx "6.52%", :cy "27.27%", :r "7.5%", :animation-delay "1020ms"}]
     ;   Second name letter cell
     [line
      {:x1 "11.087%",
       :y1 "0.9%",
       :x2 "23.69%",
       :y2 "53.63%",
       :animation-delay "440ms"}]
     [line
      {:x1 "23.69%",
       :y1 "0.9%",
       :x2 "11.087%",
       :y2 "53.63%",
       :animation-delay "460ms"}]
     [circle
      {:cx "17.39%", :cy "27.27%", :r "3.75%", :animation-delay "1040ms"}]
     [circle {:cx "17.39%", :cy "27.27%", :r "7.5%", :animation-delay "1060ms"}]
     ;   Third name letter cell
     [line
      {:x1 "21.957%",
       :y1 "0.9%",
       :x2 "34.56%",
       :y2 "53.63%",
       :animation-delay "480ms"}]
     [line
      {:x1 "34.56%",
       :y1 "0.9%",
       :x2 "21.957%",
       :y2 "53.63%",
       :animation-delay "500ms"}]
     [circle
      {:cx "28.26%", :cy "27.27%", :r "3.75%", :animation-delay "1080ms"}]
     [circle {:cx "28.26%", :cy "27.27%", :r "7.5%", :animation-delay "1100ms"}]
     ;   Fourth name letter cell
     [line
      {:x1 "32.827%",
       :y1 "0.9%",
       :x2 "45.43%",
       :y2 "53.63%",
       :animation-delay "520ms"}]
     [line
      {:x1 "45.43%",
       :y1 "0.9%",
       :x2 "32.827%",
       :y2 "53.63%",
       :animation-delay "540ms"}]
     [circle
      {:cx "39.13%", :cy "27.27%", :r "3.75%", :animation-delay "1120ms"}]
     [circle {:cx "39.13%", :cy "27.27%", :r "7.5%", :animation-delay "1140ms"}]
     ;   Fifth name letter cell
     [line
      {:x1 "43.697%",
       :y1 "0.9%",
       :x2 "56.03%",
       :y2 "53.63%",
       :animation-delay "560ms"}]
     [line
      {:x1 "56.03%",
       :y1 "0.9%",
       :x2 "43.697%",
       :y2 "53.63%",
       :animation-delay "580ms"}]
     [circle {:cx "50%", :cy "27.27%", :r "3.75%", :animation-delay "1160ms"}]
     [circle {:cx "50%", :cy "27.27%", :r "7.5%", :animation-delay "1180ms"}]
     ;   Fifth name letter cell
     [line
      {:x1 "54.567%",
       :y1 "0.9%",
       :x2 "67.17%",
       :y2 "53.63%",
       :animation-delay "600ms"}]
     [line
      {:x1 "67.17%",
       :y1 "0.9%",
       :x2 "54.567%",
       :y2 "53.63%",
       :animation-delay "620ms"}]
     [circle
      {:cx "60.87%", :cy "27.27%", :r "3.75%", :animation-delay "1200ms"}]
     [circle {:cx "60.87%", :cy "27.27%", :r "7.5%", :animation-delay "1220ms"}]
     ;   Sixth name letter cell
     [line
      {:x1 "65.437%",
       :y1 "0.9%",
       :x2 "78.04%",
       :y2 "53.63%",
       :animation-delay "640ms"}]
     [line
      {:x1 "78.04%",
       :y1 "0.9%",
       :x2 "65.437%",
       :y2 "53.63%",
       :animation-delay "660ms"}]
     [circle
      {:cx "71.74%", :cy "27.27%", :r "3.75%", :animation-delay "1240ms"}]
     [circle {:cx "71.74%", :cy "27.27%", :r "7.5%", :animation-delay "1260ms"}]
     ;   Seventh name letter cell
     [line
      {:x1 "76.307%",
       :y1 "0.9%",
       :x2 "88.91%",
       :y2 "53.63%",
       :animation-delay "680ms"}]
     [line
      {:x1 "88.91%",
       :y1 "0.9%",
       :x2 "76.307%",
       :y2 "53.63%",
       :animation-delay "700ms"}]
     [circle
      {:cx "82.61%", :cy "27.27%", :r "3.75%", :animation-delay "1280ms"}]
     [circle {:cx "82.61%", :cy "27.27%", :r "7.5%", :animation-delay "1300ms"}]
     ;   Eighth name letter cell
     [line
      {:x1 "87.177%",
       :y1 "0.9%",
       :x2 "99.78%",
       :y2 "53.63%",
       :animation-delay "720ms"}]
     [line
      {:x1 "99.78%",
       :y1 "0.9%",
       :x2 "87.177%",
       :y2 "53.63%",
       :animation-delay "740ms"}]
     [circle
      {:cx "93.48%", :cy "27.27%", :r "3.75%", :animation-delay "1320ms"}]
     [circle {:cx "93.48%", :cy "27.27%", :r "7.5%", :animation-delay "1340ms"}]
     ;   Surname cells
     ;    First surname letter cell
     [line
      {:x1 "16.52%",
       :y1 "46.36%",
       :x2 "29.13%",
       :y2 "99%",
       :animation-delay "760ms"}]
     [line
      {:x1 "29.13%",
       :y1 "46.36%",
       :x2 "16.52%",
       :y2 "99%",
       :animation-delay "780ms"}]
     [circle
      {:cx "22.82%", :cy "72.72%", :r "3.75%", :animation-delay "1360ms"}]
     [circle {:cx "22.82%", :cy "72.72%", :r "7.5%", :animation-delay "1380ms"}]
     ;    Second surname letter cell
     [line
      {:x1 "27.39%",
       :y1 "46.36%",
       :x2 "40%",
       :y2 "99%",
       :animation-delay "800ms"}]
     [line
      {:x1 "40%",
       :y1 "46.36%",
       :x2 "27.39%",
       :y2 "99%",
       :animation-delay "820ms"}]
     [circle
      {:cx "33.69%", :cy "72.72%", :r "3.75%", :animation-delay "1400ms"}]
     [circle {:cx "33.69%", :cy "72.72%", :r "7.5%", :animation-delay "1420ms"}]
     ;    Third surname letter cell
     [line
      {:x1 "38.26%",
       :y1 "46.36%",
       :x2 "50.87%",
       :y2 "99%",
       :animation-delay "840ms"}]
     [line
      {:x1 "50.87%",
       :y1 "46.36%",
       :x2 "38.26%",
       :y2 "99%",
       :animation-delay "860ms"}]
     [circle
      {:cx "44.566%", :cy "72.72%", :r "3.75%", :animation-delay "1440ms"}]
     [circle
      {:cx "44.566%", :cy "72.72%", :r "7.5%", :animation-delay "1460ms"}]
     ;    Fourth surname letter cell
     [line
      {:x1 "49.13%",
       :y1 "46.36%",
       :x2 "61.738%",
       :y2 "99%",
       :animation-delay "880ms"}]
     [line
      {:x1 "61.738%",
       :y1 "46.36%",
       :x2 "49.13%",
       :y2 "99%",
       :animation-delay "900ms"}]
     [circle
      {:cx "55.436%", :cy "72.72%", :r "3.75%", :animation-delay "1480ms"}]
     [circle
      {:cx "55.436%", :cy "72.72%", :r "7.5%", :animation-delay "1500ms"}]
     ;    Fifth surname letter cell
     [line
      {:x1 "60%",
       :y1 "46.36%",
       :x2 "72.6%",
       :y2 "99%",
       :animation-delay "920ms"}]
     [line
      {:x1 "72.6%",
       :y1 "46.36%",
       :x2 "60%",
       :y2 "99%",
       :animation-delay "940ms"}]
     [circle
      {:cx "66.30%", :cy "72.72%", :r "3.75%", :animation-delay "1520ms"}]
     [circle {:cx "66.30%", :cy "72.72%", :r "7.5%", :animation-delay "1540ms"}]
     ;    Sixth surname letter cell
     [line
      {:x1 "70.87%",
       :y1 "46.36%",
       :x2 "83.47%",
       :y2 "99%",
       :animation-delay "960ms"}]
     [line
      {:x1 "83.47%",
       :y1 "46.36%",
       :x2 "70.87%",
       :y2 "99%",
       :animation-delay "980ms"}]
     [circle
      {:cx "77.176%", :cy "72.72%", :r "3.75%", :animation-delay "1560ms"}]
     [circle
      {:cx "77.176%", :cy "72.72%", :r "7.5%", :animation-delay "1580ms"}]]
    ;    Letters
    ;    Name
    ;    A
    [v-letter/letter
     {:top "-8.4%", :left "-3.26%", :animation-delay "1600ms", :letter :A}]
    ;    L
    [v-letter/letter
     {:top "-8.4%", :left "7.61%", :animation-delay "1620ms", :letter :L}]
    ;    E
    [v-letter/letter
     {:top "-8.4%", :left "18.48%", :animation-delay "1640ms", :letter :E}]
    ;    X
    [v-letter/letter
     {:top "-8.4%", :left "29.35%", :animation-delay "1660ms", :letter :X}]
    ;    A
    [v-letter/letter
     {:top "-8.4%", :left "40.22%", :animation-delay "1680ms", :letter :A}]
    ;    N
    [v-letter/letter
     {:top "-8.4%", :left "51.09%", :animation-delay "1700ms", :letter :N}]
    ;    D
    [v-letter/letter
     {:top "-8.4%", :left "61.96%", :animation-delay "1720ms", :letter :D}]
    ;    E
    [v-letter/letter
     {:top "-8.4%", :left "72.83%", :animation-delay "1740ms", :letter :E}]
    ;    R
    [v-letter/letter
     {:top "-8.4%", :left "83.7%", :animation-delay "1760ms", :letter :R}]
    ;    Surname
    ;    O
    [v-letter/letter
     {:top "17.65%", :left "13.04%", :animation-delay "1780ms", :letter :O}]
    ;    L
    [v-letter/letter
     {:top "17.65%", :left "23.91%", :animation-delay "1800ms", :letter :L}]
    ;    E
    [v-letter/letter
     {:top "17.65%", :left "34.78%", :animation-delay "1820ms", :letter :E}]
    ;    N
    [v-letter/letter
     {:top "17.65%", :left "45.65%", :animation-delay "1840ms", :letter :N}]
    ;    E
    [v-letter/letter
     {:top "17.65%", :left "56.52%", :animation-delay "1860ms", :letter :E}]
    ;    V
    [v-letter/letter
     {:top "17.65%", :left "67.39%", :animation-delay "1880ms", :letter :V}]
    ;    Frontend developer
    [:h1 {:class (s-home/home-occupation)} "Frontend developer"]
    ;    Email
    [:a
     {:class (s-home/home-email), :href "mailto:aolenev@pm.com", :tabindex -1}
     "aolenev@pm.com"]]])
