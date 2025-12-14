/* Demandez à l’usager d’entrer trois nombres entiers. Déterminez si un des nombres est la somme des deux autres.  Si tel est le cas, affichez la somme correspondante. Sinon, affichez « aucune somme possible! ».*/

void main() {
    // Variables et collecte des données
    String saisie = IO.readln("Entrez le premier nombre entier: ");
    int saisieConvertie1 = Integer.parseInt(saisie);

    saisie = IO.readln("Entrez le deuxième nombre entier: ");
    int saisieConvertie2 = Integer.parseInt(saisie);

    saisie = IO.readln("Entrez le troisième nombre entier: ");
    int saisieConvertie3 = Integer.parseInt(saisie);

    // Traitement des données
        if(saisieConvertie1 == saisieConvertie2 + saisieConvertie3) {
            IO.println(saisieConvertie2 + " + " + saisieConvertie3 + " = " + saisieConvertie1);
        } else if(saisieConvertie2 == saisieConvertie1 + saisieConvertie3) {
            IO.println(saisieConvertie1 + " + " + saisieConvertie3 + " = " + saisieConvertie2);
        } else if (saisieConvertie3 == saisieConvertie1 + saisieConvertie2) {
            IO.println(saisieConvertie1 + " + " + saisieConvertie2 + " = " + saisieConvertie3);
        } else {
            IO.println("Aucune somme possible!");
        }
}