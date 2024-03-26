import java.time.LocalDate


class employe {
    var Matricule : Double = 0.0
    var Nom : String = ""
    var Prenom : String = ""
    var AnneeEmbauche : Int = 0
    var Salaire : Double= 0.0

    constructor()

    constructor(matricule : Double, nom : String,
                prenom : String, anneeEmbauch : Int, salaire : Double){
        this.Matricule = matricule
        this.Nom = nom
        this.Prenom = prenom
        this.AnneeEmbauche = anneeEmbauch
        this.Salaire = salaire
    }

    fun anciennete() : Int{
        var annee2024 = LocalDate.now().year
        annee2024 -= this.AnneeEmbauche
        return annee2024
    }

    fun AugmentationDuSalaire() : Double{
        var Salaires : Double = this.Salaire
        if (this.AnneeEmbauche < 5){
            Salaires *= 1.02
        }else if (this.AnneeEmbauche < 10){
            Salaires *= 1.05
        }else{
            Salaires *= 1.10
        }
        return Salaires
    }

    override fun toString(): String {
        return "Location(Matricule='$Matricule', Nom='$Nom', Prenom=$Prenom, Annee Embauche=$AnneeEmbauche, Salaire = $Salaire)"
    }
}