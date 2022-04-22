import java.util.*;

class CalcDayMonthYear{
    public static void main(String[] args) {
        System.out.print("Enter date of birth - format (dd/mm/yyyy): ");
        Scanner sc = new Scanner(System.in);
        String dob = sc.nextLine();

        if((dob.toCharArray().length) <10){
            System.out.println("Please enter date in correct format: use double digits/remove spaces/year must be in full/use forward slashes");
        }
        else {
            int inputDay = Integer.parseInt(dob.substring(0, 2));
            int inputMonth = Integer.parseInt(dob.substring(3, 5));
            int inputYear = Integer.parseInt(dob.substring(6, 10));
            String currentDate = "22/04/2022";
            int currDay = Integer.parseInt(currentDate.substring(0, 2));
            int currMonth = Integer.parseInt(currentDate.substring(3, 5));
            int currYear = Integer.parseInt(currentDate.substring(6, 10));

            int days, months, years;
            days = currDay - inputDay;
            months = currMonth - inputMonth;
            years = currYear - inputYear;

            System.out.println("Days: " + days + ", Months: " + months + ", Years: " + years);
        }
    }
}
