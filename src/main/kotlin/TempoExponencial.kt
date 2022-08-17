class TempoExponencial {

    //O(2^n)
    //Algoritmos de tempo exponencial geralmente indicam um algoritmo que não escala nada bem
    //Isso significa que, um algoritmo de tempo exponencial atinge 1 milhão de interações com uma entrada de tamanho 20


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
