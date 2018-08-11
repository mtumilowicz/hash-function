import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2018-06-24.
 */
public class StringHashFunctionTest {
    
    @Test
    public void hash_null() {
        assertEquals(0, StringHashFunction.hash(null));
    }

    @Test
    public void hash_empty() {
        assertEquals(0, StringHashFunction.hash(""));
    }

    @Test
    public void hash_abc() {
        String test = "abc";
        assertEquals(test.hashCode(), StringHashFunction.hash(test));
    }

    @Test
    public void hash_whitespace() {
        String test = " ";
        assertEquals(test.hashCode(), StringHashFunction.hash(test));
    }

    @Test
    public void hash_abcdef1234ghz() {
        String test = "abcdef1234ghz";
        assertEquals(test.hashCode(), StringHashFunction.hash(test));
    }

    @Test
    public void hash_123456789z() {
        String test = "123456789z";
        assertEquals(test.hashCode(), StringHashFunction.hash(test));
    }
}
