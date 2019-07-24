(defproject clj-commons/fs "1.5.2-SNAPSHOT"
  :description "File system utilities for clojure"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :url "https://github.com/clj-commons/fs"
  :plugins [[lein-midje "3.1.3"]
            [codox "0.8.10"]]
  :codox {
          :src-dir-uri "https://github.com/clj-commons/fs/blob/master/"
          :src-linenum-anchor-prefix "L"
          :defaults {
                     :doc/format :markdown}}
  :profiles {
             :set-version {
                           :plugins [[lein-set-version "0.4.1"]]}})
