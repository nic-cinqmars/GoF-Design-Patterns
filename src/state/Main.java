package state;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        OperatingSystem os = new OperatingSystem();

        int choice = 0;
        do {
            os.displayInfo();
            os.displayCommand();
            choice = getChoice(sc);
            os.sendCommand(choice);
        } while (choice != 9);

        sc.close();
    }

    private static int getChoice(Scanner sc)
    {
        System.out.print("Please enter your choice (enter 9 to quit) : ");
        return sc.nextInt();
    }
}
