public class SecondsInADay {

    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        // in one day there are 86400 seconds
        // 1 minute is 60 seconds, 1 hour is 3600 second

        int currentSecond = currentHours * 3600 + currentMinutes * 60 + currentSeconds;

        System.out.println("Remaining seconds from the day: " + (86400 - currentSecond));


    }


}
