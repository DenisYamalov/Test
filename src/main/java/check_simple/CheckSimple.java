package check_simple;

public class CheckSimple {
    public boolean isPrime(int number) {

        if (number == 0 || number == 1) {
            return true;
        }
        if (number < 0) {
            return false;
        }

        return isSimple(number);
    }

    private static boolean isSimple(int number) {

        boolean isSimple = false;
        for (int i = 2; i <= number; i++) {
            int check = number % i;
            if (check == 0) {
                isSimple = false;
                return isSimple;
            }
            if (check == 1) {
                isSimple = true;
                return isSimple;
            }
        }
        return isSimple;
    }
}
