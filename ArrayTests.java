import static org.junit.Assert.*;
import org.junit.*;

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
  public void testNumericalReverseInPlace() {
    int [] input1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, input1);
  }

  @Test
  public void testShortReverseInPlace() {
    int [] input1 = {1, 2};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] {2, 1}, input1);
  }

  @Test
  public void testShortReversed() {
    int [] input1 = {1, 2};
    assertArrayEquals(new int[] {2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testDupeAverage() {
    double [] input1 = {4, 4, 4, 4, 4};
    assertEquals(4, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }

  @Test
  public void testOrderedAverage() {
    double [] input1 = {0, 1, 2, 3, 4, 5};
    assertEquals(3, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }
}
