// Задание 2
public class t02 {
   public static void main(String[] args) {      
   
try {
   int d = 0;
   // Оставляю здесь только число 8, т.к. массив intArray не был задан   
   double catchedRes1 = 8 / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
}
}
