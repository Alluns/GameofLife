import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int width = 10;
        int height = 10;
        Cell[] cell = new Cell[width * height];

        int x = 0;  //Initialize x
        int y = 0;  //Initialize y

        for (int i = 0; i < width * height; i++) {
            Random random = new Random();   // generate a random number
            cell[i] = new Cell(x, y, random.nextBoolean()); // Create cell[i] with x and y coordinates, Set alive as either true or false

            x++;    //Increase x
            if (x > width - 1) {    //if x > width-1
                y++;    //Increase y by 1
                x = 0;  //Set x back to 0
            }
        }

        String test = "";
        int loop = 0;
        for (Cell value : cell) {
            if (value.getAlive()) {
                test += "\u25A1  ";
            } else {
                test += "\u25A0  ";
            }
            loop++;
            if (loop > width - 1) {
                System.out.println(test);
                test = "";
                loop = 0;
            }
        }
    }
}
