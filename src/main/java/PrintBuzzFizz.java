public class PrintBuzzFizz {

    public static void printBF(int n) {
        String result = "";
        int i = 1;
        for (; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result = "FizzBuzz";
                System.out.println(result);

            } else if (i % 3 == 0) {
                result = "Fizz";
                System.out.println(result);
            } else if (i % 5 == 0) {
                result = "Buzz";
                System.out.println(result);
            } else {
                System.out.println(i);
            }
        }
    }
}
