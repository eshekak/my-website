(ns my-website.pages.home.styles
  (:require-macros [cljss.core])
  (:require
    [cljss.core :as css :refer-macros [defstyles]]
    [my-website.styles.colors :refer [color-primary]]))

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
  {:position "relative", :width "460px", :height "195px"})

(defstyles home-logo [] {:width "100%", :height "56.41%"})

(defstyles
  home-occupation
  []
  {:margin 0,
   :margin-top "0.5rem",
   :color color-primary,
   :font-size "1.75rem",
   :animation "home-text 1s ease forwards",
   :animation-delay "1900ms"})

(defstyles
  home-email
  []
  {:display "block",
   :margin-top "0.5rem",
   :color color-primary,
   :font-size "1.33rem",
   :animation "home-text 1s ease forwards",
   :animation-delay "2100ms"})
