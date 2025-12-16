void main() {
    int nombreSecret; // Nombre à deviner
    int saisieConvertie; // Saisie de l'utilisateur
    int min = 0; // à tracker quand c'est le BOT qui devine | choix 0
    int max = 99; // à tracker quand c'est le BOT qui devine  | choix 0
    int tentative = 1; // compte les tentatives que le BOT et l' HUMAIN ont devinés
    IO.println("Qui devine?"); // Choisir le mode de jeu | 0:BOT ou 1:HUMAIN
    String modeDeJeu = IO.readln("0=Bot, 1=Humain ou défault ");
    if (modeDeJeu.equals("0")) {
        IO.println("--------- BOT DEVINE -----------");
        nombreSecret = Integer.parseInt(IO.readln("Entrez votre nombre secret entre " + min + " et " + max + " "));
        // BOT DEVINE MAINTENANT
        int botDevinette = (int) (Math.random() * (max - min + 1)) + min; // 1ère fois BOT DEVINE
        IO.println("BOT a deviné: " + botDevinette); // EN ATTENTE DE VOTRE RÉACTION...
        IO.println("w: Plus haut, s: Plus bas"); // UTILISATEUR RÉAGIT

        while (botDevinette != nombreSecret) {
            String action = IO.readln();
            if (action.equals("w") || action.equals("W")) { // w ou W >>> plus haut
                min = botDevinette + 1;
                IO.println("Plus haut");
            } else if (action.equals("s") || action.equals("S")) { // s ou S >>> plus bas
                max = botDevinette - 1;
                IO.println("Plus bas");
            }
            tentative++;
            // BOT DEVINE ENCORE
            botDevinette = (int) (Math.random() * (max - min + 1)) + min; // ASSURE QUE LE BOT NE DEVINE PAS LE MÊME NOMBRE QU'AVANT
            IO.println("BOT a deviné: " + botDevinette); // EN ATTENTE DE VOTRE RÉACTION...
            IO.println("w: Plus haut, s: Plus bas"); // UTILISATEUR RÉAGIT
        }
        IO.println("Bravo! Vous avez trouvé le nombre en " + tentative + " essais");
    } else {
        IO.println("--------- HUMAIN DEVINE -----------");
        nombreSecret = (int) (Math.random() * (max - min + 1)) + min; //
        String saisie = IO.readln("Entrez un nombre entre " + min + " et " + max + ": ");
        saisieConvertie = Integer.parseInt(saisie);
        while (saisieConvertie != nombreSecret) {
            tentative++;
            if (saisieConvertie < nombreSecret) {
                IO.println("Plus haut !");
                saisie = IO.readln("Entrez un nombre entre " + min + " et " + max + ": ");
                saisieConvertie = Integer.parseInt(saisie);
            } else {
                IO.println("Plus bas !");
                saisie = IO.readln("Entrez un nombre entre " + min + " et " + max + ": ");
                saisieConvertie = Integer.parseInt(saisie);
            }
        }

        IO.println("Bravo! Vous avez trouvé le nombre en " + tentative + " essais");
    }
}