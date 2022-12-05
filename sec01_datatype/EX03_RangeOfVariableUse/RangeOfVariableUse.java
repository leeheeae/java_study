package sec01_datatype.EX03_RangeOfVariableUse;

public class RangeOfVariableUse {
    public static void main(String[] args) {
        int value1 = 3;
        {
            int value2 = 5;
            System.out.println(value1);
            System.out.println(value2);
        }

        System.out.println(value1);
        // System.out.prinln(value2); // 선언한 변수가 사라지게 되어 오류가 발생
    }
}
