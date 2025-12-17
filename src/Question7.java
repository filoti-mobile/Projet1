/* Demandez à l’usager d’entrer une phrase. Ensuite, déterminez et affichez le nombre  de voyelles (a, o, u, i, e ou y) dans la phrase.*/

void main() {
    // Variables et collecte des données
    String saisie = IO.readln("Entrez une phrase: ");
    int nombreDeVoyelles = 0;
    for (int i = 0; i < saisie.length(); i++) {
        char lettreCourante = saisie.charAt(i);

        switch (lettreCourante) { // a, o, u, i, e ou y sans oublier les voyelles en majuscule
            case 'a':
            case 'o':
            case 'u':
            case 'i':
            case 'e':
            case 'y':
            case 'A':
            case 'O':
            case 'U':
            case 'I':
            case 'E':
            case 'Y':
                nombreDeVoyelles++;
                break;
            default:
                break;
        }
    }

    IO.println("Nombre de voyelles: " + nombreDeVoyelles);
}