// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}
*/

package variabile;

 public class Main{
     static void copyArrayExample(){
         char[] copyFrom = {'a','b','c','d','e','f','g','h','i','j'};
                 char [] copyTo = new char [7];
                 char [] second = new char[7];
         System.arraycopy(copyFrom, 2, copyTo, 0, 7);
         System.arraycopy(copyFrom, 2, second, 0, 7);
         System.out.println(new String(copyTo));
     }

     public static void main(String[] args){
         copyArrayExample();
     }
 }