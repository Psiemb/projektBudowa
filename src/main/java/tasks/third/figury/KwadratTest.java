package tasks.third.figury;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KwadratTest {
    private Kwadrat kwadrat;

    @Before
    public void setUp() {

        this.kwadrat = new Kwadrat();
    }


    @Test
    public void poleShouldWorkFineForPlus() {
        // given
        this.kwadrat.setWymiarKwadratu(2);
        // when
        int result = (int) kwadrat.pole();

        // then
        assertEquals(4, result);


    }

    @Test
    public void poleShouldWorkFineForZero() {
        // given
        this.kwadrat.setWymiarKwadratu(0);
        // when
        int result = (int) kwadrat.pole();

        // then
        assertEquals(0, result);


    }

    @Test
    public void poleShouldWorkFineForMinus() {
        // given
        this.kwadrat.setWymiarKwadratu(-2);
        // when
        int result = (int) kwadrat.pole();

        // then
        assertEquals(0, result);
    }

    @Test
    public void obwodShouldWorkFineForPlus() {
        // given
        this.kwadrat.setWymiarKwadratu(2);
        // when
        int result = (int) kwadrat.obwod();

        // then
        assertEquals(8, result);


    }

    @Test
    public void obwodShouldWorkFineForZero() {
        // given
        this.kwadrat.setWymiarKwadratu(0);
        // when
        int result = (int) kwadrat.obwod();

        // then
        assertEquals(0, result);


    }

    @Test
    public void obwodShouldWorkFineForMinus() {
        // given
        this.kwadrat.setWymiarKwadratu(-2);
        // when
        int result = (int) kwadrat.obwod();

        // then
        assertEquals(0, result);


    }
}