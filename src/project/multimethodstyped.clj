
(ns project.multimethodstyped
  {:lang :core.typed}
  (:require [clojure.core.typed :as t]))

;; (t/ann f [t/Any :-> t/Int])
;; (defn f [x]
;;   (t/cast t/Int x))

;;Value-based dispatch

;; (t/defmulti process-value (fn [x] (class x)))

;; ;; Определяем методы с типами для разных типов данных
;; (t/defmethod process-value java.lang.Integer [x :t/Int] -> t/Str
;;   (str "Integer: " x))

;; (t/defmethod process-value java.lang.String [x :t/Str] -> t/Str
;;   (str "String: " x))

;; (t/defmethod process-value :default [x :t/Any] -> t/Str
;;   (str "Unknown type: " x))