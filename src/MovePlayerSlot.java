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
//        int randomNumberFinal = (randomNumber - (randomNumber * 2 ));
        if (randomNumberFinal >= 0){
            setEffetto(randomNumberFinal);
        }
        // Se indicePosizioneAttuale - randomNumberFinal = MovePlayerSlot Allora controllo MovePlayerSlot.getEffetto();
        else {
                while (slot > -randomNumberFinal){
                    randomNumber = (random.nextInt(Board.MAX_SLOT - 1));
                    randomNumberFinal = (randomNumber - (randomNumber * 2 * random.nextInt(1)));
                }
                System.out.println(String.format("La casella random ti sposta di %d",randomNumberFinal));
             if ( board[slot + randomNumberFinal].getEffetto() != - randomNumberFinal){
                setEffetto(randomNumberFinal);
            }
        }
    }
}


//    public MovePlayerSlot(Slot[] board, int slot){
//        boolean t = true;
//        Random random=new Random();
//        int randomNumber=0;
//        while(t){
//            randomNumber=(random.nextInt(125)-63);
//            if(randomNumber>0 ){
//                if(slot+randomNumber<=Board.MAX_SLOT-1)
//                    t=false;
//            }
//            else if(slot+randomNumber>=0){
//                if(board[slot+randomNumber].getEffetto()!=(-randomNumber)){
//                    t=false;
//                }
//            }
//        }
//        setEffetto(randomNumber);
//    }