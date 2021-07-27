package com.chorrny;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        Scanner scanner = new Scanner(System.in);
        NumberService numberService = new NumberService();
        ChessService chessService = new ChessService();
        int action = 0;
        System.out.println("----------------------------");
        System.out.println("\tWelcome to my app");
        System.out.println("----------------------------");
        System.out.println("1. Start Number worker func");
        System.out.println("2. Start Chess workers func");
        System.out.println("3. Exit");
        System.out.println("----------------------------");
        System.out.print("Enter action: ");
        action = scanner.nextInt();
        System.out.println("----------------------------");
        switch (action) {
            case 1: {
                System.out.print("Enter number: ");
                int tmpNumber = scanner.nextInt();
                numberService.NumberCounter(tmpNumber);
            }break;
            case 2: {
                System.out.println("Enter row:");
                int tmpRow = scanner.nextInt();
                System.out.println("Enter square:");
                int tmpSquare = scanner.nextInt();
                chessService.ShowChessTable(8, 1, '*', '_');
            }break;
            case 3:
            {
                System.out.println("Bye!");
            }break;
            default:{ System.out.println("Error!"); }
        }
    }
}
