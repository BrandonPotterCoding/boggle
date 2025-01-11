import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

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
        TimerTask task= new TimerTask() {
            @Override
            public void run() {
                System.out.println("Time is up nothing after this will be counted!");
            }
        };
        long delay = TimeUnit.MINUTES.toMillis(1);
        Timer timer = new Timer();
        timer.schedule(task, delay);

        long currentTime = System.currentTimeMillis();
        long endTime = currentTime + delay;
        //update when changing to break out of the loop through timer
        while(currentTime < endTime) {
            String currentInput=sc.nextLine();
            currentTime = System.currentTimeMillis();
            if(checker.realWord(currentInput)){
                if(checker.pathFound(currentInput)){
                    if(!currentEntries.contains(currentInput)){
                        currentEntries.add(currentInput);
                       //replace when adding an exit to the loop through timer
                        if(currentTime>endTime){
                            currentEntries.remove(currentInput);
                        }
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
        System.out.println("These were your entries");
        int score=0;
        for (String currentEntry : currentEntries) {
            score += (currentEntry.length()-2);
            System.out.println(currentEntry);
        }
        System.out.println("The score is: " + score);
        System.exit(0);
    }


}