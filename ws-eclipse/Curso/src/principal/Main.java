package principal;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println(dt);
        System.out.println(time);

    }
}
