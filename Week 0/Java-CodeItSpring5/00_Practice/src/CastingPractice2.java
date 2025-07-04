import java.util.Scanner;

public class CastingPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 : ");
        String a = sc.nextLine();

        System.out.print("영어 : ");
        String b = sc.nextLine();

        System.out.print("수학 : ");
        String c = sc.nextLine();

        Double allOf = Double.parseDouble(a) + Double.parseDouble(b) + Double.parseDouble(c);
        System.out.println("총점 : " + allOf.intValue());
        System.out.println("평균 : " + (int)(allOf / 3));
    }
}
