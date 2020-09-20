import com.thoughtworks.qdox.model.expression.Not;

public class Intercalador {


    public void intercala(Nota[] notas, int inicio, int meio, int termino) {

        Nota[] notasIntercaladas = new Nota[termino - inicio];

        int atual = 0;
        int atual1 = inicio;
        int atual2 = meio;

        while (atual1 < meio && atual2 < termino) {
            Nota nota1 = notas[atual1];
            Nota nota2 = notas[atual2];
            if (nota1.getValor() < nota2.getValor()) {
                notasIntercaladas[atual] = nota1;
                atual1++;
            } else {
                notasIntercaladas[atual] = nota2;
                atual2++;
            }
            atual++;
        }

        while (atual1 < meio) {
            Nota nota = notas[atual1];
            notasIntercaladas[atual] = nota;
            atual1++;
            atual++;
        }
        while (atual2 < termino) {
            Nota nota = notas[atual2];
            notasIntercaladas[atual] = nota;
            atual2++;
            atual++;
        }

        for (int i = 0; i < notasIntercaladas.length; i++) {
            notas[i + inicio] = notasIntercaladas[i];
        }
    }
}
