/* Demandez à l’usager d’entrer un nombre entier. S’il est inférieur ou égal à 1, affichez un message d’erreur. Sinon, déterminez et affichez tous les diviseurs de ce nombre.*/

void main() {
    // Variables et collecte des données
    String saisie = IO.readln("Entrez un nombre positif: ");
    int saisieConvertie = Integer.parseInt(saisie);

    // Traitement
    if(saisieConvertie <= 1) {
        IO.println("Erreur!");
    } else {
        int compteur = 1;
        IO.println("Les diviseurs de " + saisieConvertie + " sont: ");
        while (compteur <= saisieConvertie) {
            if (saisieConvertie % compteur == 0) {
                IO.println(compteur);
            }

            compteur++;
        }

    }
}