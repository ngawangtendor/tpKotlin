class Voiture {
    var marque : String = ""
    var modele : String = ""
    var vitesse : Int = 0


    constructor(marque: String, modele: String, vitesse: Int) {
        this.marque = marque
        this.modele = modele
        this.vitesse = vitesse
    }

    constructor(marque: String, modele: String) {
        this.marque = marque
        this.modele = modele
    }

    constructor()


    fun accelerer(vitesse: Int) {
        this.vitesse += vitesse
    }

    fun ralentir(vitesse: Int) {
        this.vitesse -= vitesse
    }
    fun actuelleVitesse() : String {
        return "la vitesse actuelle est de ${this.vitesse}"
    }

    override fun toString(): String {
        return "Voiture(marque='$marque', modele='$modele', vitesse=$vitesse)"
    }
}
