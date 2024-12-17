(ns project.core)

(defn hello3
  ([] "Hello World")
  ([name] (str "Hello " name)))

(defn -main []
  (println "Hello, Clojure!")
  (println (hello3 "Jake")))
