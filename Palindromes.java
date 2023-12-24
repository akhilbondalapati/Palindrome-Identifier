import java.util.Scanner;
public class Palindromes
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
        System.out.println("Type in your text: ");
        String userText = input.nextLine();
        
        if (isPalin(userText)) {
            System.out.println("Your word is a palindrome!");
        }
        else {
            System.out.println("Not a palindrome :(");
        }
    }
    public static boolean isPalin(String text)
    {
       if(text.equals(reverse(text))) {
           return true;
       }
       return false;
        
    }
    public static String reverse(String text)
    {
        String reverseText = "";
        
        for (int i = 0; i < text.length(); i++) {
            String letter = text.substring(i, i+1);
            reverseText = letter + reverseText;
        }
        return reverseText;
    }

}