package com.lambton.magicalcardgame;

public class MagicalCardGameModel  {


    String firstShuffleColPos;
    String secShuffleColPos;
    String[][]cardList=null;
    String[][]firstShuffle=null;
    String[][]secShuffle=null;
    String guessedCard;


    public String[][] getFirstShuffleResult(MagicalCardGameModel magicalCardGameModel) {
        return new String[0][];
    }

    public String[][]
    getSecShuffleResult(MagicalCardGameModel magicalCardGameModel) {
        return new String[0][];
    }


    public String getFinalResult(MagicalCardGameModel magicalCardGameModel) {
        return null;
    }
}
