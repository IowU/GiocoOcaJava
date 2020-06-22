public class Player {
    private Slot position;
    private int score;
    private boolean hasWon = false;

    public int rollDice() {
        int dice1 = (int) (Math.random() * 6 + 1);
        int dice2 = (int) (Math.random() * 6 + 1);
        System.out.println(String.format("Hai rollato %d e %d", dice1, dice2));
        return dice1 + dice2;
    }

    public Slot getPosition() {
        return position;
    }

    public void setPosition(Slot position) {
        this.position = position;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isHasWon() {
        return hasWon;
    }

    public void setHasWon(boolean hasWon) {
        this.hasWon = hasWon;
    }
}
