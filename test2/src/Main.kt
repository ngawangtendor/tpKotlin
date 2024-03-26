//exo 2.3
/*fun main() {
    val entiers = mutableListOf<Int>()
    for(i in 1..10){
        entiers.add( (1..100).random())
    }

    val entierPaire = mutableListOf<Int>()
    for (element in entiers){
        if (element % 2 == 0){
            entierPaire.add(element)
        }
    }
    println(entierPaire)

}
*/

// Création d'un map :

fun main(){
val ff= mapOf(0 to "Zero", 1 to "Une", 2 to "Deux", 3 to "Trois")

for (chiffre in ff){
    println(chiffre.key)
    println(chiffre.value)
}
}

