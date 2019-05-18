package edu.mum.cs.cs425.lab9.question7;

import edu.mum.cs.cs425.lab9.question7.service.ArrayFlattenerService;

public class ArrayReversor {
    private ArrayFlattenerService arrayFlattenerService;

    public ArrayReversor(ArrayFlattenerService arrayFlattenerService){
        this.arrayFlattenerService = arrayFlattenerService;
    }
    public int[] reversedArray(int [][] a_in){
        int[] a_flat = arrayFlattenerService.flattenArray(a_in);
        //int[] a_flat = new int[]{1,3,0,4,5,9};
        if(a_flat == null)
            return null;
        int i = 0;
        int j = a_flat.length - 1;
        while(i < j) {
            int temp = a_flat[i];
            a_flat[i] = a_flat[j];
            a_flat[j] = temp;
            i++;
            j--;
        }
        return a_flat;
    }


}
