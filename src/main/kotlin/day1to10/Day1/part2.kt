package day1to10.Day1

import java.io.File

fun main() {
    print(File("src/main/kotlin/Day1/input1.txt.txt").readText().split("\r\n\r\n").map{
        it.split("\r\n").map { if(it.isNotEmpty()) it.toInt() else 0 }.sum()
    }.sortedDescending().subList(0,3).sum())
}