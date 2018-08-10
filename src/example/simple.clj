(ns example.simple
  (:require [reitit.ring :as ring]
            [ring.adapter.jetty :as jetty]))

(def app
  (ring/ring-handler
    (ring/router
      ["/hello"
       {:get (fn [_]
               {:status 200
                :body "hello world"})}])))

(defn start []
  (jetty/run-jetty #'app {:port 4000, :join? false}))

(comment
  (start))
