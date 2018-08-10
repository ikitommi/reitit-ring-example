(ns example.ring
  (:require [ring.adapter.jetty :as jetty]))

(defn app [_]
  {:status 200
   :body "hello world"})

(defn start []
  (jetty/run-jetty #'app {:port 3000, :join? false}))

(comment
  (start))
