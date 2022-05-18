package sortingcollections;

import java.util.Arrays;

public class ArraysSorting {
    public static void main(String[] args) {
        int[] intArr={1,3,5,6,4,2,7,-1,0,-5,77,88,3};
        Arrays.sort(intArr);
        //in ascending order
        for(int i: intArr){
            System.out.print(i+" ");
        }
        //to print in the decending order, reverse the loop
        System.out.println();
        for(int i=intArr.length-1;i>=0;i--){
            System.out.print(intArr[i]+" ");
        }
    }
}
