public class AdvancedWeek {
    // Initializing variables
    private String day_1 = "Monday";
    private int day_1_index = 1;
    private String day_2 = "Tuesday";
    private int day_2_index = 2;
    private String day_3 = "Wednesday";
    private int day_3_index = 3;
    private String day_4 = "Thursday";
    private int day_4_index = 4;
    private String day_5 = "Friday";
    private int day_5_index = 5;
    private String day_6 = "Saturday";
    private int day_6_index = 6;
    private String day_7 = "Sunday";
    private int day_7_index = 7;

    // printing out the days
    public void printDays() {
        System.out.println( day_1_index + ": " + day_1 + ",\n" +
day_2_index + ": " + day_2 + ",\n" +
day_3_index + ": " + day_3 + ",\n" +
day_4_index + ": " + day_4 + ",\n" +
day_5_index + ": " + day_5 + ",\n" +
day_6_index + ": " + day_6 + ",\n" +
day_7_index + ": " + day_7 + "." );
    }
}