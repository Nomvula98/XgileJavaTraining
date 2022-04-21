import java.util.*;

class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter a string to reverse: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int inputLength = input.length();
        String[] inputArr = new String[inputLength];
        
        for (int i = 1; i <= inputLength; i++) {
            inputArr[i-1] = input.substring(inputLength-i,inputLength-(i+1));
        }
        String reversedInput = Arrays.toString(inputArr);
        reversedInput = reversedInput.replace(", ", "").replace("[","").replace("]","");

        System.out.println("Reversed Input: "+ reversedInput);
    }
}