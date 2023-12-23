import java.util.*;

public class Game {
    private static boolean gameRunning = true;

    public static void main(String[] args) {
        System.out.println("Welcome to the game ! \n" +
                "Enter the name of your character: ");
        Scanner s = new Scanner(System.in);
        String nameOfChar = s.next();
        System.out.println("Classes are Barbarian,Rogue and Wizard.\n" +
                "Which one would you like to choose ?\n" +
                "Please enter as B,R or W. ");
        char classOfChar = s.next().charAt(0);
        Character userChar;
        switch (classOfChar) {
            case 'B':
                userChar = new Character(0, 1, 0, 2, nameOfChar, 1, 10, 10, 0, null, true);
                break;
            case 'R':
                userChar = new Character(1, 0, 0, 1, nameOfChar, 1, 10, 10, 0, null, true);
                break;
            case 'W':
                userChar = new Character(0, 0, 1, 1, nameOfChar, 1, 10, 10, 0, null, true);
                break;
            default:
                System.out.println("Please input valid values !");
                return;
        }
        Lib lib = new Lib();
        Map gameMap = new Map();
        gameMap.generateMap();
        userChar.setStartingLoc(1, gameMap.height - 2);
        lib.level1.setStartingLoc(50, gameMap.height - 2);
        System.out.println("In order to move please use W,A,S,D ");
        while (gameRunning) {
            gameMap.insertChar(userChar);
            gameMap.insertChar(lib.level1);
            gameMap.updateMap();
            char c = s.next().charAt(0);
            if (gameMap.checkLoc(userChar, c)) {
                int x = userChar.getLocX(), y = userChar.getLocY();
                userChar.move(c);
                gameMap.previousStateCleaner(x, y);
            } else {
                System.out.println("Something is in the way !");
            }
            while(lib.level1.getHealth() == 0 || lib.level2.getHealth() == 0|| lib.level3.getHealth() == 0|| lib.level4.getHealth() == 0 )
            {
                switch (userChar.getLevel()){
                    case 2 -> {
                        lib.level2.setStartingLoc(50,gameMap.height-2);
                        gameMap.insertChar(lib.level2);
                    }
                    case 3 -> {
                            lib.level3.setStartingLoc(50,gameMap.height-2);
                            gameMap.insertChar(lib.level3);
                    }case 4 -> {
                        lib.level4.setStartingLoc(50,gameMap.height-2);
                        gameMap.insertChar(lib.level4);
                    }
                }
                gameMap.updateMap();
            }
        }
    }
}
