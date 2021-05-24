package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val localArray: ArrayList<Int> = sadArray.toCollection(ArrayList())
        var counter = 1
        while (counter < localArray.size - 1) {
            if (localArray[counter - 1] + localArray[counter + 1] < localArray[counter]) {
                localArray.removeAt(counter)
                if (counter > 1) counter--
            } else {
                counter++
            }
        }
        return localArray.toIntArray()
    }
}
