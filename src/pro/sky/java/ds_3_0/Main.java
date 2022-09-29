package pro.sky.java.ds_3_0;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание Массивы-2");
        task1();
        task2();
        task3();
        task4();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задание 1 *******************************************************************");
        int[] arr = generateRandomArray();
        int sumSpending = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sumSpending = sumSpending + arr[i];
        }
        System.out.println();
        System.out.println("Сумма трат за месяц составила " + sumSpending + " рублей");
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задание 2 *******************************************************************");
        int[] arr = generateRandomArray();
        int minSpending = -1;
        int maxSpending = 0;
        //arr[2] = 0; //для проверки
        for (int j : arr) {
            if (minSpending == -1) {
                minSpending = j;
                maxSpending = j;
            }
            if (j < minSpending) {
                minSpending = j;
            } else if (j > maxSpending) {
                maxSpending = j;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxSpending + " рублей\n");
    }

    public static void task3() {
        System.out.println("Задание 3 *******************************************************************");
        int[] arr = generateRandomArray();
        int sumMonth = 0;
        for (int j : arr) {
            sumMonth += j;
        }
        String averageSumDay = String.format("%.2f", (double) sumMonth / 30);
        System.out.println(Arrays.toString(arr));
        System.out.println("Средняя сумма трат за месяц составила " + averageSumDay + " рублей\n");
    }

    public static void task4() {
        System.out.println("Задание 4 *******************************************************************");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println(" - так стало, а было вот так: " + Arrays.toString(reverseFullName));
    }
}
