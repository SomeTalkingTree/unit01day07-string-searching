import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        System.out.println("please type in the sentence");
        //String sentance = "the quick brown fox jumped";
        Scanner scanner = new Scanner(System.in);
        String sentance = scanner.nextLine();
        
        System.out.println("Thanks, now enter the search letter");
        String searchTerm = scanner.nextLine();
        boolean result = sentance.contains(searchTerm);

        if(result) {
            int num = sentance.indexOf(searchTerm);
            
            int startOfSentence = sentance.lastIndexOf(" ");
            int endOfSentence = sentance.indexOf(" ", num);
            if(endOfSentence== -1){
                endOfSentence = sentance.indexOf("", num);
            }
            
            System.out.println(searchTerm + " is present in the string.");
            // DEBUG
            //System.out.println("start of sentence is: " + startOfSentence);
            //System.out.println("end of sentence is: " + endOfSentence);
            // /DEBUG
            String shortword = sentance.substring(startOfSentence,endOfSentence);
            System.out.println("The word is "+shortword);
        }
        else {
          System.out.println(searchTerm + " is not present in the string.");
        }
        //System.out.println(text.subSequence(startOfSentence+1, endOfSentence+1));

        scanner.close();
    }
}
// javac FindWord.java; java FindWord