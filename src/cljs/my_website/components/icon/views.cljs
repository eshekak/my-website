(ns my-website.components.icon.views
  (:require
    [my-website.components.icon.styles :as s-icon]))

(defn icon
  [icon-type]
  (cond
    (= icon-type :github)
      [:a
       {:href "https://github.com/eshekak",
        :rel "noopener noreferrer nofollow",
        :target "_blank"}
       [:img
        {:class (s-icon/social-icons--image),
         :src "/assets/github.svg",
         :alt "Link to my Github"}]]
    (= icon-type :email)
      [:a {:href "mailto:hello@aolenev.me"}
       [:img
        {:class (s-icon/social-icons--image),
         `:src "/assets/envelope.svg",
         :alt "Link to my email"}]]
    :else nil))

(defn social-icons
  []
  [:div {:class (s-icon/social-icons)}
   [:div {:class (s-icon/social-icons--container)} [icon :github]
    [icon :email]]])
