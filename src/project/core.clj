(ns project.core
  (:require [clojure.core.typed :as t])
  (:require [project.multimethods :as multimethods])
  (:require [project.multimethodstyped :as multimethodstyped]))
(class :fr)

(def english-map {"id" "1", "language" "English"})
(def french-map  {"id" "2", "language" :fr})
(def spanish-map {"id" "3", "language" "Spanish"})

(defn hello3
  ([] "Hello World")
  ([name] (str "Hello " name)))

(defn add [a b]
  (+ a b))

(defn -main []
  (println "Hello, Clojure!")
  (println (hello3 "Jake"))
  ;;(println (add "Jake", 1))
  (println   (add 3 4))
  ;;(println (add "3" 4))
  (println  (multimethods/greeting english-map))
  (println (multimethods/greeting french-map))
  (println (multimethods/greeting spanish-map))

  ;; typed multimethods
  ;;(println (multimethodstyped/process-value 42))

  ;; HMap
  (map multimethods/greeting [:en :fr :bocce]))

;; Аннотируем тип функции
(t/ann greetings [String (t/Union nil Integer) -> String])

(defn greetings [n i]
  (str "Hello, " (when i (apply str (repeat i "hello, "))) n "!"))

;; Примеры использования
(println (greetings "Donald" 2))  ;; => "Hello, hello, hello, Donald!"
(println (greetings "Grace" nil)) ;; => "Hello, Grace!"
