import java.io.*;


public class SafeCopyFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Введите первую файл и второй");
            createReader(reader.readLine(), reader.readLine());
        } catch (FileNotFoundException exception) {
            System.out.println("Ошибка");
            System.out.println("Введите первый файл  и второй файл заново");
            createReader(reader.readLine(), reader.readLine());
        }
    }
    static public void createReader(String f1, String f2) throws IOException {
        String str = "";
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(f2);
        BufferedWriter bw = new BufferedWriter(fw);
        while ((str = br.readLine()) != null) {
            bw.write(str);
            bw.newLine();
            System.out.println("Скопировано");
            bw.flush();
        }
        br.close();
        bw.close();
    }
}