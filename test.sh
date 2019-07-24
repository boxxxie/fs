#! /bin/sh

clj -Atest -e "(require 'midje.repl) (-> (midje.repl/load-facts) :failures (min 255) (System/exit))"
