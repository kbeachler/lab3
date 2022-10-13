import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests{

    @Test
    public void testPrepend(){
        LinkedList temp = new LinkedList();
        temp.prepend(2);
        temp.prepend(3);
        temp.prepend(-2);

        assertEquals(3, temp.length());
    }

    @Test
    public void testAppend(){
        LinkedList temp = new LinkedList();
        temp.append(2);
        temp.append(3);
        temp.append(-2);

        assertEquals(3, temp.length());
    }
}
