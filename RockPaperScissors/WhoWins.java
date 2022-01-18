package RockPaperScissors;

import RockPaperScissors.interfaceAnd_IO.UserInterface;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WhoWins {
    private int winCounter;
    private int lossCounter;
    private int tieCounter;
    static Scanner userInput = new Scanner(System.in);
    static UserInterface userInterface = new UserInterface();

    public void gameInterface(){
//        WhoWins whoWins = new WhoWins();
        while (true) {
            //region user option souts
            System.out.println("\nSelect: ");
            System.out.println("********** Rock Paper Scissors **********");
            System.out.println("1) Rock      2) Paper      3) Scissors");
            System.out.println("x) Save and Exit           v) View score");
            System.out.println("*****************************************\n");
            System.out.print("Please enter your choice: ");
            // endregion end user choices
            String storeUserInput = userInput.nextLine();

            if (storeUserInput.equals("1")) {
                humanRockChoice();
            }
            else if (storeUserInput.equals("2")) {
                humanPaperChoice();
            }
            else if (storeUserInput.equals("3")){
                humanScissorChoice();
            }
            else if (storeUserInput.equalsIgnoreCase("x")){
                System.exit(0);
            }
            else if (storeUserInput.equalsIgnoreCase("v")){
                System.out.println("\n************* Win Counter ***************");
//                System.out.println("setWinCounter: " + userInterface.setWinCounter(whoWins.winCounter));    //These lines aren't working
                System.out.println("getwincounterFrom USERINTERFACE: " + userInterface.getWinCounter());
                System.out.println("List size now: " + userInterface.getArrayFromFile().size());     //NEED TO FIGURE THIS SPOT OUT OR DO SOMETHING ELSE
                System.out.println("Wins: " + getWinCounter() + "        Losses: " + getLossCounter()
                        + "          Ties: " + getTieCounter() +"");
                System.out.println("************* Win Counter ***************\n");

            }
            else System.out.println("Invalid command, please try again.");
        }
    }

    public int humanRockChoice() {
        double randomComputerNumber = (Math.random() * 3);

        if (randomComputerNumber >= 1 && randomComputerNumber < 2) {
            System.out.println("--------------------------");
            System.out.println("The Computer chose Rock");
            System.out.println("You tie!");
            System.out.println("--------------------------");
            return tieCounter += 1;
        }
        if (randomComputerNumber >= 2) {
            System.out.println("--------------------------");
            System.out.println("The computer chose Scissors");
            System.out.println("You win!");
            System.out.println("--------------------------");
            return winCounter += 1;
        }
        else if (randomComputerNumber < 1)
            System.out.println("--------------------------");
            System.out.println("The computer chose Paper");
            System.out.println("You lose!");
        System.out.println("--------------------------");
        return lossCounter += 1;
    }

    public int humanScissorChoice() {
        double  randomComputerNumber = (Math.random() * 3);
        if (randomComputerNumber >= 1 && randomComputerNumber < 2) {
            System.out.println("--------------------------");
            System.out.println("The Computer chose Rock");
            System.out.println("You lose!");
            System.out.println("--------------------------");
            return lossCounter += 1;
        }
        if (randomComputerNumber >= 2) {
            System.out.println("--------------------------");
            System.out.println("The computer chose Scissors");
            System.out.println("You tied!");
            System.out.println("--------------------------");
            return tieCounter += 1;
        } else if (randomComputerNumber < 1)
            System.out.println("--------------------------");
            System.out.println("The computer chose Paper");
            System.out.println("You win!");
        System.out.println("--------------------------");
        return winCounter += 1;
    }

    public int humanPaperChoice() {
        double  randomComputerNumber = (Math.random() * 3);
        if (randomComputerNumber >= 1 && randomComputerNumber < 2) {
            System.out.println("--------------------------");
            System.out.println("The Computer chose Rock");
            System.out.println("You win!");
            System.out.println("--------------------------");
            return winCounter += 1;
        }
        if (randomComputerNumber >= 2) {
            System.out.println("--------------------------");
            System.out.println("The computer chose Scissors");
            System.out.println("You lose!");
            System.out.println("--------------------------");
            return lossCounter += 1;
        }
        else if (randomComputerNumber < 1)
            System.out.println("--------------------------");
            System.out.println("The computer chose Paper");
            System.out.println("You tie!");
        System.out.println("--------------------------");
        return tieCounter += 1;
    }



//    public String tryToLoadFromFile() {
//        String nameInput = userInput.nextLine();
//        File file = new File("userNames.txt");
//        try {
//            Scanner fileScanner = new Scanner(file);
//            String line = fileScanner.nextLine();
//            while (fileScanner.hasNextLine()) {
//                String[] arrayFromFile = line.split(",");
//                if (arrayFromFile[0].equalsIgnoreCase(nameInput)) {
//                    winCounter += Integer.parseInt(arrayFromFile[1]);
//                    lossCounter = Integer.parseInt(arrayFromFile[2]);
//                    tieCounter = Integer.parseInt(arrayFromFile[3]);
//                    setWinCounter(winCounter);
//                    System.out.println(getWinCounter());
////                            whoWins.setLossCounter(Integer.parseInt(arrayFromFile[2]));
////                            whoWins.setTieCounter(Integer.parseInt(arrayFromFile[3]));
//
//                    //this is running a separate instance of the game
//                    //is that at least 1 reason why I don't save whoWins?
//                  //  WhoWins.gameInterface();
//                    continue;
//                } else System.out.println("try again");
//                break;
//            }
//        } catch (
//                FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        return "";
//    }


    public int getWinCounter() {
        return winCounter ; }

    public int getLossCounter() {
        return lossCounter;
    }

    public int getTieCounter() {
        return tieCounter;
    }

    public void setWinCounter(int winCounter) {

        this.winCounter += winCounter;
    }

    public void setLossCounter(int lossCounter) {
        this.lossCounter = lossCounter;
    }

    public void setTieCounter(int tieCounter) {
        this.tieCounter = tieCounter;
    }
}