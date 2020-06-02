(defproject cortex-tutorial "0.1-SNAPSHOT"
  :plugins [[org.clojars.benfb/lein-gorilla "0.6.0"]]
  :aliases {"notebook" ["gorilla" ":ip" "0.0.0.0" ":port" "10001"]}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [thinktopic/experiment "0.9.22"]])

