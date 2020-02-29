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

(defstyles home-container [] {:position "relative"})

(defstyles home-logo [] {:width "460px", :height "110px"})

(defstyles
  home-occupation
  []
  {:margin 0,
   :margin-top "0.5rem",
   :color color-primary,
   :font-size "1.75rem",
   :animation "appear 1s ease forwards",
   :animation-delay "1900ms"})

(defstyles
  home-email
  []
  {:display "block",
   :margin-top "0.5rem",
   :color color-primary,
   :font-size "1.33rem",
   :animation "appear 1s ease forwards",
   :animation-delay "2100ms"})
