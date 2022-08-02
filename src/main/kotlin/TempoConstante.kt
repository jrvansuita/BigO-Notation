class TempoConstante  {

    //O(1)
    //Algoritmos de tempo constante não alteram o tempo de execução, independente do tamanho da entrada.


    //Leitura de uma posiçao, gravação em uma posição, verificação em uma posição/
    //Todos são exemplos de Tempo Constante 0(1)

    fun sample(){
        val arr = mutableListOf<Int>(1,2,3,4)
        //Exemplos de tempo constante:
        arr.get(2)
        arr.set(2,0)
        arr.contains(3)
        arr.first()
    }

}