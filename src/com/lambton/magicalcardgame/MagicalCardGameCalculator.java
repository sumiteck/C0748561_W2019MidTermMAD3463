package com.lambton.magicalcardgame;

public class MagicalCardGameCalculator {



    public static void shuffle(int card[], int n)
    {

        Random rand = new Random();

        for (int i = 0; i < n; i++)
        {
            // Random for remaining positions.
            int r = i + rand.nextInt(52 - i);

            //swapping the elements
            int temp = card[r];
            card[r] = card[i];
            card[i] = temp;

        }
    }
}
