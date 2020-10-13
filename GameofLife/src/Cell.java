import java.util.Random;

public class Cell {
    private int x = 0;
    private int y = 0;
    private boolean oldAlive;
    private boolean newAlive;
    int width = 10;
    int height = 10;
    Cell[] cell = new Cell[width * height];

    public Cell(int x, int y, boolean alive) {
        this.x = x;
        this.y = y;
        this.oldAlive = alive;
        newAlive = false;
    }

    public Cell() {
        this.x = 0;
        this.y = 0;
        this.oldAlive = true;
        newAlive = false;
    }


    public void populate() {
        Random random = new Random();   // generate a random number
        for (int i = 0; i < width * height; i++) {
            cell[i] = new Cell(x, y, random.nextBoolean()); // Create cell[i] with x and y coordinates, Set alive as either true or false

            x++;    //Increase x
            if (x > width - 1) {    //if x > width-1
                y++;    //Increase y by 1
                x = 0;  //Set x back to 0
            }
        }
    }

    public Cell( boolean oldAlive){
            this.oldAlive = oldAlive;
        }

        public void update ( int neighbours){
            if (oldAlive) {
                if (neighbours < 2 || neighbours > 3) {
                    oldAlive = false;
                }
            } else {
                if (neighbours == 3) {
                    oldAlive = true;
                }
            }
        }

        public boolean getAlive() {
            return oldAlive;
        }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
