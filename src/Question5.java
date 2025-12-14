/* Demandez à l’usager d’entrer deux valeurs, a et b. Ensuite, calculez et affichez le résultat de la a b somme suivante : ∑∑ i 1 = = j 1 ( i */

void main() {
    // Variables de collecte des données
    String saisie = IO.readln("Entrez premier nombre entier: ");
    int saisieConvertie1 = Integer.parseInt(saisie);

    saisie = IO.readln("Entrez deuxième nombre entier: ");
    int saisieConvertie2 = Integer.parseInt(saisie);

    // Traitement des données
    for (int i = 1; i <= saisieConvertie1 ; i++) {
        for (int j = 1; j <= saisieConvertie2; j++) {
            IO.println(i + " x " + j + " = " + i * j);
        }
    }
}