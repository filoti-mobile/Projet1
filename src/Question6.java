/* Demandez à l’usager d’entrer un  temps  en  secondes. Ensuite, affichez  les  nombres d’heures,  de minutes  et de secondes correspondants. */

void main() {
    // Variables et collecte des données
    String saisie = IO.readln("Entrez un nombre de secondes: ");
    int saisieConvertie = Integer.parseInt(saisie);

    // Traitement des données
    int heure = saisieConvertie / 3600; // h = 3600s
    int minute = (saisieConvertie - heure * 3600) / 60; // le reste de secondes après extraction du nombre d'heures en secondes divisé par 60 parceque 1m = 60s
    int seconde = (saisieConvertie - heure * 3600 - minute * 60); // même chose pour affecter ce qui reste de secondes à la variable "seconde"

    IO.println(saisieConvertie + "s" + " = " + heure + "h + " + minute + "m + " + seconde + "s");


}