import java.util.Scanner;

public class Game {
    public void gameOn() {

        Scanner sc = new Scanner(System.in);
        Display display = new Display();
        display.printMenu();
        int userChoice = sc.nextInt();

        switch (userChoice) {
            case 1:
                Easy easy = new Easy();
                try {
                    easy.playSudoku();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                Intermediate intermediate = new Intermediate();
                intermediate.playSudoku();
                break;
            case 3:
                Advanced advanced = new Advanced();
                advanced.playSudoku();
                break;
            case 4:
                System.out.println("See u next time !");
                System.exit(0);
        }
    }


    public void solveOption(int[][] array1, int[][] array2, int input1, int input2, int input3) throws SudokuException {

        if ((input1 - 1) <= 0 || (input1 - 1) > 9 || (input2 - 1) <= 0 || (input2 - 1) > 9 || input3 <= 0 || input3 > 9) {
            throw new SudokuException("Choose a valid option");
        } else {
            if (array2[input1 - 1][input2 - 1] == 0) {
                array1[input1 - 1][input2 - 1] = input3;
            } else {
                System.out.println("Choose a valid option");
            }

        }
    }

    public void restartOption(int[][] array1, int[][] array2) {

        Scanner sc = new Scanner(System.in);
        System.out.print("To restart press enter");
        String enter = sc.nextLine();
        if (enter.equals(" ")) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1.length; j++) {
                    if (array2[i][j] == 0) {
                        array1[i][j] = 0;
                    }
                }
            }
        }
    }


}

    /*public void generateSudoku(int givenNumbers) {

        Display display = new Display();
        String[][] board = new String[9][9];
        String[][] verificationBoard = new String[9][9];
        Random random = new Random();
        int randomNumber = 0;
        boolean complete = false;
        int counter = 0;

        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                board[i][j] = " ";
                verificationBoard[i][j] = " ";
            }
        }

        for (int i = 0; i < givenNumbers; i++) {
            int row = random.nextInt(9);
            int col = random.nextInt(9);
            randomNumber = (random.nextInt(9)) + 1;

            if (BoxVerifications(board,row, col, String.valueOf(randomNumber)) && ColVerifications(board,col, String.valueOf(randomNumber)) && RowVerifications(board,row, String.valueOf(randomNumber))) {
                board[row][col] = String.valueOf(randomNumber);
                verificationBoard[row][col] = String.valueOf(randomNumber);
            } else {
                i--;
            }
        }

        while (!complete && counter <= 80) {
            display.printBoard(board);
            Sudoku(board, verificationBoard);
            restartOption(board, verificationBoard);
            SudokuSolution(board);
            counter++;
        }
    }*/


    /*public boolean RowVerifications(String[][] array, int row,  String number) {

        for (int i = 0; i < 9; i++) {
            if (Objects.equals(array[row][i], number)) {
                return false;
            }
        }
        return true;
    }

    public boolean ColVerifications(String[][] array, int col,  String number) {

        for (int i = 0; i < 9; i++) {
            if (Objects.equals(array[i][col], number)) {
                return false;
            }
        }
        return true;
    }

    public boolean BoxVerifications(String[][] array, int row, int col, String number){

        int boardRow = row - (row % 3);
        int boardColumn = col - (col % 3);
        for (int i = boardRow; i < boardRow + 3; i++) {
            for (int j = boardColumn; j < boardColumn + 3; j++) {
                if (Objects.equals(array[i][j], number)) {
                    return false;
                }
            }
        }
        return true;
    }*/

   /* public void SudokuSolution(String[][] array) {

        Scanner sc = new Scanner(System.in);
        System.out.print("To see the solution press enter");
        String enter = sc.nextLine();
        if (enter.equals(" ")) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (Objects.equals(array[i][j], " ")) {
                        for (int k = 1; k <= 9; k++) {
                            if (BoxVerifications(array, i, j, String.valueOf(k)) && ColVerifications(array, j, String.valueOf(k)) && RowVerifications(array, j, String.valueOf(k))) {
                                array[i][j] = String.valueOf(k);
                            }
                        }
                    }
                }
            }
        }
    }*/




