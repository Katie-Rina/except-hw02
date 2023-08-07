// Ввод пустой строки

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class t04 {
public static void main(String[] args) throws Exception {

    { BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s = null;

    try {
        s = reader.readLine();

    } catch (IOException e) {
        System.out.println(e + "что-то не то");

    } finally {

        try {
            reader.close();

        } catch (IOException e) {
            System.out.println(e + "что-то не то");
        }
    }

    if (s.equals("")) {

        throw new Exception("Строка не может быть пустой!");
    }

}
}
}