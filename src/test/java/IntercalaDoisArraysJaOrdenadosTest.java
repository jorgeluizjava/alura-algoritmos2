import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class IntercalaDoisArraysJaOrdenadosTest {

    @Test
    public void deveIntercalarDoisArraysJaOrdenados() {
        Nota[] notas1 = {
                new Nota("jonas", 3),
                new Nota("andre", 4),
                new Nota("mariana", 5),
                new Nota("juliana", 6.7)
        };

        Nota[] notas2 = {
                new Nota("guilherme", 7),
                new Nota("carlos", 8.5),
                new Nota("paulo", 9),
                new Nota("andre", 9.3),
                new Nota("ana", 10)
        };

        IntercaladorDeArraysJaOrdenados intercalador = new IntercaladorDeArraysJaOrdenados();
        Nota[] notasIntercaladas = intercalador.intercala(notas1, notas2);

        assertThat(notasIntercaladas.length, is(equalTo(9)));

        assertThat(notasIntercaladas[0].getValor(), is(equalTo(3d)));
        assertThat(notasIntercaladas[1].getValor(), is(equalTo(4d)));
        assertThat(notasIntercaladas[2].getValor(), is(equalTo(5d)));
        assertThat(notasIntercaladas[3].getValor(), is(equalTo(6.7d)));
        assertThat(notasIntercaladas[4].getValor(), is(equalTo(7d)));
        assertThat(notasIntercaladas[5].getValor(), is(equalTo(8.5d)));
        assertThat(notasIntercaladas[6].getValor(), is(equalTo(9d)));
        assertThat(notasIntercaladas[7].getValor(), is(equalTo(9.3d)));
        assertThat(notasIntercaladas[8].getValor(), is(equalTo(10d)));
    }

}
