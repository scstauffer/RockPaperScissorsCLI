package RockPaperScissors.interfaceAnd_IO;


import RockPaperScissors.WhoWins;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private int winCounter = 0;
    private int lossCounter;
    private int tieCounter;
    private String[] arrayFromFile;
    boolean isOn = true;
    List<String> storeArray = new ArrayList<>();

    public WhoWins loadingFile() {
      //  WhoWins whoWins = new WhoWins();
        PrintWriterClass printWriter = new PrintWriterClass();
        Scanner userInput = new Scanner(System.in);


        while (isOn){
            menu();

            String storeUserInput = userInput.nextLine();
//choice 1
            if (storeUserInput.equalsIgnoreCase("1")) {
                System.out.println();
                System.out.print("Please enter the username to play as: ");

                //this is trying to store the input from WhoWins directly and call it here.
//                whoWins.tryToLoadFromFile();

                String nameInput = userInput.nextLine();
                File file = new File("userNames.txt");
                try {
                    Scanner fileScanner = new Scanner(file);
                    String line = fileScanner.nextLine();
                    while (fileScanner.hasNextLine()) {
                        arrayFromFile = line.split(",");

                        //I just want to know if findInLine would fine a specific match in the line.
                        // if (storeUserInput.equalsIgnoreCase(fileScanner.findInLine(storeUserInput))){}




                        if (arrayFromFile[0].equalsIgnoreCase(nameInput)) {
//                            winCounter = Integer.parseInt(arrayFromFile[1]);
//                            lossCounter = Integer.parseInt(arrayFromFile[2]);
//                            tieCounter = Integer.parseInt(arrayFromFile[3]);
//                            whoWins.setWinCounter(winCounter);
//                            System.out.println(winCounter);
//                            System.out.println(whoWins.getWinCounter());
                            isOn = false;
                            storeArray.add(arrayFromFile[0].trim());
                            storeArray.add(arrayFromFile[1].trim());
                            storeArray.add(arrayFromFile[2].trim());
                            storeArray.add(arrayFromFile[3].trim());
                            System.out.println(storeArray.get(1));
                            System.out.println("list size in UI: " + storeArray.size());
                            System.out.println("This is array 3: " + storeArray.get(3));
                            winCounter += Integer.parseInt(storeArray.get(1));
                            WhoWins whoWins = new WhoWins();
                            whoWins.setWinCounter(winCounter);
                            System.out.println(winCounter);
                            setWinCounter(winCounter);
                            return whoWins;
//                            whoWins.setLossCounter(Integer.parseInt(arrayFromFile[2]));
//                            whoWins.setTieCounter(Integer.parseInt(arrayFromFile[3]));
                        }
                        else if (!arrayFromFile[0].equalsIgnoreCase(nameInput)){ System.out.println("try again"); break; }
                        break;
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }

//choice 2
               else if (storeUserInput.equals("2")){
                printWriter.writeToFile();
                isOn = false;
                   System.out.println("\nRemember your username to call your score later.");
               }
//choice 3
               else if (storeUserInput.equals("3")){
                isOn = false;
               }
//choice x
               else if (storeUserInput.equalsIgnoreCase("x")){
                   System.exit(0);
            }
               else System.out.println("\nImproper command, please try again.");
        }
        return null;
    }

    private void menu(){
        System.out.println("\n\nWould you like to: ");
        System.out.println("************************************************** MENU *************************************************************");
        System.out.println("1) Load a username     " + "2) Create a username      " + "3) Play without a username (cannot save record of win/loss/tie)");
        System.out.println("                       x) To Save and Exit");
        System.out.println("*********************************************************************************************************************");

        System.out.print("\nPlease enter your choice: ");
    }

    public void setWinCounter(int winCounter) {
        this.winCounter = winCounter;
    }

    public int getWinCounter() {
        System.out.println("");
        return winCounter;
    }

    public List<String> getArrayFromFile() {
        return storeArray;
    }
}
