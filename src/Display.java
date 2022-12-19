import java.util.Scanner;

public class Game {

    /*Menu:
    1 Easy
    2 Intermediate
    3 Advanced
    4 Exit
     */

    public void printMenu(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Menu: \n" +
                "1 Easy \n" +
                "2 Intermediate \n" +
                "3 Advanced \n" +
                "4 Exit");

        int userChoice = sc.nextInt();

        switch (userChoice) {
            case 1:
                Easy easy = new Easy();
                easy.generateSudoku(39);
                break;
            case 2:
                Intermediate intermediate = new Intermediate();
                intermediate.generateSudoku(30);
                break;
            case 3:
                Advanced advanced = new Advanced();
                advanced.generateSudoku(24);
                break;
            case 4:
                System.out.println("See u next time !");
                System.exit(0);
        }
    }
    public void printBoard(int[][] array) {

        System.out.println("|-----------------------|");
        System.out.println("| " + array[0][0] + " " + array[0][1] + " " + array[0][2] + " | " + array[1][0] + " " + array[1][1] + " " + array[1][2] + " | " + array[2][0] + " " + array[2][1] + " " + array[2][2] + " |");
        System.out.println("| " + array[0][3] + " " + array[0][4] + " " + array[0][5] + " | " + array[1][3] + " " + array[1][4] + " " + array[1][5] + " | " + array[2][3] + " " + array[2][4] + " " + array[2][5] + " |");
        System.out.println("| " + array[0][6] + " " + array[0][7] + " " + array[0][8] + " | " + array[1][6] + " " + array[1][7] + " " + array[1][8] + " | " + array[2][6] + " " + array[2][7] + " " + array[2][8] + " |");
        System.out.println("|-----------------------|");
        System.out.println("| " + array[3][0] + " " + array[3][1] + " " + array[3][2] + " | " + array[4][0] + " " + array[4][1] + " " + array[4][2] + " | " + array[5][0] + " " + array[5][1] + " " + array[5][2] + " |");
        System.out.println("| " + array[3][3] + " " + array[3][4] + " " + array[3][5] + " | " + array[4][3] + " " + array[4][4] + " " + array[4][5] + " | " + array[5][3] + " " + array[5][4] + " " + array[5][5] + " |");
        System.out.println("| " + array[3][6] + " " + array[3][7] + " " + array[3][8] + " | " + array[4][6] + " " + array[4][7] + " " + array[4][8] + " | " + array[5][6] + " " + array[5][7] + " " + array[5][8] + " |");
        System.out.println("|-----------------------|");
        System.out.println("| " + array[6][0] + " " + array[6][1] + " " + array[6][2] + " | " + array[7][0] + " " + array[7][1] + " " + array[7][2] + " | " + array[8][0] + " " + array[8][1] + " " + array[8][2] + " |");
        System.out.println("| " + array[6][3] + " " + array[6][4] + " " + array[6][5] + " | " + array[7][3] + " " + array[7][4] + " " + array[7][5] + " | " + array[8][3] + " " + array[8][4] + " " + array[8][5] + " |");
        System.out.println("| " + array[6][6] + " " + array[6][7] + " " + array[6][8] + " | " + array[7][6] + " " + array[7][7] + " " + array[7][8] + " | " + array[8][6] + " " + array[8][7] + " " + array[8][8] + " |");
        System.out.println("|-----------------------|");

    }
}
