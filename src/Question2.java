/* Demandez à l’usager d’entrer des nombres entiers appartenant à l’intervalle [0,100]. Pour chaque nombre lu, le programme doit afficher si la valeur entrée est paire ou impaire. Le programme s’arrête lorsque l’usager entre une valeur erronée, en affichant « FIN. ». */

void main() {
    int saisieConvertie;
    do {
        String saisie = IO.readln("Entrez un nombre entre 0 et 100: ");
        saisieConvertie = Integer.parseInt(saisie);
        if(saisieConvertie % 2 == 0) {
            IO.println("Ce nombre est pair.");
        } else {
            IO.println("Ce nombre est impair.");
        }
    } while (saisieConvertie >= 0 && saisieConvertie <= 100);

    IO.println("FIN");

}