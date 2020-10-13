import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Cell cell = new Cell(5,5, true);
        cell.populate();

        for (int i = 0; i < cell.getHeight(); i++) { //En funktion för att skriva ut om cellen lever eller inte, lycka till! :D
             for (int j = 0; j < cell.getWidth();) {
                 if (cell.getAlive() == true) {
                     System.out.print(1);
                 }
                 else {
                     System.out.print(0);
                 }
            }
             System.out.println();
        }


            //   if (cell[x, y].getAlive() == 1) { // Oklart vad som händer här
            // }
/*
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
*/
        }
    }
