fun main() {
    //val nums = listOf(1,2,3,3,4,5,6,6,6)
    val nums = listOf<Int>(1,1,2,2)
    myMethod(nums)
    otherMethod(nums)
    otherMethod2(nums)
}


fun otherMethod2(data: List<Int>){
    val s = data.maxByOrNull { it } ?: -1

    println(s)
}


fun otherMethod(data: List<Int>){
    val s = data.groupingBy { it }.eachCount().maxByOrNull { it.value }

    println(s?.key ?: -1)
}

fun myMethod(data: List<Int>){
    val sums = mutableMapOf<Int, Int>()

    data.forEach {  i ->
        sums[i] = (sums[i] ?: 0) + 1
    }

    val witch = sums.toList().maxByOrNull { it.second }?.first

    println(witch?: -1)

}