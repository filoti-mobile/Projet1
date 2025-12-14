/*
Calculez et affichez le résultat de la somme suivante :  i = 1 ... 20∑i*i */

void main() {
    int cumulateur = 0;
    for (int i = 1; i <=20 ; i++) {
        cumulateur += i*i;
    }

    IO.println("Le résultat de la somme est: " + cumulateur);
}