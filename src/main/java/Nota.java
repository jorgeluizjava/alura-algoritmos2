public class Nota {

    private final String nome;
    private final double valor;

    public Nota(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
