/**
 * 
 */
package edu.cnm.deepdive.scratch;

/**
 * @author ali
 *
 */
public class Solve {
  
  public static void main(String []args) {
    
    for (int a = 1; 3 * a <= 1000; a++){
      for(int b = a + 1; a + 2 * b <= 1000; b++){
      int c = 1000 - a - b;
    if (a * a + b * b == c * c){
      System.out.printf("[%d, %d, %d]%n", a, b, c);
        }
      }
    }
  }
}
