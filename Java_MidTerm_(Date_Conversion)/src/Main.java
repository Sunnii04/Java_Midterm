import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input date in this format (YYYY-MM-DD):");
        String shortDate = input.nextLine();
        String[] arr = shortDate.split("-");
        String year = arr[0];
        String day = arr[2];
        int month = Integer.parseInt(arr[1]);

        Month months = Month.of(month);

        String monthDay = months + " " + day;
        String fullDate = monthDay + ", " + year;

        System.out.println("Date after conversion:" + fullDate);

    }
}