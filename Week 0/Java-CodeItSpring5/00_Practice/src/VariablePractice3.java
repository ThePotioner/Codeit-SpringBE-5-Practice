import java.util.Scanner;

public class VariablePractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("가로 : ");
        String a = sc.nextLine();

        System.out.print("세로 : ");
        String b = sc.nextLine();

        Double[] numArr = { Double.parseDouble(a), Double.parseDouble(b) };
        System.out.println("면적 : " + (numArr[0] * numArr[1]));
        System.out.println("둘레 : " + ((numArr[0] + numArr[1]) * 2));
    }
}
