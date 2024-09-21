public class DataTypes {

    public static void main(String[] args){
        // integer types
        byte aSingleByte = 100; // -128 to 127
        short aShortNumber = 20000; // -32,768 to 32767
        int anInteger = 2147483647; //-2,147,483,648 to 2,147,483,647
        long aLongNumber = 2147483648L; // -9223372036854775808 to 9223372036854775807

        // decimal types
        double aDouble = 1.234212;
        float aFloat = 1.2342F;

        // booleans
        boolean isWeekend = true;
        boolean isWorkDay = false;

        // characters
        char copyright = '\u00A9';
        System.out.println("This is the symbol of cp: " + copyright);

        // Conversion de datos
        int number1 = 3;
        double number2 = number1;
        System.out.println(number2);

        double number3 = 5.8;
        int number4 = (int) number3;
        System.out.println("convertimos un double 5.8 a un integer: " + number4);
    }
}
