import java.io.*;


import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class UserIO {
    public static void main(String[] args) throws IOException {
        Scanner scannerInput = new Scanner(System.in);

        System.out.println("1 - чтение ");
        System.out.println("2 - запись ");

        int input = Integer.parseInt(scannerInput.nextLine());
        BufferedReader reader = null;
        ObjectOutputStream out;


        try {
            switch (input) {
                case 1 -> {
                    try {

                        readFile(scannerInput.next());
                    } catch (FileNotFoundException exception) {
                        System.out.println("Файл не найден введите заново");
                        readFile(scannerInput.next());
                    }
                }
                case 2 -> {
                    System.out.println("Впишите данные пользователя");
                    System.out.println("Имя, Возраст, Город");
                    String name = scannerInput.nextLine();
                    String age = scannerInput.nextLine();
                    String town = scannerInput.nextLine();


                    User user = new User(name, parseInt(age), town);

                    System.out.println("Введите Имя Файла");
                    String source = scannerInput.nextLine();
                    File file = new File(("C:\\Users\\Serega\\Desktop\\UserIo\\" + source + ".txt"));
                    out = new ObjectOutputStream(new FileOutputStream(file));
                    out.writeObject(user.toString());
                    out.close();

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }



static public void readFile(String source)throws IOException{

        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        try{
        reader=new BufferedReader(new FileReader(source));
        }catch(FileNotFoundException exception){
        System.out.println("Попробуйте заново");
        String newSource = reader.readLine();
        readFile(newSource);
        }

        String line=reader.readLine();
        System.out.println(line);

        }

        }
