package StringProblems;

public class WordFunctions {
    public static int countWordsInASentence(String sentence) {
        String s = sentence;
        s += " ";
        String word;
        int count = 0;
        int position = 0, end = 0;

        while (s.indexOf(" ", position) > 0) {
            end = s.indexOf(" ", position);
            word = s.substring(position, end);
            position = end + 1;
            count++;
        }

        return count;
    }

    public static String findLongestWord(String sentence) {
        String s = sentence;
        s = s + " ";
        String word, longestWord = "";
        int end = 0, position = 0, count = 0, lword = 0;

        while (s.indexOf(" ", position) > 0) {
            end = s.indexOf(" ", position);
            word = s.substring(position, end);
            if (word.length() > lword) {
                int length = word.length();
                lword = length;
                longestWord = word;
            }

            position = end + 1;
        }
        return longestWord;
    }

    public static String capatalizeEachWord(String sentence) {
        String s = sentence;
        s = s + " ";
        String word;
        String capitalizeSentence = "";
        int end = 0, position = 0;

        while (s.indexOf(" ", position) > 0) {
            end = s.indexOf(" ", position);
            word = s.substring(position, end);
            capitalizeSentence = capitalizeSentence + Character.toUpperCase(word.charAt(0));
            capitalizeSentence = capitalizeSentence + word.substring(1) + " ";
            position = end + 1;
        }
        return capitalizeSentence;
    }

    public static int countWords(String sentence) {
        String s = sentence;
        s = s+ " ";
        String word = "";
        int count = 0, position = 0, end = 0;

        while(s.indexOf(" ", position)>0){
            end = s.indexOf(" ",position);
            word = s.substring(position, end);
            position = end +1;
            count++;
        }
        return count;
    }

    // Q. Print the first two chararcters of each word in a String
    public static void printFirstTwoCharactersOfEachWordsInASentence(String sentence){

        String s = sentence;
        s = s + " ";
        String word = "", twoCharacters = "";
        int position = 0, end =0;

        while(s.indexOf(" ", position) > 0){
            end = s.indexOf(" ", position);
            word = s.substring(position, end);
            if(word.length() == 1){
                    System.out.println("There is only one character in a word : "+word);
            } else {
                twoCharacters = word.substring(0,2);
                System.out.println("First two characters of word : "+word+ " is : " +twoCharacters);
            }

            position  = end +1;
        }
    }

    //Q. Print only the words starting with R in a sentence
    public static void printWordsStartingWithRInASentence(String sentence){
        String s = sentence;
        String word  = "";
        s = s + " ";
        int position = 0, end =0;

        while (s.indexOf(" ", position) > 0){
            end = s.indexOf(" ", position);
            word = s.substring(position, end);
            if(word.charAt(0) == 'R' || word.charAt(0) == 'r'){
                System.out.println("Word Start with r is : "+word);
            }
            position = end + 1;
        }

    }

    // Q. Print a word containing E in a sentence
    public static void printWordsContainingEInASentence(String sentence) {
        String s = sentence;
        String word = "";
        s = s + " ";
        int position = 0, end = 0;

        while (s.indexOf(" ", position) > 0) {
            end = s.indexOf(" ", position);
            word = s.substring(position, end);
            if (word.contains("E") || word.contains("e")) {
                System.out.println("Word contains E are :" + word);
            }
            position = end + 1;
        }
    }

        // Print only words which have 3 characters in a sentence
        public static void printOnlySentencesWithThreeWords(String sentence){
            String s = sentence;
            s = s+ " ";
            String word = "";
            int position = 0, end = 0;

            while(s.indexOf(" ", position)>0){
                end = s.indexOf(" ",position);
                word = s.substring(position, end);
                if(word.length() == 3){
                 System.out.println("Words containing 3 characters are :  "+word);
                }
                position = end +1;

            }

        }


        // Print only special words from a character : Eg : ANNA or BOB
    public static void printOnlySpecialWordsFromACharacter(String sentence) {
        String s = sentence;
        s = s + " ";
        String word = "";
        int position = 0, end = 0;

        while (s.indexOf(" ", position) > 0) {
            end = s.indexOf(" ", position);
            word = s.substring(position, end);
            char firstWord = word.charAt(0);
            int wordLength = word.length();
            char lastWord = word.charAt(wordLength-1);
            if(firstWord == lastWord){
                System.out.println("Special words are : " +word);
            }
            position = end + 1;

        }
    }

    // Q. Change red with blue in a sentence  (A red seed)
    public static String ChangeWordInAsentence(String sentence){
        String s = sentence;
        s= s+" ";
        String newSentence = "" ;
        int position = 0, end = 0;


        while(s.indexOf(" ", position)>0){
            end = s.indexOf(" ", position);
          String word = s.substring(position, end);
            if (word.equalsIgnoreCase("RED")){
                word = word.replace("RED", "BLUE");
            }
            newSentence = newSentence + word + " ";
            position = end + 1;
        }
        return newSentence;
    }

    // Q. Write a code to delete word from the sentence (A RED SEED)
    public static String deleteWordInAsentence(String sentence) {
        String s = sentence;
        s = s + " ";
        String newSentence = "";
        int position = 0, end = 0;


        while (s.indexOf(" ", position) > 0) {
            end = s.indexOf(" ", position);
            String word = s.substring(position, end);
            if (!(word.equalsIgnoreCase("RED"))) {
                newSentence = newSentence + word + " ";
            }

            position = end + 1;
        }
        return newSentence;
    }

    // Q. Take A sentence change the case of each alternate word.
    // eg. A RED SEED  -> A RED seed
    public static String ChangeTheCaseOfEachAlternateWord(String sentence) {
        String s = sentence;
        s = s + " ";
        String newSentence = "";
        int position = 0, end = 0;
        int count =0;
        String word1 = "";


        while (s.indexOf(" ", position) > 0) {
            end = s.indexOf(" ", position);
            String word = s.substring(position, end);
            count++;
            if(count % 2 == 0){
                word1 = word.toLowerCase();
            } else {
                word1 = word.toUpperCase();
            }
                newSentence = newSentence + word1 + " ";
            position = end + 1;
        }
        return newSentence;
    }


    // Q Write a program to capitalize each word in a sentence
    public static String capitalizeEachWordWord(String sentence) {
        String s = sentence;
        s = s + " ";
        String newSentence = "";
        int position = 0, end = 0;



        while (s.indexOf(" ", position) > 0) {
            end = s.indexOf(" ", position);
            String word = s.substring(position, end);
            newSentence = newSentence + word.toUpperCase() + " ";
            position = end + 1;
        }
        return newSentence;
    }


    // Q. Write a program to swap first and last letter of each word of a sentence.
    public static String swapFirstAndLastLetterOfAWord(String sentence) {
        String s = sentence;
        s = s + " ";
        String newSentence = "";
        int position = 0, end = 0;



        while (s.indexOf(" ", position) > 0) {
            end = s.indexOf(" ", position);
            String word = s.substring(position, end);
            int wordSize = word.length()-1;
            char firstLetter = word.charAt(0);
            char lastLetter = word.charAt(wordSize);
            String swappedWord = "";

            for(int i=0; i<word.length();i++){
                        if(i==0){
                            swappedWord = swappedWord + lastLetter;
                        } else if (i == word.length()-1) {
                            swappedWord = swappedWord + firstLetter;
                        } else {
                            swappedWord = swappedWord + word.charAt(i);
                        }


            }
            position = end + 1;
            newSentence = newSentence + swappedWord + " ";
        }
        return newSentence;
    }


}