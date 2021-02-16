import java.io.*;


import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UserIO {
    public static void main(String[] args) {
        System.out.println("1 - чтение ");
        System.out.println("2 - запись ");
        Scanner scannerInput = new Scanner(System.in);
        int input = scannerInput.nextInt();
        BufferedReader reader = null;


        try {
            switch (input) {
                case 1 -> {
                    reader = new BufferedReader(new FileReader("C:\\Users\\Serega\\Desktop\\UserIo\\Гриша.txt"));
                    String line = reader.readLine();
                    System.out.println(line);
                }
                case 2 -> {
                    System.out.println("Введите Имя Файла");
                    String string = scannerInput.next();
                    File file = new File(("C:\\Users\\Serega\\Desktop\\UserIo\\" + string + ".txt"));
                    System.out.println("Введите Имя, Возраст, Город");
                    String name = scannerInput.next();
                    int age = scannerInput.nextInt();
                    String town = scannerInput.next();
                    Writer writer = new BufferedWriter(new OutputStreamWriter(
                            new FileOutputStream(file, true), StandardCharsets.UTF_8));
                             writer.append(name).append(", ").append(String.valueOf(age)).append(", ").append(town).append(".");
                             writer.close();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
