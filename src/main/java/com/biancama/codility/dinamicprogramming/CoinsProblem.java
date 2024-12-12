package com.biancama.codility.dinamicprogramming;

public class CoinsProblem {
    int minimumCoins(int coins[], int size, int V)
    {
        // table[i] will store minimum value of coins
        int table[] = new int[V + 1];

        //esge case if table elements are zero
        table[0] = 0;

        // Initializing all table values as infinite
        for (int i = 1; i <= V; i++)
            table[i] = Integer.MAX_VALUE;

        for (int i = 1; i <= V; i++)
        {
            for (int j = 0; j < size; j++)
                if (coins[j] <= i)
                {
                    int sub_res = table[i - coins[j]];
                    if (sub_res != Integer.MAX_VALUE
                            && sub_res + 1 < table[i])
                        table[i] = sub_res + 1;
                }

        }

        if(table[V]==Integer.MAX_VALUE)
            return -1;

        return table[V];

    }


}
