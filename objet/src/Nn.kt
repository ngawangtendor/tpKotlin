class Patient {

    var nom : String = ""
    var taille : Double = 0.0
    var poids : Double  = 0.0

    constructor(nom : String, taille : Double, poids : Double){
        this.nom = nom
        this.taille = taille
        this.poids = poids
    }

    constructor(){
    }

    fun IMC() : Double{
        var dhikash : Double = this.poids / (this.taille * this.taille)

        return dhikash
    }
    fun affiche() : String {
        var nice : String = ""
        if (this.IMC() < 18.5){
            nice = "Poids inférieur à la normale"
        }else if (this.IMC() < 24.9){
            nice = "Poids normale"
        }else if (this.IMC() < 29.9){
            nice = "Surpoids"
        }else{
            nice ="Obésisé modérée"
        }
        return nice
    }

    override fun toString(): String {
        return "Patient(nom='$nom', taille=$taille, poids=$poids)"
    }


}