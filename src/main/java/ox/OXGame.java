package ox;

public class OXGame {

    private String[][] table;

    OXGame(){
        initialTable(3,3);
    }

    OXGame(int height, int width){
        initialTable(height,width);
    }

    private void  initialTable(int height, int width){
        this.table = new String[height][width];
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                table[i][j] = "";
            }
        }
    }

    public String[][] getTable(){
        return this.table;
    }

    public Player getPlayer(String symbol){
        return new Player(symbol);
    }

    public void playWith(Player player, int x, int y){
        this.table[x][y] = player.getSymbol();
    }
}
