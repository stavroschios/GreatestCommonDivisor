public class greatestcommondivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(125, 145));
    }

    public static int getGreatestCommonDivisor(int number1, int number2) {
        if (number1 < 10 || number2 < 10)
            return -1;

        int gcd = 0;

        for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0)
                gcd = i;


        }

        return gcd;

    }
}


