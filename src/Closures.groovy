// Closures

def myClosure = {
    println "In a closure"
    println new Date()
}

for(i in 1..3){
    myClosure()
    sleep(1000)
}


(1..3).each({myClosure()})

(1..3).each({
    println "In a closure: $it"
})

//Override default it var in closure

(1..3).each({ number ->
    println "In a closure: $number"
})

//findAll
(1..10).findAll({it%2 == 0}).each({println "In a closure $it"})