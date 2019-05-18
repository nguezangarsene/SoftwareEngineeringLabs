package edu.mum.cs.cs425.lab9.question6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFlattener {
    public Integer[] flattenArray(int[][] a_in){
        if(a_in == null){
            return null;
        }
        List<Integer> myList = new ArrayList<Integer>();
         for(int[] arr : a_in){
             for(int y : arr){
                 myList.add(y);
             }
         }
         return (Integer[])myList.toArray(new Integer[myList.size()]);
    }

    public int[] flattenArray2(int[][]a_in){
        if(a_in == null){
            return null;
        }
        return Arrays.stream(a_in).flatMapToInt(arr->Arrays.stream(arr)).toArray();
    }

}
