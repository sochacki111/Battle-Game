import java.util.Arrays;

public class Battlefield {

    //fields
    static char[][] battlefield = new char[10][10];

    //private fields
    static int maxXBoardSpace = Battlefield.battlefield.length-1;
    static int maxYBoardSpace = Battlefield.battlefield[0].length-1;

    //functions
    public static void buildBattlefield() {
        for(char[] row : Battlefield.battlefield) {
            Arrays.fill(row, ' ');
        }
    }

    public static void redrawBattlefield() {
        int i = 0;

        while (i < 21) {
            System.out.print('-');
            i++;
        }
        System.out.println();

        for (i = 0; i < battlefield.length; i++) {
            for (int j = 0; j < battlefield[i].length; j++) {
                System.out.print("|" + battlefield[i][j]);
            }
            System.out.println('|');
        }

        i = 0;
        while (i < 21) {
            System.out.print('-');
            i++;
        }
        System.out.println();
    }

    //getters and setters

}
