public class TimerTest {
    public static void main(String[] args) {

        Timer timer = new Timer();

        timer.step(); // 0:0:1
        timer.step(); // 0:0:2
        timer.addSeconds(15); // 0:0:17
        timer.addMinutes(15); // 1:15:17
        timer.addSeconds(42); // 1:15:59
        timer.addHours(3); // 3:15:59
        timer.addSeconds(1); // 3:15:59
        timer.step(); // 3:16:0

        String time = timer.getTime();
        System.out.println(time);

        long seconds = timer.getSeconds();
        System.out.println("Liczba zmierzonych sekund: " + seconds);
    }
}
