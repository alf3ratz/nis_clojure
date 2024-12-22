(ns project.multimethods)

(defmulti greeting
  (fn [x] (get x "language")))

(class :fr)

(defmethod greeting "English" [params]
  "Hello!")

(defmethod greeting :fr [params]
  "Bonjour!")

(defmethod greeting :default [params]
  (throw (IllegalArgumentException.
          (str "I don't know the " (get params "language") " language"))))

