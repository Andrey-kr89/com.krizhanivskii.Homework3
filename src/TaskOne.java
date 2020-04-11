import java.sql.Array;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите массив чисел в одну строку. Используйте пробел для разделения элементов. Для окончания ввода нажмите Enter");

        String arrayStringInput = scanner.nextLine();

        while (!arrayStringInput.matches("^[0-9 \\s -?\\\\d+]*$")) {
            System.out.println("массив должен содержать только числа");
            arrayStringInput = scanner.nextLine();
        }
        String [] array1  = arrayStringInput.split(" ");

        int [] arrayM = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            arrayM[i] = Integer.parseInt(array1[i]);}

        int minValue = arrayM[0];
        int maxValue = arrayM[0];
        int repeatFive = 0;
        for (int i = 0; i < array1.length; i++) {
              if (arrayM[i] < minValue) {minValue = arrayM[i];}
              if (arrayM[i] > maxValue) {maxValue = arrayM[i];}
              if (arrayM[i] == 5) { repeatFive++; }
            }

        System.out.println("Минимальное число в массиве - " + minValue + ". Максимальное число в массиве - " + maxValue);

        if (repeatFive > 0) { System.out.println("Число 5 повторяется " + repeatFive + "раз"); }
        else {System.out.println("Число 5 не встречается"); }


        for (int i = 1; i < arrayM.length; i++) {
            int temp = arrayM[i];
            int j = i - 1;
            while(j >= 0 && temp < arrayM[j]) {
                arrayM[j+1] = arrayM[j];
                j--;
            }
           arrayM[j+1] = temp;
        }

        System.out.println("отсортированный массив:");
        for (int item : arrayM) {
            System.out.print(item + " ");
        }
        System.out.println();

        int countmax = 1;
        int countmin = 1;
        int [] arrayR = new int[arrayM.length];

            for (int i = 0; i < arrayM.length; i++) {
                int count = 0;
                for (int value : arrayM) {
                    if (arrayM[i] == value) {
                        count++;
                    }
                    arrayR[i] = count;
                }
            }

        for (int value : arrayR) {
            if (value < countmax) {
                countmax = value;
            }
            if (value > countmin) {
                countmin = value;
            }
        }
        System.out.println();
        System.out.println("Максимум повторений чисел в массиве: " + countmax);
        System.out.println("Минимум повторений чисел в массиве: " + countmin);

    }

}