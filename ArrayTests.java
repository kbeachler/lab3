import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testRevInPlace(){
    int [] input1 = {4, 2};
    int [] ans = {2, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(ans, input1);
  }
  
  @Test
  public void testRev(){
    int [] input1 = {4, 2};
    int [] ans = {2, 4};
    assertArrayEquals(ans, ArrayExamples.reversed(input1));
  }
}
