(ns my-website.components.icon.views)

(defn icon
  [icon-type]
  (cond
    (= icon-type :github)
      [:a {:href "https://github.com/eshekak", :target "_blank"}
       [:img {:src "/assets/github-logo.svg"}]]
    (= icon-type :email)
      [:a {:href "mailto:hello@aolenev.me"}
       [:img {:src "/assets/envelope.svg"}]]
    :else nil))

(defn social-icons [] [:div [icon :github] [icon :email]])