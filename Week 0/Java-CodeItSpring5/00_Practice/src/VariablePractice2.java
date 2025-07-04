import java.util.Scanner;

public class VariablePractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수 : ");
        String a = sc.nextLine();

        System.out.print("두 번째 정수 : ");
        String b = sc.nextLine();

        int[] numArr = { Integer.parseInt(a), Integer.parseInt(b) };
        System.out.println("더하기 결과 : " + (numArr[0] + numArr[1]));
        System.out.println("빼기 결과 : " + (numArr[0] - numArr[1]));
        System.out.println("곱하기 결과 : " + (numArr[0] * numArr[1]));
        System.out.println("나누기 몫 결과 : " + (numArr[0] / numArr[1]));
    }
}
