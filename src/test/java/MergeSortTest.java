import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MergeSortTest {

    @Test
    public void deveOrdenarUmArray() {

        Nota[] notas = {
                new Nota("mariana", 5),
                new Nota("carlos", 8.5),
                new Nota("paulo", 9),
                new Nota("juliana", 6.7),
                new Nota("guilherme", 7),
                new Nota("jonas", 3),
                new Nota("ana", 10),
                new Nota("andre", 4),
                new Nota("joao", 9.3)
        };

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(notas, 0, notas.length);

        assertThat(notas.length, is(equalTo(9)));

        assertThat(notas[0].getValor(), is(equalTo(3d)));
        assertThat(notas[1].getValor(), is(equalTo(4d)));
        assertThat(notas[2].getValor(), is(equalTo(5d)));
        assertThat(notas[3].getValor(), is(equalTo(6.7d)));
        assertThat(notas[4].getValor(), is(equalTo(7d)));
        assertThat(notas[5].getValor(), is(equalTo(8.5d)));
        assertThat(notas[6].getValor(), is(equalTo(9d)));
        assertThat(notas[7].getValor(), is(equalTo(9.3d)));
        assertThat(notas[8].getValor(), is(equalTo(10d)));
    }
}
