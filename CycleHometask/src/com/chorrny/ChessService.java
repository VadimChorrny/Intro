package com.chorrny;

public class ChessService {
    public void ShowChessTable(int row,int square,char rowSymbol,char squareSymbol)
    {
        System.out.println("ABCDEFGHC");
        for (row = 8; row >= 1; row--)
        {
            System.out.println();
            for (square = 1;square <= 8;square++)
            {
                if((square + row) % 2 == 0)
                {
                    System.out.print(rowSymbol);
                }
                else
                {
                    System.out.print(squareSymbol);
                }
            }
            if(row % 8 == 0)
            {
                System.out.println(row);
            }
        }
        System.out.println();
        System.out.println("ABCDFGHC");
    }
}
