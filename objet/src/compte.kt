class compte {
    var SoldeInitial :Double = 0.0

    constructor()

    constructor(SoldeInitials : Double){
        this.SoldeInitial = SoldeInitials
    }

    fun getBalance() : Double {
        var soldeactuelle :Double= SoldeInitial
        return soldeactuelle
    }
    fun deposer(montant : Double){
        this.SoldeInitial += montant
    }
    fun retirer(montant: Double){
        this.SoldeInitial -= montant
    }
    fun Interet(interetValeur: Double): Double{
        var total = this.SoldeInitial * (1 + interetValeur)
        return total
    }

}