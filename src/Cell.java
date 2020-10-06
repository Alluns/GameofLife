public class Cell {
    private int x;
    private int y;
    private boolean oldAlive;
    private boolean newAlive;

    public Cell(int x, int y, boolean alive){
        this.x = x;
        this.y = y;
        this.oldAlive = alive;
        newAlive = false;
    }
    public boolean getAlive() {
        return oldAlive;
    }

}