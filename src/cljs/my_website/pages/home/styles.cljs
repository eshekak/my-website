(ns my-website.pages.home.styles
  (:require-macros [cljss.core])
  (:require
    [cljss.core :as css :refer-macros [defstyles]]
    [my-website.styles.colors :refer [color-primary]]))

; Find a way to compose styles like this
; (def screen-query [:screen :and [:max-width "500px"]])

(defstyles
  home
  []
  {:display "flex",
   :align-items "center",
   :justify-content "center",
   :width "100%",
   :height "100vh",
   :text-align "center"})

(defstyles
  home-container
  []
  {:position "relative",
   :width "460px",
   :height "195px",
   ::css/media
     {[:screen :and [:max-width "500px"]]
        {:width "300px", :height "127.17px"}}})

(defstyles home-logo [] {:width "100%", :height "56.41%"})

(defstyles
  home-occupation
  []
  {:margin 0,
   :margin-top "0.5rem",
   :color color-primary,
   :font-size "1.75rem",
   :animation "home-text 1s ease forwards",
   :animation-delay "1900ms",
   ::css/media {[:screen :and [:max-width "500px"]] {:font-size "1rem"}}})

(defstyles
  home-email
  []
  {:display "block",
   :margin-top "0.5rem",
   :color color-primary,
   :font-size "1.33rem",
   :animation "home-text 1s ease forwards",
   :animation-delay "2100ms",
   ::css/media {[:screen :and [:max-width "500px"]] {:font-size "0.76rem"}}})
