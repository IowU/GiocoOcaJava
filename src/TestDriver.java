public class TestDriver {
    public static void main(String[] args) {

        Game g = new Game();
        for (Slot c: g.getTabellone().getBoard()){
            System.out.println(c.getClass());
            System.out.println(c.getPosizione());
        }

        while(g.getTabellone().getPlayer1().getPosition().getPosizione() != Board.MAX_SLOT - 1 && g.getTabellone().getPlayer2().getPosition().getPosizione() != Board.MAX_SLOT -1) {
            System.out.println("La posizione del giocatore 1 è : " + g.getTabellone().getPlayer1().getPosition().getPosizione());
            System.out.println("La posizione del giocatore 2 è : " + g.getTabellone().getPlayer2().getPosition().getPosizione());
            g.getTabellone().movement(g.getTabellone().getPlayer1());
            g.getTabellone().movement(g.getTabellone().getPlayer2());
            System.out.println("La posizione del giocatore 1 dopo lo spostamento è : " + g.getTabellone().getPlayer1().getPosition().getPosizione());
            System.out.println("La posizione del giocatore 2 dopo lo spostamento è : " + g.getTabellone().getPlayer2().getPosition().getPosizione());
        }
        if (g.getTabellone().getPlayer1().getPosition().getPosizione() == Board.MAX_SLOT -1){
            System.out.println("Il giocatore 1 ha vinto");
        }
        else if (g.getTabellone().getPlayer2().getPosition().getPosizione() == Board.MAX_SLOT -1){
            System.out.println("Il giocatore 2 ha vinto");
        }
    }
}
