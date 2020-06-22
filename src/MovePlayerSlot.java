import java.util.Random;

public class MovePlayerSlot extends Slot{
public MovePlayerSlot(){
    Random random=new Random();
    int randomNumber=(random.nextInt(125)-63);
    setEffetto(randomNumber);
}
}
