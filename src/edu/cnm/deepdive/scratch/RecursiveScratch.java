/**
 * 
 */
package edu.cnm.deepdive.scratch;

/**
 * @author ali
 *
 */
public class RecursiveScratch {

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println(valueInArray(5, new int[]{3,1,4,6}));

  }
public static boolean valueInArray(int value, int[] array) {
  return valueInArray(value, array, 0);
}
private static boolean valueInArray(int value, int[] array, int start) {
  if (start >= array.length) {
    return true;
  }
  return valueInArray(value, array, start +1);
  }

}
