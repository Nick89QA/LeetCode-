package Array_HashMap;

public class SimpleLoop {
    public static void main(String[] args) {
        /**
         * сумма двух чисел
         */

        int nums1[] = {1, 2, 4, 5}; //declaring an array
        int target = 3; //declaring integer

        // loop through array
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(" Element at index " + i + " = " + nums1[i]);
        }

        /**
         * Сумма чисел в массиве
         */
        //sum of all numbers in int array

        int nums[] = {5, 10, 15};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println(" Sum of all numbers in array " + sum);

        /**
         * Найти четное и нечетное число
         */
        // check if the number is even
        // if the number is separable
        int nums2[] = {1,2,3,4,5,6,7,8};
        for (int i=0; i< nums2.length;i++) {
            if(nums2[i] % 2 == 0){
                System.out.println(" This is an even number " + nums2[i]);
            }else {
                System.out.println("This is odd number " + nums2[i]);
            }
        }
    }
}

