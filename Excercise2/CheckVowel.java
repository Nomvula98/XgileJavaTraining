import java.util.*;

class CheckVowel {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        String strLetter;
        int pos = 0;

        if (input.contains("a") || input.contains("e")||input.contains("i")||input.contains("o")||input.contains("u")){
            System.out.println("Yes, vowel(s) is/are present");
            for (char letter : input.toCharArray()){
                strLetter = Character.toString(letter);
                pos++;
               if(strLetter.equals("a") || strLetter.equals("e") || strLetter.equals("i") || strLetter.equals("o") || strLetter.equals("u")){
                   System.out.println("at position: "+pos);
               }
            }
        }
    }
}