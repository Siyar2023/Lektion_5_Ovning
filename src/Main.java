import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); // Skapa en scanner-instans

        // Fråga efter namn
        System.out.print("Ange ditt namn: ");
        String namn = myScanner.nextLine();
        System.out.println("Player #1: " + namn);

        // Fråga efter ett heltal X
        System.out.print("Ange ett heltal X: ");
        int X = myScanner.nextInt();
        myScanner.nextLine();

        // Loop för att visa ett tal från 1 till X
        for (int i = 1; i <= X; i++) {
            System.out.println(i);
        }


        // do-while loop
        /* do {
            System.out.print("Mata in något: ");
            String input = myScanner.nextLine();

            System.out.println("Du matade in: " + input);
        } while (true); // Villkor som alltid är sant */



        // Låt användaren mata in något tills man skriver "stop"
        boolean isPlaying = true; // boolean-variabel skapad
        do {
            System.out.print("Mata in något eller skriv 'stop' för att avsluta programmet: ");
            String input = myScanner.nextLine();

            if (input.equals("stop")) {
                isPlaying = false; // om användaren matar in "stop"
            } else {
                System.out.println("Du matade in: " + input);
            }
        } while (isPlaying); // Loop avslutas när isPlaying är false

    }
}

