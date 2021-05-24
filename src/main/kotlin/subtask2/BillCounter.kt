package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum = bill.sum()
        var res = (sum - bill[k]) / 2
        if (res == b)
            return "Bon Appetit"
        else
            return (b - res).toString()
    }
}
