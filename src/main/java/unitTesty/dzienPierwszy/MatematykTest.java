package unitTesty.dzienPierwszy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatematykTest {

    private Matematyk matematyk;

    @Before
    public void setUp() {
        this.matematyk = new Matematyk();
    }


    @Test
    public void shouldWorkFineForMinus() {
        // given

        // when
        int result = matematyk.wartoscBezwzgledna(-1);

        // then
        assertEquals(1, result);
    }



    @Test
    public void shouldWorkFineForZero() {
        // given

        // when
        int result = matematyk.wartoscBezwzgledna(0);

        // then
        assertEquals(0, result);
    }

    @Test
    public void shouldWorkFineForPlus() {
        // given

        // when
        int result = matematyk.wartoscBezwzgledna(99);

        // then
        assertEquals(99, result);
    }

}