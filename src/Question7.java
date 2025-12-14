/* Demandez à l’usager d’entrer une phrase. Ensuite, déterminez et affichez le nombre  de voyelles (a, o, u, i, e ou y) dans la phrase.*/

void main() {
    // Variables et collecte des données
    String saisie = IO.readln("Entrez une phrase: ");
    int nombreDeVoyelles = 0;
    for (int i = 0; i < saisie.length(); i++) {
        char lettreCourante = saisie.toLowerCase().charAt(i); // convertir saisie en minuscule sinon faut ajouter les cas des voyelles en majuscule

        switch (lettreCourante) { // a, o, u, i, e ou y
            case 'a':
            case 'o':
            case 'u':
            case 'i':
            case 'e':
            case 'y':
                nombreDeVoyelles++;
                break;
            default:
                break;
        }
    }

    IO.println("Nombre de voyelles: " + nombreDeVoyelles);
}