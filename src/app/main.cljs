(ns app.main
  (:require [strohm-native.flow :refer [create-store]]))

;; Reducer doesn't do anything yet, simply returns state
(defn reducer [state _action] state)

(defn ^:export main! []
  (tap> "Hello world!")
  (create-store reducer :initial-state {:greeting "Hello world!"}))

(defn ^:dev/after-load reload! []
  (tap> "reloaded"))
