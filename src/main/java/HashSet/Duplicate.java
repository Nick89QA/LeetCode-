package HashSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Duplicate {
    public static void main(String[] args) {
        //Получить сумму элементов массива
        int[] numbers = {1, 2, 3, 45, 66};
        int res = 0;
        for (int i = 0; i < numbers.length; i++) {
            res = res + numbers[i];//на каждой итерации добавляем элемент
        }

        System.out.println(" Result " + res);
/////////////////////////////////////////////////////////////

        // Найти наибольшее число в масиве и вывести на экран
        int[] nums1 = {2, 12, 3, 3, 34, 555};
        int max = nums1[0]; // создание переменной
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] > max) {
                max = nums1[i];
            }
        }
        System.out.println(" Big number " + max);

/**
 * Решение с помошью List integer нахождение наименьшого числа
 */

        List<Integer> nums3 = Arrays.asList(4, 9, -2, 11, 0);
        int min = Collections.max(nums3);
        System.out.println(" Макс число " + min);

/**
 * Решение с помошью List integer нахождение четного числа
 *
 */
        List<Integer> nums4 = Arrays.asList(4, 44, 44, 33, 21, 223);
        for (int num : nums4) {
            if (num % 2 == 0) {
                System.out.println(" Четное число " + num);
            }
        }


        /**
         * варианты цикла FOR
         */
        //стандартный цикл for
        int[] num5 = {1, 12, 3, 4, 5};
        for (int i = 0; i < num5.length; i++) {

        }

        //расширеный цикл foreach
        List<Integer> nums6 = Arrays.asList(1, 2, 3, 4, 56, 77, 775);
        for (int num : nums6) { //для обхода масива или коллекций List, set
            if (num % 2 == 0) {
                System.out.println(" Нашли четное число " + num);
            }
        }
    }

}

