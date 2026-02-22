package OOPjava.sem1.lab2;

public class Timeconvoter {
        public static void main(String[] args) {
            int totalSeconds =100000;
            int hours = totalSeconds / 3600;
            int remainingSeconds = totalSeconds % 3600;
            int minutes = remainingSeconds / 60;
            int seconds = remainingSeconds % 60;
            System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
        }
}
