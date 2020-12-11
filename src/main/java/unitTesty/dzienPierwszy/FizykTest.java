package unitTesty.dzienPierwszy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizykTest {

    private Fizyk fizyk;

    @Before
    public void  setUp(){
        this.fizyk = new Fizyk();
    }

    @Test
    public void test(){
        //given

        //when
        int result = fizyk.dodawanie(2,4);

        //then
        assertEquals(6,result);


    }

}