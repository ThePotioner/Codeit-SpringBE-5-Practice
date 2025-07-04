import java.util.Scanner;

public class VariablePractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("성별을 입력하세요 (남/여) : ");
        String gender = sc.nextLine();

        System.out.print("나이를 입력하세요 : ");
        String age = sc.nextLine();

        System.out.print("키를 입력하세요 : ");
        String height = sc.nextLine();

        System.out.println("키 " + Double.parseDouble(height) + "인 " + Integer.parseInt(age) + "살 " + gender + "자 " + name + "님 반갑습니다!"); // 사실 parse할 필요가 없는...
    }
}
