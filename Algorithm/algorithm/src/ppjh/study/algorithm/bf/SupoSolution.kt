package com.kotlin.example.algo

/**
 * 200730 complete
 */
class SupoSolution {
    val supo1 = intArrayOf(1,2,3,4,5)
    val supo2 = intArrayOf(2,1,2,3,2,4,2,5)
    val supo3 = intArrayOf(3,3,1,1,2,2,4,4,5,5)

    fun solution(answers: IntArray): IntArray {
        var cnt1=0
        var cnt2=0
        var cnt3=0

        val answer = intArrayOf().toMutableList()

        var idx=0
        while(idx<answers.size) {
            if(answers[idx] == supo1[idx%supo1.size]) {
                cnt1++
            }
            if(answers[idx] == supo2[idx%supo2.size]) {
                cnt2++
            }
            if(answers[idx] == supo3[idx%supo3.size]) {
                cnt3++
            }
            idx++
        }

        if(cnt1 > cnt2) {
            if(cnt1 > cnt3) {
                answer.add(1)
            } else if(cnt1 < cnt3) {
                answer.add(3)
            } else {
                answer.add(1)
                answer.add(3)
            }
        } else if(cnt1 == cnt2) {
            if(cnt1 > cnt3) {
                answer.add(1)
                answer.add(2)
            } else if(cnt1 < cnt3) {
                answer.add(3)
            } else {
                answer.add(1)
                answer.add(2)
                answer.add(3)
            }
        } else if(cnt1 < cnt2) {
            if(cnt2 > cnt3) {
                answer.add(2)
            } else if(cnt2 == cnt3) {
                answer.add(2)
                answer.add(3)
            } else {
                answer.add(3)
            }
        }

        return answer.toIntArray()
    }
}