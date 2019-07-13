public class Timer {
    int second;
    int minutes;
    int hours;

    void addSeconds(int sec){

        second = second + sec;

    }

    void addMinutes(int min){

        minutes = minutes + min;

    }

    void addHours(int ho){

        hours = hours + ho;
    }

    void step(){

        second = second + 1;

    }

    String getTime(){

        hours = hours + minutes/60 + second/3600;
        minutes = minutes%60 + second/60;
        second = second%60;

        String time = "Zmierzony czas: " + hours + "." + minutes + "." + second;

        return time;
    }

    long getSeconds(){

        long seconds = 3600 * hours + 60 * minutes + second;

        return seconds;
    }
}
