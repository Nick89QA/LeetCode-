package HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        //Получить сумму элементов массива
        int[] numbers = {1, 2, 3, 45, 66};
        int res = 0;
        for (int i = 0; i < numbers.length; i++) {
            res = res + numbers[i];//на каждой итерации добавляем элемент
        }

        System.out.println(" Result " + res);

        // Найти наибольшее число в масиве и вывести на экран
        int[] nums1 = {2, 12, 3, 3, 34, 555};
        int max = nums1[0]; // создание переменной
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] > max) {
                max = nums1[i];
            }
        }
        System.out.println(" Big number " + max);

    }

}

