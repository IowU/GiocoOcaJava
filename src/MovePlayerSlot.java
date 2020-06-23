import java.util.Random;

public class MovePlayerSlot extends Slot {
    public MovePlayerSlot() {
        Random random = new Random();
        int randomNumber = (random.nextInt(Board.MAX_SLOT - 1));
        int randomNumberFinal = (randomNumber - (randomNumber * 2 * random.nextInt(1)));
        setEffetto(randomNumberFinal);

        while (Math.abs(randomNumberFinal) % 8 == 0) {
            randomNumber = (random.nextInt(Board.MAX_SLOT - 1));
            randomNumberFinal = (randomNumber - (randomNumber * 2 * random.nextInt(1)));
            setEffetto(randomNumberFinal);
        }

        while (getPosizione() == 4 && randomNumberFinal % 4 == 0) {
            randomNumber = (random.nextInt(Board.MAX_SLOT - 1));
            randomNumberFinal = (randomNumber - (randomNumber * 2 * random.nextInt(1)));
            setEffetto(randomNumberFinal);
        }
    }
}
