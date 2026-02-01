package StringProblems;

public class StringBuiltinFunctions {
    public static void main(String[] args) {
        String str = "Welcome To the Coding World";

        // String manipulation functions.

        String str1 = str.toLowerCase();
        System.out.println(str1);

        String str2 = str.toUpperCase();
        System.out.println(str2);

        String str3 = str.replace("o", "r");
        System.out.println(str3);

        String str4 = str.replaceAll("T", "r");
        System.out.println(str4);

        String str5 = str.concat(" Pranav");
        System.out.println(str5);

        String str6 = str.indent(6);
        System.out.println(str6);

        String str7 = str.repeat(2);
        System.out.println(str7);

        String str8 = str.replaceFirst("o","i");
        System.out.println(str8);

        String str11 = str.substring(5);
        System.out.println(str11);

        String str12 = str.substring(11,22);
        System.out.println(str12);

        // removing whitespace functions
        String stc = "       This is the new world..      ";

        String str9 = stc.strip();
        System.out.println(str9);

        String str10 = stc.trim();
        System.out.println(str10);

        // String boolean functions

        String alphaNumericSentence = "Please call : 911";

        boolean str13 = alphaNumericSentence.contains("Please call");
        System.out.println("contains : "+str13);

        boolean str14 = alphaNumericSentence.endsWith("911");
        System.out.println("ends with  : "+str14);

        boolean str15 = alphaNumericSentence.isBlank();
        System.out.println("blank  : "+str15);

        boolean str16 = alphaNumericSentence.isEmpty();
        System.out.println("empty  : "+str16);

        boolean str17 = alphaNumericSentence.contains("9");
        System.out.println("contains numeric  : "+str17);

        // String indexing functions
        String indexSentence  = "Hello world, it is nice have you back";

        char str18 = indexSentence.charAt(4);
        System.out.println("char at 4: "+str18);

        int str19 = indexSentence.indexOf(" ");
        System.out.println("indexof : "+str19);




    }


}
