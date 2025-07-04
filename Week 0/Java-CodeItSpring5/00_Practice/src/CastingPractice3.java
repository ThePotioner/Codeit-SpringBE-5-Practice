public class CastingPractice3 {
    public static void main(String[] args) {
        int iNum1 = 10;
        int iNum2 = 4;
        float fNum = 3.0f;
        double dNum = 2.5;
        char ch = 'A';

        System.out.println(iNum1 / 5); // 2
        System.out.println(iNum2 / 2); // 2
        System.out.println(dNum * 4.0F); // 10.0
        System.out.println((double)iNum1); // 10.0
        System.out.println(dNum); // 2.5
        System.out.println(fNum - 0.5F); // 2.5
        System.out.println((int)fNum); // 3
        System.out.println(iNum1 - 7); // 3
        System.out.println((float)iNum1 / 3.0F);// 3.3333333
        System.out.println((double)iNum1 / 3.0); // 3.3333333333333335
        System.out.println(ch); // 'A'
        System.out.println((int)ch); // 65
        System.out.println((int)ch + iNum1); // 75
        System.out.println((char)((int)ch + iNum1)); // 'K'
    }
}
