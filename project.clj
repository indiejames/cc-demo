(defproject cc-demo "0.1.0-SNAPSHOT"
  :description "Demo project for the Clojure Code Visual Studio Code extension"
  :url "https://github.com/indiejames/cc-demo"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1"]
                 [ring/ring-core "1.5.0"]
                 [ring/ring-defaults "0.2.1"]
                 [ring/ring-jetty-adapter "1.5.0"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler cc-demo.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})
