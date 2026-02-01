package StringProblems;

public class CharFunctions {


    public static String reverseAWord(String sentence){
        // Q. Write a program to reverse a case of a string
        String reverse = "";

        for(int i = sentence.length()-1; i >= 0; i--){
            char word = sentence.charAt(i);
            reverse += word;
        }
        return reverse;
    }

    public static int countVowels(String sentence){
        int count = 0;

        for(int i=0; i <sentence.length(); i++ ){
            char ch = sentence.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count += 1;
            }
        }
        return count;
    }

    public static String swapCase(String sentence){
        // Q. Write a program to reverse the case if a string.
        String swappedSentence ="";

        for (int i=0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);

            if(Character.isUpperCase(ch)){
                swappedSentence += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)){
                swappedSentence += Character.toUpperCase(ch);
            } else {
                swappedSentence += ch;
            }

        }
        return swappedSentence;
    }

    public static int countCharacters(String sentence, char wordToFind){
        int count = 0;

        for(int i=0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);

            if(ch == wordToFind){
                count++;
            }

        }
      return count;
    }

    public static void printEachCharacterInAStringInSeperateLine(String sentence){
        String s = sentence;

        for(int i=0; i< s.length(); i++){
           char ch = s.charAt(i);
           System.out.println(ch);
        }
    }

    public static void printASCIICodeOfEachCharacterOfAString(String sentence){
        String s = sentence;

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            System.out.println(ch +": "+(int)ch);
        }
    }

    public static int printOnlyUppercaseCharacterAndCountsOfAString(String sentence){
        String s = sentence;
        int count = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                System.out.println(ch);
                count++;
            }
        }
        return count;
    }

    public static void printHowManyAlphabetsNumericWhitespacesLowercaseUppercaseInAString(String sentence){
        // Q. Print and count how many uppercase lowercase whitespace and numeric characters in a string.

        String s = sentence;
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int numericCount = 0;
        int whitespaceCount = 0;

        for (int i=0; i<s.length(); i++){
                char ch  = s.charAt(i);

                if(Character.isUpperCase(ch)){
                    uppercaseCount++;
                } else if (Character.isLowerCase(ch)) {
                    lowercaseCount++;
                } else if (Character.isDigit(ch)) {
                    numericCount++;
                } else if (Character.isWhitespace(ch)){
                    whitespaceCount++;
            }
        }
            System.out.println("Uppercase count is : "+uppercaseCount+" and lowercase count is: "+lowercaseCount+" and whitespace in a sentence is : "+whitespaceCount);
    }


    public static String createNewStringWithUpperCaseLettersOnly(String sentence){
        // Q. Create a new string with upper case letters only

        String s = sentence;
        String newString= "";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                newString = newString + ch;
            }
        }
        return newString;
    }

    public static String createNewStringWithDigitsFirstAndThenCharacters(String sentence){

        // Q. Create a new string with digits first and then characters.
        String s = sentence;
        String digits = "";
        String characters = "";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                digits = digits + ch;
            } else if (Character.isLetter(ch)) {
                characters = characters + ch;
            }
        }

        String newSentence = digits + characters;
        return newSentence;
    }

    public static String createNewStringAfterRemovingAllSpacesInAString(String sentence){
        // Q. Write a program to create a new string after removing all spaces from the old string
        String s= sentence;
        String newSentence = "";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!(Character.isWhitespace(ch))){
                newSentence = newSentence + ch;
            }

        }
        return newSentence;
    }

    public static boolean isPalindrome(String sentence){
        // Q Write a code to check if a string or series of number is palindrome.

        String s = sentence;
        String reverse = "";

        for(int i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            reverse = ch + reverse;
        }
        if(s.equalsIgnoreCase(reverse)){
            return true;
        }
        return false;
    }

    public static void toPiglatin(String sentence){
        // Write a code to convert a piglatin of a string
        String s= sentence;
        String piglatinSentence = "";
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                if(i==0){
                    piglatinSentence = s.concat("WAY");
                    System.out.println("Piglatin: "+piglatinSentence );
                    break;
                } else {
                    int start = 0;
                    int end = s.indexOf(ch);
                    String str1 = s.substring(end);
                    String str2 = s.substring(start, end);
                    piglatinSentence = str1 + str2 + "AY";
                    System.out.println("Piglatin: "+piglatinSentence );
                    break;
                }

            }
        }
    }

    public static String moveEachLetterby2(String sentence){
        String s= sentence;
        String ns = "";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='Y' || ch=='y' || ch=='Z' || ch=='z'){
                ch -=26;
            }
            ch+=2;
            ns = ns + ch;
        }
        return ns;
    }


}
