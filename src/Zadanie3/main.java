package Zadanie3;
import java.util.Arrays;
public class main {
    public static void main(String[] args) {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] mass1 = new int[100];
        int[] mass2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] mass3 = new int [5][5];
        int[] mass5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};


//        1. Задать целочисленный масnсив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//        С помощью цикла и условия заменить 0 на 1, 1 на 0;
        for (int i = 0; i < 10; i++) {
            if (mass[i] < 1)
                System.out.print(1 + ",");
            else
                System.out.print(0 + ",");
        }
        System.out.println();

//        2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

        for (int i = 0; i < mass1.length; i++){
            System.out.println(i + 1);
        }
//        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        for (int i = 0; i < 12; i++) {
            if (mass2[i] < 6)
                System.out.print(mass2[i] * 2 + ", ");
            else
                System.out.print(mass2[i] + ", ");
        }
        System.out.println();
//        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//                и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
//                если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких
//        элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        for (int i = 0; i < mass3.length; i++) {
            for (int j = 0; j < mass3.length; j++){
                if (i == j){
                    mass3[i][j] = 1;
                }

            }

//            mass3[0][0] = 1;
//            mass3[1][1] = 1;
//            mass3[2][2] = 1;
//            mass3[3][3] = 1;
//            mass3[4][4] = 1;
//            mass3[0][4] = 1;
//            mass3[1][3] = 1;
//            mass3[2][2] = 1;
//            mass3[3][1] = 1;
//            mass3[4][0] = 1;
        }
        for (int i = 0; i < mass3.length; i++){
            for (int j = 0; j < mass3.length; j++){
                System.out.print(mass3[i][j] + " ");
            }
            System.out.println();
        }
//        6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

        int max = mass5[0];
        int min = mass5[0];
        for(int i = 0; i != mass5.length; i ++){
            if(mass5[i] > max){
                max = mass5[i];
            }
            if(mass5[i] < min){
                min = mass5[i];

            }
        }
        System.out.println("max: " + min + " min: " + max);
    }


}





