import java.io.*;
import java.nio.channels.FileChannel;


public class SafeCopyFile {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File source = new File("C:\\Users\\Serega\\Desktop\\UserIo\\Valera.txt");
        File dest = new File("C:\\Users\\Serega\\Desktop\\UserIo\\Valera22222222.txt");
        FileInputStream fileInputStream = null;
        FileOutputStream outputStream = null;


        try {

            fileInputStream = new FileInputStream(source);
        } catch (IOException e) {
            System.out.println("Файл не существует.");
        }
        try {
            fileInputStream = new FileInputStream(source);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Введите повторно ссылку");
        try {
            outputStream = new FileOutputStream(reader.readLine());
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        while (true) {
            try {
                if (!(fileInputStream.available() > 0)) break;
            } catch (IOException exception) {
                exception.printStackTrace();
            }

            try {
                outputStream.write(fileInputStream.read());
            } catch (IOException exception) {
                exception.printStackTrace();
            }


        }
    }
}





