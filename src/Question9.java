/* On considère un circuit de n résistances en parallèle. La valeur de la résistante équivalente est obtenue grâce à la formule suivante : */

void main() {
    // Variables et collecte des données
    IO.print("Entrez le nombre de résistances: ");
    Scanner scanner = new Scanner(System.in);
    int saisieConvertie = scanner.nextInt();

    // Traitement des données
    double resistanceEquivalente;
    double cumulDesValeursInversees = 0; // si utilisée à l'interieur du bloc for, il faut initialiser pour calmer le compilateur
    IO.println("Entrez les valeurs des " + saisieConvertie + " résistances: ");
    for (int i = 0; i < saisieConvertie; i++) {
        double r = scanner.nextDouble();
        double valeurInversee = 1.0 / r;    // inverser les valeurs des résistances
        cumulDesValeursInversees += valeurInversee; // faire la somme des valeurs inversées

    }

    resistanceEquivalente = 1.0 / cumulDesValeursInversees;

    // Afficher resistanceEquivalente formatée à une précision de 2 décimaux
    IO.println(String.format("La valeur de la résistance équivalente est " + "%,.2f", resistanceEquivalente));

}