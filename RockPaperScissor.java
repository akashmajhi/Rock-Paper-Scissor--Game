import java.awt.print.Paper;
import java.util.Random;

//backend
public class RockPaperScissor {

    // all of the choices that a computer can choose
    private static  final String[] computerChoices = {"Rock", "Paper","Scissors"};

    public String getComputerChoice()
    {
        return computerChoice;
    }

    public int getComputerScore() {

        return computerScore;
    }

    public int getPlayScore() {

        return playScore;
    }

    // store the computer choice so that we can retrieve the value and display it to the fronted
    private String computerChoice;

    //Store the computer choice so that we can retrieve the values and display it to the fronted
    private int computerScore,playScore;

    // use to generate a random number to randomly choose an option for the computer
    private Random random;

    //constructor - to initialize obj
    public RockPaperScissor(){
        random =new Random();
    }

    //call this method to begin rock paper scissor
    //playerChoice - is the choice made  by the player(i.e. rock ,paper, or  scissors)
    //this method will return the result of. the game (i.e. computer win, player win, draw)
    public String playRockPaperScisssor(String playerChoice){

        //generate computer choice
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        //will contain the returning message indicating the result of the game
        String result;

        //evaluate the winner
        if(computerChoice.equals("Rock")){
            if (playerChoice.equals("Paper")){
                result = "Player Wins";
                playScore++;
            }else if (playerChoice.equals("Scissors")){
               result="Computer Wins";
               computerScore++;
            }else {
                result="Draw";
            }
        }else if(computerChoice.equals("Paper")){
            if (playerChoice.equals("Scissors")){
                result = "Player Wins";
                playScore++;
            }else if (playerChoice.equals("Rock")){
                result="Computer Wins";
                computerScore++;
            }else {
                result="Draw";
            }
        }else{
            //computer choose the Scissors
            if (playerChoice.equals("Rock")){
                result = "Player Wins";
                playScore++;
            }else if (playerChoice.equals("Paper")){
                result="Computer Wins";
                computerScore++;
            }else {
                result="Draw";
            }
        }
        return result;
    }
}
