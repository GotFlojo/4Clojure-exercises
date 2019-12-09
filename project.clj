(defproject problems-4clj "0.1.0-SNAPSHOT"
  :description "Problems from 4clojure"
  :url "http://www.4clojure.com/"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [pjstadig/humane-test-output "0.10.0"]]
  :injections [(require 'pjstadig.humane-test-output)
               (pjstadig.humane-test-output/activate!)]
  :dev-dependencies [[lein-fore-prob "0.1.3"]]
  :plugins [[lein-fore-prob "0.1.3"]
            [lein-auto "0.1.3"]
            [lein-ancient "0.6.15"]
            [lein-kibit "0.1.8"]
            [jonase/eastwood "0.3.5"]]
  :repl-options {:init-ns problems-4clj.core})
