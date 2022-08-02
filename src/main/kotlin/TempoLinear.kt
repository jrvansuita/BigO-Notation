class TempoLinear {

    //O(n)
    //Algoritmos com complexidade de tempo linear executam a operação fundamental
    // praticamente a mesma quantidade de vezes que o tamanho de sua entrada.

    fun sample(){
        val arr = mutableListOf("d","3","4","4")

        //Exemplos de tempo Linear:
        arr.forEach {  }

        for (i in arr.indices){
            arr[i] += "d"
        }

        println(arr)
    }


}