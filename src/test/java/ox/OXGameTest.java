package ox;

import org.junit.Test;

import static org.junit.Assert.*;

public class OXGameTest {

    @Test
    public void startGame_tableIsEmpty(){
        String[][] expectedTable = generateEmptyTable(3,3);
        OXGame game = new OXGame();
        String[][] actualTable = game.getTable();
        assertArrayEquals(expectedTable,actualTable);
    }

    @Test
    public void startGame_newTwoPlayer_scoreZero(){
        OXGame game = new OXGame();
        Player player1 = game.getPlayer("x");
        Player player2 = game.getPlayer("o");
        assertEquals(0,player1.getScore());
        assertEquals(0,player2.getScore());
    }

    @Test
    public void Player1_startToPlay_position_0_0(){
        OXGame game = new OXGame();
        Player player1 = new Player("x");
        game.playWith(player1,0,0);
        assertEquals("x", game.getTable()[0][0]);
    }

    @Test
    public void Player2_playNext_position_0_0(){
        OXGame game = new OXGame();
        Player player1 = new Player("x");
        Player player2 = new Player("o");
        game.playWith(player1,0,0);
        game.playWith(player2,1,0);
        assertEquals("x", game.getTable()[0][0]);
        assertEquals("o", game.getTable()[1][0]);
    }

    private String[][] generateEmptyTable(int height, int width){
        String[][] table = new String[height][width];
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                table[i][j] = "";
            }
        }
        return table;
    }
}
