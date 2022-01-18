package RockPaperScissors.interfaceAnd_IO;

import RockPaperScissors.WhoWins;

import java.io.*;
import java.util.Scanner;

public class PrintWriterClass {
    String input;
    private PrintWriter writer;
    File fileInDirectory = new File("userNames.txt");
    Scanner userInput = new Scanner(System.in);
    String startingWins = ",0,";
    String startingLoss = "0,";
    String startingTie = "0";
    UserInterface userInterface = new UserInterface();

    public String writeToFile() {
        try {
            this.writer = new PrintWriter(new FileWriter(fileInDirectory, true));
            System.out.print("Enter the name you would like to save: ");
            input = userInput.nextLine();
            write(input + startingWins + startingLoss + startingTie);
            //writer.println(input);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }

    public void write(String logMessage){
        this.writer.println(logMessage);
        this.writer.flush();
    }

//    public String saveFile(){
//        if(userInterface.)
//    }


}
