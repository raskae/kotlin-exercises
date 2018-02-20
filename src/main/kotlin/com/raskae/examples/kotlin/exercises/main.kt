package com.raskae.examples.kotlin.exercises

fun main(args: Array<String>) {

    //fizzBooz(100)
    print(isPrimeNumber(2))
}

fun isPrimeNumber(number: Int): Boolean {

    var isPrime: Boolean = false
    for (index in 2..number) {
        if (number % index == 0) {
            isPrime = true
            break
        }
    }

    return isPrime
}

fun fizzBooz(limit: Int) {

    var counts: MutableMap<String, Int> = mutableMapOf()

    counts.put("fizzBuzzWooz", 1)
    for (index in 1..limit) {

        when {
            index % 3 == 0 && index % 5 == 0 && index % 7 == 0 -> {
                println("$index : fizzBuzzWooz"); }
            index % 3 == 0 && index % 5 == 0 -> println("$index : fizzbuzz")
            index % 3 == 0 && index % 7 == 0 -> println("$index : fizzwozz")
            index % 5 == 0 && index % 7 == 0 -> println("$index : buzzwozz")
            index % 3 == 0 -> println("$index : fizz")
            index % 5 == 0 -> println("$index : buzz")
            index % 7 == 0 -> println("$index : wooz")
        }
    }

    println(counts)
}