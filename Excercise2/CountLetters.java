import java.util.*;

class CountLetters {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    int count = 0;
      for (char letter : input.toCharArray()){
          count++;
      }
        System.out.println("The String has "+count+" letters");
    }
}