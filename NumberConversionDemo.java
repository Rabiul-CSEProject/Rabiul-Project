public class NumberConversionDemo {
    public static void main(String[] args) {
        // info: convert number binary ,decimal ,oktal ,hexadecimal

        int decimal = 10;
        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);
        String octal = Integer.toOctalString(decimal);
        System.out.println(octal);
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println(hexadecimal);
    }

}
