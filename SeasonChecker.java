import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SeasonChecker {

    public static void main(String[] args) {
        Checker(s);
    }

    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN;
    }

    public static String s;

    public static void Checker(String s) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            s = reader.readLine();
        }
        catch (IOException e) {
            System.out.println("Oops, exception has caught!");
        }

        Season season = null;

        switch (s) {
            case "December":
            case "January":
            case "February":
                season = Season.WINTER;
                break;
            case "March":
            case "April":
            case "May":
                season = Season.SPRING;
                break;
            case "June":
            case "July":
            case "August":
                season = Season.SUMMER;
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                break;
            default:
                System.out.println("No this month");
        }
        System.out.println(season);
    }
}