public class Main {

    public static void main (String[] args) {

        Battlefield.buildBattlefield();
        Enemy[] enemies = new Enemy[28];

        enemies[0] = new Enemy(100,32,10,"Twerk");
        enemies[1] = new Enemy(233,5,6,"Qwerk");
        enemies[2] = new Enemy(311,87,3,"Dwerk");
        enemies[3] = new Enemy(900,4,8,"Hwerk");
        enemies[4] = new Enemy(434,87,2,"Gwerk");


        Utilities.clear();
        int i;

        while (true) {
            Battlefield.redrawBattlefield();
            i = 0;
            while (i < 5) {
                enemies[i].move();
                i ++;
            }
            Utilities.delay();
            Utilities.clear();
        }



    }
}