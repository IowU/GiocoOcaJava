import java.util.Random;

public class MovePlayerSlot extends Slot {
    public MovePlayerSlot() {
//        Random random = new Random();
//        int randomNumber = (random.nextInt(Board.MAX_SLOT - 1));
//        int randomNumberFinal = (randomNumber - (randomNumber * 2 * random.nextInt(1)));
//        setEffetto(randomNumberFinal);
    }

    public MovePlayerSlot(Slot[] board, int slot) {
        Random random = new Random();
        int randomNumber = (random.nextInt(Board.MAX_SLOT - 1));
        int randomNumberFinal = (randomNumber - (randomNumber * 2 * random.nextInt(1)));
        setEffetto(randomNumberFinal);
    }

}
