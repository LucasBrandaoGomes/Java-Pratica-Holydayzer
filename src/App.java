import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Calendar calendar = new Calendar();
        calendar.addHolidaysDates();

        calendar.getAllHolidays();

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Informe a data a ser verificada: ");
        
        //String date = scanner.toString();

        calendar.isHoliday("07/09/2023");
        calendar.isHoliday("25/12/2023");
        calendar.isHoliday("04/03/2023");
    }
}
