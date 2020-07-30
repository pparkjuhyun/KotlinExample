package com.kotlin.example.algo

class SpySolution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 0

        val category: Array<String> = emptyArray()

        for(item in clothes) {
            for(citem in category) {
                if(citem == item[1])
                    break
            }
        }

        return answer
    }
}