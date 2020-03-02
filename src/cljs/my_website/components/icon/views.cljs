(ns my-website.components.icon.views
  (:require
    [my-website.components.icon.styles :as s-icon]))

;(defn icon
;  [icon-type]
;  (cond
;    (= icon-type :github)
;      [:a {:href "https://github.com/eshekak", :target "_blank"}
;       [:img {:class (s-icon/social-icons--image), :src
;       "/assets/github-logo.svg"}]]
;    (= icon-type :email)
;      [:a {:href "mailto:hello@aolenev.me"}
;       [:img {:class (s-icon/social-icons--image), :src
;       "/assets/envelope.svg"}]]
;    :else nil))

(defn icon
  [icon-type]
  (cond
    (= icon-type :github)
      [:a
       {:class (s-icon/social-icons--image "/assets/github.svg"),
        :href "https://github.com/eshekak",
        :target "_blank"}]
    (= icon-type :email)
      [:a
       {:class (s-icon/social-icons--image "/assets/envelope.svg"),
        :href "mailto:hello@aolenev.me"}]
    :else nil))

(defn social-icons
  []
  [:div {:class (s-icon/social-icons)}
   [:div {:class (s-icon/social-icons--container)} [icon :github]
    [icon :email]]])