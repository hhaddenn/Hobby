import java.util.*;


public class Jogo_Do_Galo{

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
    public static void main(String[] args) {
        char [][] gameBoard = { {' ', '|', ' ', '|', ' '},
                                {'-', '+', '-', '+', '-'},
                                {' ', '|', ' ', '|', ' '},
                                {'-', '+', '-', '+', '-'},
                                {' ', '|', ' ', '|', ' '}};
        printGameBoard(gameBoard);

        while (true) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Escolhe a posição onde queres meter a figura (1-9): ");
            int playerPos = ler.nextInt();
            while (playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)) {
                System.out.println("Posição incorreta! Escolhe uyma posição válida");
                playerPos = ler.nextInt();
            }
            placePiece(gameBoard, playerPos, "player");
            printGameBoard(gameBoard);
            String result = checkWinner();
            if (result.length()>0) {
                System.out.println(result);
                break;
            }
            System.out.println();
            Random rand = new Random();
            int cpuPos = rand.nextInt(9) + 1;
            while (playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
                cpuPos = rand.nextInt(9) + 1;
            }
            placePiece(gameBoard, cpuPos, "cpu");
            printGameBoard(gameBoard);

            result = checkWinner();
            if (result.length()>0) {
                System.out.println(result);
                break;
            }
        }
    }

    public static void printGameBoard(char [][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    
    public static void placePiece(char[][] gameBoard, int pos, String user) {

        char simbolo = ' ';

        if (user.equals("player")) {
            simbolo = 'X';
            playerPositions.add(pos);
        } else if (user.equals("cpu")) {
            simbolo = 'O';
            cpuPositions.add(pos);
        }

        switch (pos) {
            case 1:
                gameBoard[0][0] = simbolo;
                break;
            case 2:
                gameBoard[0][2] = simbolo;
                break;
            case 3:
                gameBoard[0][4] = simbolo;
                break;
            case 4:
                gameBoard[2][0] = simbolo;
                break;
            case 5:
                gameBoard[2][2] = simbolo;
                break;
            case 6:
                gameBoard[2][4] = simbolo;
                break;
            case 7:
                gameBoard[4][0] = simbolo;
                break;
            case 8:
                gameBoard[4][2] = simbolo;
                break;
            case 9:
                gameBoard[4][4] = simbolo;
                break;
            default:
                break;
        }
    }

    public static String checkWinner() {
        
        List topRow   = Arrays.asList(1, 2, 3);
        List midRow   = Arrays.asList(4, 5, 6);
        List botRow   = Arrays.asList(7, 8, 9);
        List leftCol  = Arrays.asList(1, 4, 7);
        List midCol   = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List cross1   = Arrays.asList(1, 5, 9);
        List cross2   = Arrays.asList(7, 5, 3);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for (List l : winning) {
            if (playerPositions.containsAll(l)) {
                return "Ganhaste um jogo do galo! Estavas á espera de um prémio?";
            } else if (cpuPositions.containsAll(l)) {
                return "Parabéns, perdeste para um computador!";
            } else if(playerPositions.size() + cpuPositions.size() == 9) {
                return "Conseguiste empatar o jogo, Parabéns!";
            }
        }

        return ""; 
    }
}