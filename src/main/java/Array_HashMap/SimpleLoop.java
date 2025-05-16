package Array_HashMap;

public class SimpleLoop {
    public static void main(String[] args) {
        /**
         * вывод элементов масива вместе с индексом
         */

        int nums1[] = {1, 2, 4, 5}; //declaring an array


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
        int nums2[] = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] % 2 == 0) {
                System.out.println(" This is an even number " + nums2[i]);
            } else {
                System.out.println("This is odd number " + nums2[i]);
            }
        }
        /**
         * перебрать все уникальные пары чисел в массиве
         */

        int[] sum4 = {1, 2, 4, 5, 5, 6, 4, 5};
        for (int i = 0; i < sum4.length; i++) {
            for (int j = i + 1; j < sum4.length; j++) {
                System.out.println(" Pair " + sum4[i] + " and " + sum4[j]);
                // if (sum4[i] + sum4[j] == target4){
                //  System.out.println( i + " " + j );
                //}

            }
        }
        /**
         *    Two Sum
         */
        int[] sum5 = {1, 2, 33, 333, 443, 45};
        int target5 = 3;
        for (int i = 0; i < sum5.length; i++) {
            for (int j = i + 1; j < sum5.length; j++) {
                if (sum5[i] + sum5[j] == target5) {
                    System.out.println(" Indices " + i + " and " + j);
                }
            }
        }

    }
}

