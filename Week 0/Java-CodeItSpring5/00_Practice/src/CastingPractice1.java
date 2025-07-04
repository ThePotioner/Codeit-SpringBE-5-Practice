import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CastingPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자 : ");
        String a = sc.nextLine();

        // Best Practice - 굳이 형변환시 발생하는 문제를 예외 처리할 필요가 없음.
        // System.out.println(a + " unicode : " + a.hashCode());

        // Worst
        System.out.println(a + " unicode : " + a.getBytes(StandardCharsets.UTF_8)[0]);
    }
}
