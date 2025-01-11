import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[]) {

        Board board= new Board();
        Diebag bag= new Diebag();
        Boolean validTime=false;

        board.setBoard(bag);

        Checker checker= new Checker(board);

        board.displayBoard();

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the as many words as you can find. You have 2 minutes: ");
        validTime=true;
        ArrayList<String> currentEntries = new ArrayList<>();
        //start timer
        while(validTime){
            String currentInput=sc.nextLine();
            if(checker.realWord(currentInput)){
                if(checker.pathFound(currentInput)){
                    if(!currentEntries.contains(currentInput)){
                        currentEntries.add(currentInput);
                    }
                    else {
                        System.out.println("You have already found that word.");
                    }
                }
                else{
                    System.out.println("There is no formation of that word on the current board.");
                }
            }
            else{
                System.out.println("That is not a valid word.");
            }
        }


    }


}