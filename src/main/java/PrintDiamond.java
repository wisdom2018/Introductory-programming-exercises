public class PrintDiamond {

    public static void printCenteredTriangle(int n) {
        int totalSize = 2 * n - 1;
        int asteriskcount;
        for (int i = 0; i < n; i++) {
            asteriskcount = 2 * i + 1;
            int space = (totalSize - asteriskcount) / 2;

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < asteriskcount; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void PrintSymmetricalDiamond(int n) {
        int totalSize = 2 * n - 1;
        int asteriskcount;
        for (int i = 0; i < n; i++) {
            asteriskcount = 2 * i + 1;
            int space = (totalSize - asteriskcount) / 2;

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < asteriskcount; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int reverse = n - 1;
        for (int i = reverse; i > 0; i--) {
            int asterNum = (2 * i) - 1;
            int spaceNum = (totalSize - asterNum) / 2;

            for (int j = 0; j < spaceNum; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < asterNum; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}