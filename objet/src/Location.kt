class Location {
    var nom : String = ""
    var categories : String = ""
    var km : Double = 0.0
    var jour : Int = 0

    constructor(name : String, modeles : String,
                parcourir : Double, Njour : Int){
        this.nom = name
        this.categories = modeles
        this.km = parcourir
        this.jour = Njour
    }

    constructor(){}

    fun montantJour () : Double{
        var a : Double = when(this.categories){
            "E" -> 30.00
            "C" -> 50.00
            "L" -> 75.0
            else -> 00.00
        }
        return a
    }

    fun montantLocation() : Double {
        var b : Double = montantJour() * this.jour
        return b
    }

    fun kmSupplementaire() : Double {
        var c : Double = 0.0
        if(this.km > 100.0 * this.jour){
            c = this.km - 100.0 * this.jour
        } else c = 0.0
        return c
    }

    fun pxKmSupplementaire() : Double = kmSupplementaire() * 0.5

    fun montantTotal(): Double {
        var d : Double = montantLocation() + pxKmSupplementaire()
        return d
    }




}