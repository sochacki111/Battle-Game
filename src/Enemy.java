public class Enemy {

    //Constructor
    public Enemy(int newHealth, int newAttack, int newMovement, String newName) {
        health = newHealth;
        attack = newAttack;
        movement = newMovement;
        name = newName;

        int randNumX;
        int randNumY;

        do {
            randNumX = (int) (Math.random() * Battlefield.maxXBoardSpace);
            randNumY = (int) (Math.random() * Battlefield.maxYBoardSpace);

        }while (Battlefield.battlefield[randNumX][randNumY] != ' ');

        this.xPosition = randNumX;
        this.yPosition = randNumY;
        this.nameChar1 = this.name.charAt(0);

        Battlefield.battlefield[this.xPosition][this.yPosition] = this.nameChar1;
        numOfMonsters ++;

    }



    //private fields
    private int health = 100;
    private int attack = 5;
    private int movement = 10;
    private boolean alive = true;

    //public fields
    public int xPosition = 0;
    public int yPosition = 0;
    public char nameChar1 = 'E';
    public int numOfMonsters = 0;
    public String name = "Scare Enemy"; // should keep public fields as few as possible
    public final String TOMBSTONE = "HERE LIES A DEAD MONSTER.";

    //getters and setters
    public int getHealth() {
        return health;
    }

    public void setHealth(int decreaseHealth) {
        this.health = -decreaseHealth;
        if (this.health<0) {
            alive = false;
        }
    }

    public int getAttack() {
        return attack;
    }

    public int getMovement() {
        return movement;
    }

    public boolean isAlive() {
        return alive;
    }

    //functions
    public void move () {

        int direction = (int) (Math.random() * 4);

        switch (direction) {
            case 0:
                if (yPosition - 1 < 0)
                    break;
                else if (Battlefield.battlefield[xPosition][yPosition-1] != ' ') // czy można połączyć z powyższym warunkiem?
                    break;
                Battlefield.battlefield[xPosition][yPosition] = ' ';
                yPosition --;
                break;

            case 1:
                if (xPosition - 1 < 0)
                    break;
                else if (Battlefield.battlefield[xPosition-1][yPosition] != ' ')
                    break;
                Battlefield.battlefield[xPosition][yPosition] = ' ';
                xPosition --;
                break;

            case 2:
                if (yPosition + 1 > 9)
                    break;
                else if (Battlefield.battlefield[xPosition][yPosition+1] != ' ')
                    break;
                Battlefield.battlefield[xPosition][yPosition] = ' ';
                yPosition ++;
                break;

            case 3:
                if (xPosition + 1 > 9)
                    break;
                else if (Battlefield.battlefield[xPosition+1][yPosition] != ' ')
                    break;
                Battlefield.battlefield[xPosition][yPosition] = ' ';
                xPosition ++;
                break;
            case 4:
                break;

            default:
                break;
        }
        Battlefield.battlefield[xPosition][yPosition] = nameChar1;

    }



}
