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
        String array1 [] = arrayStringInput.split(" ");

        int [] arrayM = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            arrayM[i] = Integer.parseInt(array1[i]);}

        int minValue = 0;
        int maxValue = 0;
        int repeatFive = 0;
        for (int i = 0; i < array1.length; i++) {
              if (arrayM[i] < minValue) {minValue = arrayM[i];}
              if (arrayM[i] > maxValue) {maxValue = arrayM[i];}
              if (arrayM[i] == 5) { repeatFive++; }
            }

        System.out.println("Минимальное число в массиве - " + minValue + ". Максимальное число в массиве - " + maxValue);

        if (repeatFive > 0) { System.out.println("Число 5 повторяется " + repeatFive + "раз"); }
        else {System.out.println("Число 5 не встречается"); }

        for (int i = 0; i < arrayM.length; i++) {
            for (int j = 0; j < arrayM.length; j++){
                
            }

        }


    }

}