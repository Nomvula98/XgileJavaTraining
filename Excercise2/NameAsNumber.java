import java.util.*;

class NameAsNumber {
    public static void main(String[] args) {
        char c;
        char[] name = "nomvula".toLowerCase().toCharArray();
        int[] nameInNumber = new int[name.length];
        String alphabet = "";
        int count = 0;
        int i;

            for (c = 'a'; c <= 'z'; c++)
                for (char letter : name) {
                    //alphabet= String.valueOf(letter);
                    if (letter == c) {
                        
                        nameInNumber[count] = ((int) c - 96);
                        count++;
                    }
        }
        System.out.println(Arrays.toString(nameInNumber));

    }
}
