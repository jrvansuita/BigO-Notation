# Big-O Notation Study
Complexidade de tempo de um algoritmo.


### Unidade de Trabalho (Unit of Work)
O padrão Unit of Work pode ser visto como um contexto, sessão ou objeto que acompanha as alterações das entidades de negócio durante uma transação sendo também responsável pelo gerenciamento dos problemas de concorrência que podem ocorrer oriundos dessa transação.

### Complexidade de  Algoritmo
<details open><summary><b> Tempo Constante O(1) </b></summary>

> _Leitura de uma posiçao, gravação em uma posição, verificação em uma posição em uma array por exemplo_

```kotlin
val arr = mutableListOf<Int>(1,2,3,4)

arr.get(2)
arr.set(2,0)
arr.contains(3)
arr.first()
```    
</details>



<details open><summary><b> Tempo Linear O(n) </b></summary>

> _Algoritmos com complexidade de tempo linear executam a operação fundamental praticamente a mesma quantidade de vezes que o tamanho de sua entrada._

```kotlin
mutableListOf("d","3","4","4").forEach {  }

for (i in arr.indices){
    arr[i] += "d"
}
```    
</details>|

<details open><summary><b> Tempo Quadrático O(n²) </b></summary>

> _Esses algoritmos geralmente envolvem percorrer uma coleção inteira para cada elemento de coleção._

```kotlin
val arr1 = mutableListOf("d", "3", "4", "4")
val arr2 = mutableListOf("d", "3", "4", "4")

arr1.forEach { i ->
    arr2.forEach { j ->

    }
}
```    
</details>

<details open><summary><b> Tempo Exponencial O(2^n) </b></summary>

> _Algoritmos que recursivos, exponenciais ou fatoriais._

```kotlin
private fun exponential(num: Int): Int {
  return if (num <= 1) {
      num
  } else {
      exponential(num-1) + exponential(num-1)
  }
}
```    
</details>

<details open><summary><b> Tempo Logaritmico O(log n) </b></summary>

> _Operações em árvores binárias, geralmente algoritmos com esta complexidade cortam o tamanho do problema pela metade até chegar à solução._

```kotlin
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
```    
</details>


### References

- Khanacademy [@khanacademy.org](https://pt.khanacademy.org/computing/computer-science/algorithms/asymptotic-notation/a/big-o-notation)
- girlie_mac [@girlie_mac](https://twitter.com/girlie_mac/status/1229353683089068032/photo/1)


