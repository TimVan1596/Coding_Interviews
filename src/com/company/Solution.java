package com.company;

/**
 * @author TimVan
 * @date 2018/5/26 22:43
 */
class Solution {
    public boolean Find(int target, int [][] array) {

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                if(array[i][j] == target){
                    return true;
                }
            }
        }

        return false;
    }
}

