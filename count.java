public class count {
    public static void main(String[] args) {
        int[] arr = {-2, 5, -7, 8, 0, 3};

        int positive = 0, negative = 0, zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                positive++;
            else if (arr[i] < 0)
                negative++;
            else
                zero++;
        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        System.out.println("Zeros = " + zero);
    }
}