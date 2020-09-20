public class MergeSort {

    private Intercalador intercalador;

    public MergeSort() {
        this.intercalador = new Intercalador();
    }

    public void sort(Nota[] notas, int inicio, int termino) {

        int quantidade = termino - inicio;
        if (quantidade > 1) {
            int meio = (inicio + termino) / 2;
            sort(notas, inicio, meio);
            sort(notas, meio, termino);
            intercalador.intercala(notas, inicio, meio, termino);
        }
    }
}
