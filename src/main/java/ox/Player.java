package ox;

public class Player {

    private int score;
    private String symbol;

    Player(){
        this.score = 0;
    }

    Player(String symbol){
        this.score = 0;
        this.symbol = symbol;
    }

    public int getScore(){
        return this.score;
    }

    public String getSymbol(){
        return this.symbol;
    }
}
