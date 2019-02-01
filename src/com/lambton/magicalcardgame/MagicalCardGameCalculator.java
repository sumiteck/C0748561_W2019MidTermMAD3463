package com.lambton.magicalcardgame;

public class MagicalCardGameCalculator implements MagicalCardGameInterface {
    @Override
    public String[][] getFirstShuffleResult(MagicalCardGameModel magicalCardGameModel)  {
        String[][] finalMatrix = shuffleRows(magicalCardGameModel.getCardList());
        if (magicalCardGameModel.getFirstShuffleColPos().equalsIgnoreCase("1")){
            finalMatrix=shuffleRows(finalMatrix,1,2);
        }else if (magicalCardGameModel.getFirstShuffleColPos().equalsIgnoreCase("3")){
            finalMatrix=shuffleRows(finalMatrix,1,2);
            finalMatrix=shuffleRows(finalMatrix,2,3);
        }
        return finalMatrix;
    }

    private String[][] shuffleRows(String[][] cardList) {

        String interchange[][] = new String[3][3];
        for (int i = 0; i < cardList.length; i++) {
            for (int j = 0; j < cardList[i].length; j++) {
                interchange[i][j] = cardList[j][i];
            }

    }
        return interchange;
    }

    @Override
    public String[][] getSecShuffleResult(MagicalCardGameModel magicalCardGameModel) {
            String[][] finalMatrix = shuffleRows(magicalCardGameModel.getFirstShuffle());
            if (magicalCardGameModel.getSecShuffleColPos().equalsIgnoreCase("1")){
                finalMatrix=shuffleRows(finalMatrix,1,2);
            }else if (magicalCardGameModel.getSecShuffleColPos().equalsIgnoreCase("3")){
                finalMatrix=shuffleRows(finalMatrix,1,2);
                finalMatrix=shuffleRows(finalMatrix,2,3);
            }
            return finalMatrix;
    }

    @Override
    public String getFinalResult(MagicalCardGameModel magicalCardGameModel) {
        return null;
    }

    private  String[][] shuffleRows(String[][] change, int a, int b) {
        //x for 1 y for 2
        String temp;
        String[][] changeMatrix= change;
        for(int i = 0; i < 3; i++)
        {
            temp = changeMatrix[(a-1)][i];
            changeMatrix[a-1][i] = changeMatrix[b-1][i];
            changeMatrix[b-1][i] = temp;
        }
        return changeMatrix;
    }
}


