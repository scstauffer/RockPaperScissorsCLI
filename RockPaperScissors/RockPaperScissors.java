package RockPaperScissors;
import RockPaperScissors.interfaceAnd_IO.UserInterface;

public class RockPaperScissors {
static UserInterface userInterface = new UserInterface();

    WhoWins whoWins = new WhoWins();

    public void run() {

        //calls the class to load in info from a file
        userInterface.loadingFile();
        whoWins.gameInterface();
        // choose 1/2/3/v/x to play the game, view the score, or exit
        //   WhoWins.gameInterface();
    }


//      WHY DOES WhoWins NOT NEED A NEW INSTANTIATION?
    //is it because my gameInterface class uses whowins.etc?
}

