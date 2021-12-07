//Write a Java program to display the following star pattern:
// b.Hollow Square Star Pattern

public class HollowSquqrePattern {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        SquareStar(row, column);

    }

    static void SquareStar(int r, int c) {
        int a, b;

        for (a = 1; a <= r; a++) {
            for (b = 1; b <= c; b++) {
                if (a == 1 || a == r || b == 1 || b == c)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
