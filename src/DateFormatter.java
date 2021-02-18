import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class DateFormatter {
    public static void main(String[] args) throws IOException {


        System.out.println("Введите  дату в формате ISO через дефис Пример : 2011-01-24");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String date = reader.readLine();
        LocalDate localDate = LocalDate.parse(date);


        System.out.println("Выберите тип форматирования даты");
        System.out.println("THROUGHDOT");
        System.out.println("THROUGHSLASH");
        System.out.println("MONTHLETTERS");
        System.out.println("TWODIGITYEARS");

        String line = reader.readLine();
        Enums enums = Enums.valueOf(line);

        switch (enums) {
            case THROUGHSLASH -> setThroughSlash(localDate);
            case THROUGHDOT -> setThroughDot(localDate);
            case MONTHLETTERS -> setMonthLetters(localDate);
            case TWODIGITYEARS -> setTwoDigitYears(localDate);
            default -> throw new IllegalStateException("Unexpected value");
        }


    }

    static public void setThroughSlash(LocalDate localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatter.format(localDate));

    }

    static public void setThroughDot(LocalDate localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(formatter.format(localDate));

    }

    static public void setMonthLetters(LocalDate localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMM dd");
        System.out.println(formatter.format(localDate));

    }

    static public void setTwoDigitYears(LocalDate localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
        System.out.println(formatter.format(localDate));

    }


}



