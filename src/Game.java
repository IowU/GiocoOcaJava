public class Game {
private Board tabellone;

    public Board getTabellone() {
        return tabellone;
    }

    public void setTabellone(Board tabellone) {
        this.tabellone = tabellone;
    }

    public Game(){
    tabellone = new Board();
//    tabellone.getPlayer1().setPosition(new StartingSlot());
//    tabellone.getPlayer2().setPosition(new StartingSlot());

}

//metodo gioca un turno: lancia dadi, setta posizione giocatore, controlla se arriva esattamente sulla casella 63
public void playTurn(){
    tabellone.getPlayer1().rollDice();
}
}
