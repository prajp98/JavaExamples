package com.java.concepts.basics;

public class Arrays {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] nums = new int[5];

        arr[2] = 99;  // updating value
        System.out.println(arr[2]); // 99

        //Length
        System.out.println(arr.length);

        //Iterate
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int num : arr) {
            System.out.println(num);
        }

        //Multi-dimensional array
        int[][] matrix = new int[2][3];
        int[][] values = {{1,2,3},{4,5,6}};

        System.out.println(values[0][1]); // 2
        values[1][2] = 99;
        System.out.println(values[1][2]); // 99

    }
}
