import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DNodeTest {
    @Test
    public void testGoForward(){
        DNode one = new DNode("B",
                    new DNode("A"), 
                    new DNode("C",
                        new DNode("D", 
                            new DNode("E"))));
        assertEquals(one.goForward(one), "BCDE");
        DNode two = new DNode("B",
                    new DNode("A"), 
                    new DNode("C",
                        new DNode("D")));
        assertEquals(two.goForward(two), "BCD");
    }

    @Test
    public void testGoBackwards(){
        DNode one = new DNode("B");
        one.setBefore(new DNode("A"));
        assertEquals(one.goBackwards(one), "AB");
    }
}
