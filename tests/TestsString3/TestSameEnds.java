package TestsString3;
import String3.SameEnds;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Dell on 1/2/2017.
 */
public class TestSameEnds {

    @Test
    public void test() {
        assertEquals(SameEnds.sameEnds("abXYab"), "ab");
        assertEquals(SameEnds.sameEnds("xx"), "x");
        assertEquals(SameEnds.sameEnds("xxx"), "x");
        assertEquals(SameEnds.sameEnds("xxxx"),"xx");
        assertEquals(SameEnds.sameEnds("javaXYZjava"),"java");
        assertEquals(SameEnds.sameEnds("javajava"),"java");
        assertEquals(SameEnds.sameEnds("xavaXYZjava"),"");
        assertEquals(SameEnds.sameEnds("Hello! and Hello!"),"Hello!");
        assertEquals(SameEnds.sameEnds("x"),"");
        assertEquals(SameEnds.sameEnds(""),"");
        assertEquals(SameEnds.sameEnds("abcb"),"");
        assertEquals(SameEnds.sameEnds("mymmy"),"my");
    }
}
