// Ввод числа

import java.util.InputMismatchException;
import java.util.Scanner;

public class t01 {
public static void main(String[] args) {
    boolean flag = false;
    while (flag == false) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите число: ");       

    try {  
        Float num = in.nextFloat();
        // Float.parseFloat(str);          
        flag = true;
        System.out.printf("Ваше число: " + num);
        in.close();
    } catch(InputMismatchException e) {  
    flag = false;
    System.out.println("Это не число!");
          
    }
}
}
}
