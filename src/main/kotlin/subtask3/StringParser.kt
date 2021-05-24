package subtask3

import java.util.*

class StringParser {

    fun getResult(inputString: String): Array<String> {

        val intermList = mutableListOf<Pair<Int, Int>>()
        val stack1 = Stack<Int>()
        val stack2 = Stack<Int>()
        val stack3 = Stack<Int>()
        inputString.forEachIndexed { i, char ->
            when (char) {
                '(' -> stack1.add(i)
                '[' -> stack2.add(i)
                '<' -> stack3.add(i)
                ')' -> if (stack1.size > 0) {
                    intermList.add(Pair(stack1.pop() + 1, i))
                }
                ']' -> if (stack2.size > 0) {
                    intermList.add(Pair(stack2.pop() + 1, i))
                }
                '>' -> if (stack3.size > 0) {
                    intermList.add(Pair(stack3.pop() + 1, i))
                }
            }
        }
        intermList.sortBy { pair -> pair.first }
        val resultArray = mutableListOf<String>()
        for (pair in intermList) {
            resultArray.add(inputString.substring(pair.first, pair.second))
        }
        return resultArray.toTypedArray()
    }
}
