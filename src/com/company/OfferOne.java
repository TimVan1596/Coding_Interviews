package com.company;

//在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。


/**
 * @author 87702
* */
public class OfferOne {

    final private static int LEN = 5;

    public static void main(String[] args) {


        int[][] array = new int[LEN][LEN];

        for (int i = 0; i < LEN ; ++i) {
            for (int j = 0; j < LEN; ++j) {
                array[i][j] = i*10+j;
            }
        }

        Solution solution = new Solution();
        boolean result  = solution.Find(LEN,array);

        if (result){

        }
        else{

        }


    }
}
