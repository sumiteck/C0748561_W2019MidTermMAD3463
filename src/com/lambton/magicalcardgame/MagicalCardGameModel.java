package com.lambton.magicalcardgame;

import java.util.Arrays;

public class MagicalCardGameModel  {

String[][] magiccard={   {"1","6","7"},
        {"j","k","r"},
        {"4","5","8"}
};
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
