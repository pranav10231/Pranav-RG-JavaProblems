package StringProblems;

import java.util.Scanner;

public class StringClassMain {

    public static void main(String[] args) {
        WordFunctions wf = new WordFunctions();
        CharFunctions cf = new CharFunctions();


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Name Entered Is :" +name);

       String ns = wf.swapFirstAndLastLetterOfAWord(name);
       System.out.println("new sentence is :"+ns);





        scanner.close();
    }
}
