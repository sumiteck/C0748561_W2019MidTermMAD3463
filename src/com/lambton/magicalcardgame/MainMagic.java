package com.lambton.magicalcardgame;

import java.util.Scanner;

public class MainMagic {

    public static void main(String[] arg) {


        MagicalCardGameModel magicalCardGameModel = new MagicalCardGameModel();
        MagicalCardGameCalculator magicalCardGameCalculator = new MagicalCardGameCalculator();
        String[][] matrix = {{"9", "2", "6"}, {"j", "l", "q"}, {"7", "8", "5"}};
        magicalCardGameModel.setCardList(matrix);
        showMatrix(magicalCardGameModel.getCardList());
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the column Number which contains your card");
        magicalCardGameModel.setFirstShuffleColPos(scan.nextLine());
        magicalCardGameCalculator.getFirstShuffleResult(magicalCardGameModel);


    }

    private static void showMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
