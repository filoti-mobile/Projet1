/* ander à l’usager d’entrer un nombre supérieur ou égal à 2 (redemander indéfiniment, au besoin). Ensuite, afficher la forme suivante, avec le nombre de lignes égal au nombre entré par l’usager. */

void main() {
    // Variables et collecte des données
    String saisie = IO.readln("Entrez le nombre de lignes supérieur à 2: ");
    int saisieConvertie = Integer.parseInt(saisie);

    // Traitement des données
    while (saisieConvertie < 2) {
        saisie = IO.readln("Entrez le nombre de lignes supérieur à 2: ");
        saisieConvertie = Integer.parseInt(saisie);
    }

    for (int i = 1; i <= saisieConvertie; i++) { // saisieConvertie est le nombre de colones
        for (int j = 1; j <= i; j++) { // rangées doivent être inférieurs ou égales à la saisieConvertie
            if(j < 10) { // 123456789
                IO.print(j);
            } else {        // 12345678901234567890 à la place de 123456789DIXONZEDOUZE
                IO.print(j % 10);
            }
        }

        IO.println();
    }

    /*          j
                1
                12
                123
                1234
                12345


IO.print(i);
        IO.println(); // col < 2

        IO.print(1);
        IO.print(2); // col = 2
        IO.println();

        IO.print(1);
        IO.print(2); // col = 2
        IO.print(3); // col = 3 (saisieConvertie)
        IO.println();

        IO.print(1);
        IO.print(2); // col = 2
        IO.print(3); // col = 3
        IO.print(4); // col = 4 (saisieConvertie)
        IO.println();

        IO.println();

                IO.print(1);
        IO.println(); // col < 2

        IO.print(1);
        IO.print(2); // col = 2
        IO.println();

        IO.print(1);
        IO.print(2); // col = 2
        IO.print(3); // col = 3 (saisieConvertie)
        IO.println();

        IO.print(1);
        IO.print(2); // col = 2
        IO.print(3); // col = 3
        IO.print(4); // col = 4 (saisieConvertie)
        IO.println();

        IO.println();

     */



}