package sec02_primarydatatype.EX02_PrimaryDataType_1;

public class PrimaryDataType_1 {
    public static void main(String[] args) {
        // boolean : true / false
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println();

        // 정수(byte, short, int, long) : 음의 정수 / 0 / 양의 정수
        byte value1 = 10;
        short value2 = 10;
        int value3 = 100;
        long value4 = -100L;
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println();

        // 실수 (float, double) : 음의 실수 / 0 / 양의 실수
        float value5 = 1.2F;         // 1.2    => float 자료형으로 인식
        double value6 = -1.5;        // -1.5
        double value7 = 5;           // 5.0     => 자동으로 실수로 변경해줌
        System.out.println(value5);
        System.out.println(value6);
        System.out.println(value7);
    }
}
