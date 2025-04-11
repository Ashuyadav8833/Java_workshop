import java.util.Scanner;

class Print_day {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (1-7) to get the corresponding day of the week: ");
        int day = scanner.nextInt(); 
        String dayName;

        switch(day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("The day is : " + dayName);
    }
}