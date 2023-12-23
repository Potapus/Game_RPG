public class Map {
    public final int height = 16;
    public final int width = 100;
    public final char[][] map = new char[height][width];

    public void generateMap() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1) {
                    map[i][j] = '-';
                } else {
                    if (j == 0 || j == width - 1) {
                        map[i][j] = '|';
                    } else {
                        map[i][j] = ' ';
                    }
                }
            }
        }
    }

    public void insertChar(Character cha) {
        int x = cha.getLocX(), y = cha.getLocY();
        if (cha.getFriend()) {
            map[y][x] = 'O';
        } else {
            map[y][x] = 'X';
        }
    }

    public boolean checkLoc(Character userCharacter, char c) {
        int X = userCharacter.getLocX(), Y = userCharacter.getLocY();
        return switch (c) {
            case 'W' -> Y - 1 >= 0 && map[--Y][X] == ' ';
            case 'A' -> X + 1 < map[0].length && map[Y][--X] == ' ';
            case 'S' -> Y + 1 < map.length && map[++Y][X] == ' ';
            case 'D' -> X - 1 >= 0 && map[Y][++X] == ' ';
            default -> {
                System.out.println("Invalid input!");
                yield false;
            }
        };
    }
    public void updateMap() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
    public void previousStateCleaner(int x,int y)
    {
        map[y][x]= ' ';
    }
}
