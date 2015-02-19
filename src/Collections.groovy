def beatles = ["John", "Paul", "George", "Ringo"]
def greeting = "Hello, "

println ' Single quotes are not interpolated ${2+2}'

for (int i = 0; i < beatles.size(); i++) {
    println "$greeting ${beatles[i]}"
}

for (beatle in beatles){
    println "$greeting $beatle"
}

