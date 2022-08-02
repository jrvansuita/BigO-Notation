class TempoLogaritmico {
    //O(log n)
    //Essa complexidade de tempo é bastante rápida
    //Os exemplos mais comuns são operações em árvores binárias ou a famosa busca binária em coleções ordenadas

    fun sample() {
        binarySearch(arrayOf(1,2,3,4,5,6,7,8,9), 4)
    }

    fun binarySearch(arr: Array<Int>, value: Int): Boolean {
        var last = arr.size - 1
        var first = 0
        var current = 0

        while (first <= last) {

            current = (first + last) / 2

            if (value > arr[current]) {
                first = current+1
            }else if(value < arr[current]){
                last = current-1
            }else if (arr[current] == value){
                return true
            }
        }
        return false
    }


}