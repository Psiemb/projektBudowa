package tasks.third.figury;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrapezRownoramiennyTest {
    private TrapezRownoramienny trapezRownoramienny;

    @Before
    public void setUp() {
        this.trapezRownoramienny =new TrapezRownoramienny();

    }
    @Test
    public void poleShouldWorkFineForPlus() {
        // given
        this.trapezRownoramienny.setWymiarA(3);
        this.trapezRownoramienny.setWymiarB(2);
        this.trapezRownoramienny.setWysokoscH(3);
        // when
        int result = (int)trapezRownoramienny.pole();

        // then
        assertEquals(7, result);
    }

    @Test
    public void poleShouldWorkFineForZero() {
        // given
        this.trapezRownoramienny.setWymiarA(0);
        this.trapezRownoramienny.setWymiarB(0);
        this.trapezRownoramienny.setWysokoscH(0);
        // when
        int result = (int)trapezRownoramienny.pole();

        // then
        assertEquals(0, result);
    }

    @Test
    public void poleShouldWorkFineForMinus() {
        // given
        this.trapezRownoramienny.setWymiarA(-3);
        this.trapezRownoramienny.setWymiarB(-2);
        this.trapezRownoramienny.setWysokoscH(-3);
        // when
        int result = (int)trapezRownoramienny.pole();

        // then
        assertEquals(0, result);
    }

    @Test
    public void obwodShouldWorkFineForPlus() {
        // given
        this.trapezRownoramienny.setWymiarA(3);
        this.trapezRownoramienny.setWymiarB(2);
        this.trapezRownoramienny.setWysokoscH(3);
        // when
        int result = (int)trapezRownoramienny.obwod();

        // then
        assertEquals(11, result);
    }

    @Test
    public void obwodShouldWorkFineForZero() {
        // given
        this.trapezRownoramienny.setWymiarA(0);
        this.trapezRownoramienny.setWymiarB(0);
        this.trapezRownoramienny.setWysokoscH(0);
        // when
        int result = (int)trapezRownoramienny.obwod();

        // then
        assertEquals(0, result);
    }

    @Test
    public void obwodShouldWorkFineForMinus() {
        // given
        this.trapezRownoramienny.setWymiarA(-3);
        this.trapezRownoramienny.setWymiarB(-2);
        this.trapezRownoramienny.setWysokoscH(-3);
        // when
        int result = (int)trapezRownoramienny.obwod();

        // then
        assertEquals(0, result);
    }
}