public class Timer {
    int second;
    int minutes;
    int hours;

    void addSeconds(int sec){

        int secSum = second + sec;
        second = secSum%60;
        minutes = minutes + secSum/60;
        hours = hours + secSum/3600;
    }

    void addMinutes(int min){

        int minSum = minutes + min;
        minutes = minSum%60;
        hours = hours + minSum/60;
    }

    void addHours(int ho){

        hours = hours + ho;
    }

    void step(){

        int secSum = second + 1;
        second = secSum%60;
        minutes = minutes + secSum/60;

    }

    String getTime(){

        String time = "Zmierzony czas: " + hours + "." + minutes + "." + second;

        return time;
    }

    long getSeconds(){

        long seconds = 3600 * hours + 60 * minutes + second;

        return seconds;
    }
}
