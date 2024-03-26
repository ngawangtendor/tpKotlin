fun main(){
    /*val notes = mutableMapOf<String, Int>(
        "Adrien" to 10,"Bertrand" to 15, "Blin" to 8, "Rib" to 6)

    notes.put("salut",6)
    notes.set("Rib",121)

    val naptu = notes.filter { it.value < 10 }
    println(naptu)
    println(notes)
    */

/*
    val notes = mutableMapOf<String,MutableList<Int>>("Adrien" to mutableListOf(15,12,10),
        "Bertrand" to mutableListOf(12,10))

    notes.getOrPut("Toto") { mutableListOf(1,2,54,11) }
    notes.getOrPut("Adrien") { mutableListOf<Int>()}.add(5)


    for (element in notes){
        val moyen = element.value.sum().toDouble() / element.value.size

        if (moyen >= 15){
            println(element.key)
            println(moyen)
        }
    }




    val entiers = mutableListOf<Int>()
    for(i in 1..10){
        entiers.add(i)
    }
    println(entiers)


    fun serie(n : Int) : List<Int> {

        val liste = mutableListOf<Int>()
        for (i in 1..n){
            liste.add(i)
        }
        return liste
    }
*/

fun cool(n: Int): List<Int>{
    val nice = mutableListOf<Int>()
    for (i in n){
        if (i % 2 == 0){
            nice.add(i)
        }

    }
    return nice
}
    println(cool(10))
/*
    fun estPremier(n : Int) : Boolean{
        if (cool(n).size == 2) {
            return true
        }else{
            return false
        }
    }
    println(estPremier(7))

    */
}






