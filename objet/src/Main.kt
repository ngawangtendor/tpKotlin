//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
/*
    val v1 = Voiture("Peugeot","308")
    val v2 = Voiture("Volvo","A4",0)

    v2.accelerer(40)
    v1.accelerer(60)
    println(v2.modele)
    println(v2.actuelleVitesse())
    println(v1.vitesse)

    println("bonjour voiture v2 ${v2.vitesse} voiture v1 ${v1.vitesse} ")
*/
    /*val n1 = Nombre(211)
    val n2 = Nombre(1111)
    var personne = Patient("noob", 1.88, 50.0)

    println(n1.diviseur())
    println(n1.estPremier())
    println(n1.sommeChiffre())
    println(n2.sommeChiffre())
    println(n1.nombresAmis(n2))
    personne.IMC()
    println(personne.affiche())
    println(personne.IMC())
*/
    var momo = Location("Peugeot", "L", 110.00,3)
    print(momo.montantTotal())

    var noop = compte(300.0)
    println(noop.Interet(12.2))

    println("saisire votre matricule ")
    var matricule= readln().toDouble()

    println("Saisire votre Nom")
    var nom = readln().toString()

    println("saisir votre Prénom")
    var prenom = readln().toString()

    println("saisir anneeEmbauche ")
    var anneeEmbauche = readln().toInt()

    println("saisire Salaire ")
    var salaire = readln().toDouble()

    var resultat = employe(matricule,nom,prenom,anneeEmbauche,salaire)
    println(resultat.anciennete())

    println(resultat.AugmentationDuSalaire())
    println(resultat)
}




