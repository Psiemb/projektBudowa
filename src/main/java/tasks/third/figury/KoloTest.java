package tasks.third.figury;

import org.junit.Before;
import org.junit.Test;
import unitTesty.dzienPierwszy.Matematyk;

import static org.junit.Assert.*;


public class KoloTest {


    private Kolo kolo;

    @Before
    public void setUp() {

        this.kolo = new Kolo();
    }


    @Test
    public void poleShouldWorkFineForPlus() {
        // given
    this.kolo.setPromien(2);
        // when
       int result = (int) kolo.pole();

        // then
        assertEquals(12, result);



    }
    @Test
    public void poleShouldWorkFineForZero() {
        // given
        this.kolo.setPromien(0);
        // when
        int result = (int) kolo.pole();

        // then
        assertEquals(0, result);

    }
    @Test
    public void poleShouldWorkFineForMinus() {
        // given
        this.kolo.setPromien(-2);
        // when
        int result = (int) kolo.pole();

        // then
        assertEquals(0, result);

    }
    @Test
    public void obwodShouldWorkFineForPlus() {
        // given
        this.kolo.setPromien(2);
        // when
        int result = (int) kolo.obwod();

        // then
        assertEquals(12, result);

    }
    @Test
    public void obwodShouldWorkFineForZero() {
        // given
        this.kolo.setPromien(0);
        // when
        int result = (int) kolo.obwod();

        // then
        assertEquals(0, result);

    }
    @Test
    public void obwodShouldWorkFineForMinus() {
        // given
        this.kolo.setPromien(-2);
        // when
        int result = (int) kolo.obwod();

        // then
        assertEquals(0, result);

    }

}