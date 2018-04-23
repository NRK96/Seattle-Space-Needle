/* Name: Nicholas Keen
 * Course: CIS 201 - Computer Science I
 * Section: 003
 * Assignment: 4
 */
public class SeattleSpaceNeedle {

    //Declares a constant controlling 
    //the size of the needle
    public static final int SIZE  = 2;

    //prints out the space needle
    public static void main(String[] args) {
        spaceNeedle();
    }
    //stores the space needle into
    //a single method
    public static void spaceNeedle() {
        tip();
        topHalf();
        bottomHalf();
        tip();
        body();
        topHalf();
    }
    //prints out the very tip
    //of the needle
    public static void tip() {
        for(int tip = 1; tip <= SIZE; tip++){
            for(int spaces = 1; spaces <= SIZE*3; spaces++){
                System.out.print(" ");
    }
            System.out.println("||");
            }
    }
    //prints out the top half
    //of the upper part
    //of the space needle
    public static void topHalf() {
        for( int i = 1; i <= SIZE; i++){
            for(int spaces = 1; spaces <= 3*SIZE - 3*i; spaces++){
                System.out.print(" "); 
            }
            for(int j = 1; j <= 1; j++){
                System.out.print("__/");
            }
            for(int k = 1; k <= i - 1; k++){
                System.out.print(":::");
            }
            System.out.print("||");
            for(int k = 1; k <= i - 1; k++){
                System.out.print(":::");
            }
            for(int j = 1; j <= 1; j++){
                System.out.print("\\__");
            }
            System.out.println();
        }
        System.out.print("|");
        for(int i = 1; i <= 6*SIZE; i++){
            System.out.print("\"");
        }
        System.out.println("|");
    }
    //prints out the bottom half
    //of the upper part
    //of the space needle
    public static void bottomHalf() {

          for(int i = 1; i <= SIZE; i++){
              for(int j = 1; j <= i - 1; j++){
                  System.out.print("  ");
          }
          System.out.print("\\_");
          for(int k = 3*SIZE-i; k >= i; k--){
              System.out.print("/\\");
          }
          System.out.println("_/");
          }
    }
    //prints out the body
    //of the needle
    public static void body() {
         for(int i = 1; i <= SIZE*4; i++) {
             for(int j = 1; j <= 3*SIZE - 3; j++){
                 System.out.print(" ");
             }
         System.out.println("|%%||%%|");
         }
    }
}