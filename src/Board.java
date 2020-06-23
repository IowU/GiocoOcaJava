public class Board {

    public static final int MAX_SLOT = 63;
    private Player player1;
    private Player player2;
    public int prova;

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public void setBoard(Slot[] board) {
        this.board = board;
    }

    private Slot[] board = new Slot[MAX_SLOT];

    public Slot[] getBoard() {
        return board;
    }

    public Board() {
        player1 = new Player();
        player2 = new Player();

        for (int i = 0; i < board.length; i++) {
            if (i == 4) {
                board[i] = new MovePlayerSlot();
                board[i].setPosizione(i);
            } else if (i % 8 == 0 && i != 0) {
                board[i] = new MovePlayerSlot();
                board[i].setPosizione(i);
            } else board[i] = new EmptySlot();
            board[i].setPosizione(i);
        }

        player1.setPosition(board[0]);
        player2.setPosition(board[0]);
    }

    // metodo spostamento: lanciato il dado ti muovi del numero di caselle indicate, e controlli l'effetto della casella per
    //Vedere se devi spostarti ancora. Se capiti esattamente sulla 63 hai vinto

    public void movement(Player giocatore) {
        int rolledPosition = giocatore.rollDice();

        if (giocatore.getPosition().getPosizione() + rolledPosition > Board.MAX_SLOT - 1) {
            giocatore.setPosition(board[Board.MAX_SLOT - 1 - rolledPosition - (Board.MAX_SLOT - 1 - giocatore.getPosition().getPosizione())]);
        } else giocatore.setPosition(board[giocatore.getPosition().getPosizione() + rolledPosition]);

        while (giocatore.getPosition().getEffetto() != 0) {
            int currentPosition = giocatore.getPosition().getPosizione();
            int currentEffect = giocatore.getPosition().getEffetto();

            if (currentPosition + currentEffect > Board.MAX_SLOT - 1) {
                System.out.println(currentPosition);
                System.out.println(currentEffect);
                int difference = (currentPosition + currentEffect) - (Board.MAX_SLOT - 1);
                System.out.println(difference);
                giocatore.setPosition(board[Board.MAX_SLOT - 1 - difference]);
            } else if (currentPosition + currentEffect < 0) {
                int difference = currentEffect + currentPosition;
                difference = (difference < 0) ? difference * - 1 : difference;
                giocatore.setPosition(board[currentPosition + difference]);
            } else {
                giocatore
                        .setPosition(board[currentPosition + currentEffect]);
            }
        }
    }
}


//ArrayIndexOutOfBoundsException

