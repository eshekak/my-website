(ns my-website.components.icon.views
  (:require
    [my-website.components.icon.styles :as s-icon]
    [my-website.styles.colors :refer [color-text-primary]]))

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