package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int counter = 0;

        if(j <= k){
            for(int i = 0; i < k; i+=j)
                counter++;
        }else{

            for(int i = 1; i <= k%j; i++)
                counter++;
        }







        return counter;
    }
}
