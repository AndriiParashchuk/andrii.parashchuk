package com.java.class22;

// Arrays - Container to hols more than one values of similar data  types
public class ArraysExample {

    public static void main(String[] args) {

        int data[];      // Declaration of array - Declaration will not initialize size in memory
        int a;           // 4 bytes

        // Initialize the array
        data = new int[5];

        //Declaration and Initialization is same line
        int salary[] = new int[100];
        //System.out.println(data1.length);

        //Declaration and assignment it the same line
        int nums[] = {10, 20, 30, 34, 45, 23, 45, 23, 12, 65, 23};

        //Length of the Array
        System.out.println(nums.length);  //11

        //Print value at particular index
        System.out.println(nums[4]);

        // Print all data from array
        System.out.println("===========Print all data from array===========");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
//
//        System.out.println(nums[0]);
//        System.out.println(nums[1]);
//        System.out.println(nums[2]);
//        System.out.println(nums[3]);
//        System.out.println(nums[4]);
//        System.out.println(nums[5]);
//        System.out.println(nums[6]);
//        System.out.println(nums[7]);
//        System.out.println(nums[8]);
//        System.out.println(nums[9]);
//        System.out.println(nums[10]);

        //Print default value of element of array
        System.out.println(salary[45]); // 0

        System.out.println(nums[21]); // error

    }
}
