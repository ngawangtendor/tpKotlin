class Nombre {
    var nb1 : Int = 0


    constructor(nb1 : Int){
        this.nb1 = nb1
    }

    constructor(){
    }

    fun diviseur() : List<Int>{
        var diviseurs = mutableListOf<Int>()
        for (i in nb1 downTo 1){
            if (nb1 % i == 0){
                diviseurs.add(i)
            }
        }
        return diviseurs
    }

    fun estPremier() : Boolean{
        if (this.diviseur().size == 2){
            return true
        }else{
            return false
        }
    }

    fun sommeChiffre(): Int{
        var somme = 0
        var divi = this.nb1

        while (divi != 0){
            somme += divi % 10
            divi /= 10
        }
        return somme
    }

    fun nombresAmis(nb2 : Nombre): Boolean = if ( this.sommeChiffre() ==
        nb2.sommeChiffre()) true else false


    override fun toString(): String {
        return "nombre $nb1"
    }
}