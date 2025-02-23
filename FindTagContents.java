import java.util.Scanner;

public class FindTagContents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter HTML: ");
        String scanned = scanner.nextLine();

        String scanned1 = scanner.nextLine();

        boolean result = scanned.contains(scanned1);



        if(result) {
            int num = scanned.indexOf(scanned1);
            
            int startOfSentence = scanned.indexOf(">",num)+1;
            int endOfSentence = scanned.indexOf("<", num);
            
            
            System.out.println(scanned1 + " is present in the string.");
            // DEBUG
            System.out.println("start of sentence is: " + startOfSentence);
            System.out.println("end of sentence is: " + endOfSentence);
            // /DEBUG
            System.out.println(scanned.subSequence(startOfSentence, endOfSentence));
        }
        else {
          System.out.println(scanned1 + " is not present in the string.");
        }
        scanner.close();
    }
}
// javac FindTagContents.java; java FindTagContents