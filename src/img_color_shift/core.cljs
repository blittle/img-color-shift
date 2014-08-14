(ns img-color-shift.core)

(defn greeting  
    ([] (greeting "World!"))
    ([name] (str "Hello, " name)))

(defn ^:export main []  
    (.write js/document (greeting "Breet")))