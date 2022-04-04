public class Dice {
    private int face;



    public Dice() {
        face = 1;
    }
    public int rollDice() {
        face = (int) ((Math.random() *6) +1);
        return face;
    }
}
