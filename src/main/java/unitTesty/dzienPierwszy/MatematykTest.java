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
    public void test() {
        // given

        // when
        int result = matematyk.wartoscBezwzgledna(-1);

        // then
        assertEquals(1, result);
    }

}