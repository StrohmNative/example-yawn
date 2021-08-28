(ns app.main)

(defn ^:export main! []
  (tap> "Hello world!"))

(defn ^:dev/after-load reload! []
  (tap> "reloaded"))
