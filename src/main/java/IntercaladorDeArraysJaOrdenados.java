public class IntercaladorDeArraysJaOrdenados {

    public Nota[] intercala(Nota[] notas1, Nota[] notas2) {

        Nota[] notas = new Nota[notas1.length + notas2.length];

        int atual1 = 0;
        int atual2 = 0;
        int atual = 0;

        while(atual1 < notas1.length && atual2 < notas2.length) {

            Nota nota1 = notas1[atual1];
            Nota nota2 = notas2[atual2];

            if (nota1.getValor() < nota2.getValor()) {
                notas[atual] = nota1;
                atual1++;
            } else {
                notas[atual] = nota2;
                atual2++;
            }
            atual++;

            while(atual1 < notas1.length) {
                Nota nota = notas1[atual1];
                notas[atual] = nota;
                atual1++;
                atual++;
            }

            while(atual2 < notas2.length) {
                Nota nota = notas2[atual2];
                notas[atual] = nota;
                atual2++;
                atual++;
            }
        }

        return notas;
    }
}
