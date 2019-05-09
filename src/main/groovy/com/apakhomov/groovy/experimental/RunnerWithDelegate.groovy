package com.apakhomov.groovy.experimental

class MyDelegate {
    def saySomething(String str) {
        println str
    }
}

class Runner {
    def run(obj, Closure cl) {
        cl.delegate = obj
        cl()
    }
}

def runner = new Runner()
runner.run(new MyDelegate()) {
    saySomething("sfsfd") //fixme
}

foo("sfsdf")