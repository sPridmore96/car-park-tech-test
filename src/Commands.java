import java.util.Scanner;

public abstract class Commands {

    private final Scanner scanner;
    private final String[] commands;

    private String nextCommands;


    public Commands(String[] commands, String nextCommands) {
        this.commands = commands;
        this.nextCommands = nextCommands;
        this.scanner = new Scanner(System.in);
    }

    public void printCommands(String[] newCommands){
        for (int i = 0; i < newCommands.length; i++) {
            printMessage((i+1) + " : " + newCommands[i]);
        }
    }

    public void printGreeting(){printMessage("Please Chose and option");}

//    public void printCarParkStats() {printMessage();}

    abstract public void run();

    public void printCommands(){printCommands(commands);}

    public void printMessage(String message){
        System.out.println(message);
    }

    public String getNextCommands() {
        return nextCommands;
    }

    public void setNextCommands(String nextCommands) {
        this.nextCommands = nextCommands;
    }

    public int getIntInput(int rangeLimit) {
        int input = 0;
        boolean isActive = true;

        while(isActive){
            int userInput = scanner.nextInt();
            if(userInput > 0 && userInput <= rangeLimit){
                isActive = false;
                input = userInput;
            } else {
                printMessage("Choose another number");
            }
        }
        scanner.nextLine();
        return input;
    }

}
