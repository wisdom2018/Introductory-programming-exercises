public class PrintAsterisk {

    public static void drawLineLineUseAsterisks(int n) {

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void drawVerticalLine(int n) {
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
        System.out.println();
    }

    public static void drawRightTriangle(int n) {

        for (int i = 1; i <= n; i++) {
            drawLineLineUseAsterisks(i);
        }
        System.out.println();
    }
}
