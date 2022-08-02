class TempoExponencial {

    //O(2^n)
    //Esses algoritmos geralmente envolvem percorrer uma coleção inteira
    // para cada elemento da coleção.

    fun sample() {
        //Esse metodo chama ele mesmo
        exponential(44)
    }

    private fun exponential(num: Int): Int {
        return if (num <= 1) {
            num
        } else {
            exponential(num-1) + exponential(num-1)
        }
    }


}
