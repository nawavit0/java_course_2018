package com.example.demo;

public class TennisGame2 {

    private int player1Point = 0;
    private int player2Point = 0;
    private String player1Result = "";
    private String player2Result = "";

    public TennisGame2(String player1Name, String player2Name) {

    }

    public String getScore(){
        String score = "";
        if (player1Point >=4 && player2Point >=0 && (player1Point - player2Point)>=2)
        {
            return "Win for player1";
        }
        if (player2Point >=4 && player1Point >=0 && (player2Point - player1Point)>=2)
        {
            return"Win for player2";
        }
        if (player1Point > player2Point && player2Point >= 3)
        {
            return "Advantage player1";
        }

        if (player2Point > player1Point && player1Point >= 3)
        {
            return "Advantage player2";
        }
        if (isAll())
        {
            return setScoreWord(player1Point) + "-All";
        }
        if (player1Point == player2Point && player1Point >=3)
            return "Deuce";

        if (player1Point < 4 && player2Point < 4 && player1Point >=0 && player2Point >= 0)
        {
            return setScoreWord(player1Point) + "-" + setScoreWord(player2Point);
        }

        return score;
    }

    private boolean isAll() {
        return player1Point == player2Point && player1Point < 3;
    }

    public String setScoreWord(int point){
        String[] scores = {"Love","Fifteen","Thirty","Forty"};
        if(point>=0&&point<4) return scores[point];
        else return "";
    }

    public void SetP1Score(int number){

        for (int i = 0; i < number; i++)
        {
            P1Score();
        }

    }

    public void SetP2Score(int number){

        for (int i = 0; i < number; i++)
        {
            P2Score();
        }

    }

    public void P1Score(){
        player1Point++;
    }

    public void P2Score(){
        player2Point++;
    }

    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}