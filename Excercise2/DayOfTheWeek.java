import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

class DayOfTheWeek {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
        String classStartData = "01/01/2022";
        System.out.print("Enter date of your next birthday - format (dd/mm/yyyy): ");
        Scanner sc = new Scanner(System.in);
        String nextBirthdayDate = sc.nextLine();
        Date dateClassStart = myFormat.parse(classStartData);
        Date dateClassEnd = myFormat.parse(nextBirthdayDate);

        //Get the number of days between dates
        // then get the reminder of the week days to get exact day
        long differenceDays = dateClassEnd.getTime() - dateClassStart.getTime();
        int remainderDays = (int) (TimeUnit.DAYS.convert(differenceDays, TimeUnit.MILLISECONDS) % 7);
        //System.out.println("Remainder days from number of weeks: " + remainderDays);

        int dayOfWeek;
        if(remainderDays > 0){
            dayOfWeek = (6 + remainderDays) - 7;
        }else {
            dayOfWeek = 6;
        }

        switch (dayOfWeek) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

        }

    }
}