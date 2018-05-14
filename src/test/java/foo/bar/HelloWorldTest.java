package foo.bar;

import static org.junit.Assert.*;

import org.junit.Test;
public class HelloWorldTest {
    @Test
    public void testBonjourToutLeMonde() throws Exception {
        // test function name can be anything
        // @Test annotation makes it a test fuction

        String str= "Junit is working fine";
        assertEquals("Junit is working fine",str);
    }
}