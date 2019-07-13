public class Timer {
    long second;

    void addSeconds(int sec){

        second = second + sec;

    }

    void addMinutes(int min){

        second = second + 60 * min;

    }

    void addHours(int ho){

        second = second + 3600 * ho;
    }

    void step(){

        second = second + 1;

    }

    String getTime(){

        long hours = second/3600;
        long minutes = (second % 3600) / 60;
        long seconds = second%60;

        String time = "Zmierzony czas: " + hours + "." + minutes + "." + seconds;

        return time;
    }

    long getSeconds(){

        long seconds = second;

        return seconds;
    }
}
