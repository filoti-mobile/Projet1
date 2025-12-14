/* Demandez à l’usager d’entrer un nombre entier. Ensuite, calculez la somme de tous les chiffres de ce nombre et affichez le résultat. */

void main() {
    // Variables et collecte des données
    String saisie = IO.readln("Entrez un nombre entier: ");
    int saisieConvertie = Math.abs(Integer.parseInt(saisie)); // valeur absolue pour éliminer le signe - si le nombre saisi est négatif


    // Traitement des données
    int cumul = 0;
    for (int i = 0; i < saisie.length(); i++) {
        int valeurExtraite = saisieConvertie % 10; // 5361 >>> 1 | 536 >>> 6 | 53 >>> 3 | 5 >>> 0
        saisieConvertie = saisieConvertie / 10; // 5361 >>> 536 >>> 53 >>> 5
        cumul += valeurExtraite; //

    }

    IO.println("La somme des chiffres est: " + cumul);
}