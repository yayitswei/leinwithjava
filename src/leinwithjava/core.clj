(ns leinwithjava.core
  (:import [main.java TestClass]))

(defn -main [& args]
  (println "Hello world!")
  (TestClass.))
