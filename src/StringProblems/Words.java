package StringProblems;

public class Words {
    public static void main(String[] args) {
        String word = "THIS is A NEW world";

        // Sentence to lower case.
        String word1  = word.toLowerCase();
        System.out.println(word1);

        // Sentence to upper case
        String word2 = word.toUpperCase();
        System.out.println(word2);

        // Attaching the sentence with new sentence or new word.
        String word3 = word.concat(" Pranav");
        System.out.println(word3);

        // Create a space at the start of the sentence .
        String word4 = word.indent(10);
        System.out.println(word4);

        // Repeat the sentence
        String word5 = word.repeat(5);
        System.out.println(word5);

        // Replace the old char with the new char
        String word6 = word.replace('T','r');
        System.out.println(word6);

        // Replace the specific sentence with a new sentence
        String word7 = word.replace("NEW world", "old Pranav");
        System.out.println(word7);

        // Rplace the substring with a new string
        String word8 = word.replaceAll("NEW world", "Awesome Pranav");
        System.out.println(word8);

        // It will replace the first same sentence with the new one.
        String word9 = "This is going to be and not going to be awesome.";
        String replaceFirst = word9.replaceFirst("going to be","pathetic");
        System.out.println(replaceFirst);

        // It will remove the whitespace from the sentence.
        String word10 = "                 This is going to be and not going to be awesome.";
        String w10 = word10.strip();
        System.out.println(w10);

        // It will remove all the strings before the index
        String word11 = "This is a new world";
        String w11 = word11.substring(6);
        System.out.println(w11);

        // It will keep all the strings before the end index
        String word12 = "This is a new world";
        String w12 = word12.substring(0, 6);
        System.out.println(w12);

        String word13 = "              This is a new world                          ";
        String word14 = " Pranav";
        String w13 = word13.trim();
        System.out.println(w13+word14);

        String character = "Pranav Chauhan";
        char w14 = character.charAt(5);
        System.out.println("Character at index 5 : "+w14);

        for(int i=0; i<=200; i++){
            char char1 =(char) i;
            System.out.print(char1);

        }





    }
}
