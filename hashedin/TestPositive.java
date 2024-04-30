import java.util.HashSet;

public class TestPositive {
    public static void main(String[] args) {
        int[] A1 = { 1, 3, 6, 4, 1, 2 };
        int[] A2 = { 1, 2, 3 };
        int[] A3 = { -1, -3 };

        System.out.println("Smallest positive integer for A1: " + smallestPositiveInteger(A1));
        System.out.println("Smallest positive integer for A2: " + smallestPositiveInteger(A2));
        System.out.println("Smallest positive integer for A3: " + smallestPositiveInteger(A3));
    }

    public static int smallestPositiveInteger(int[] A) {
        HashSet<Integer> set = new HashSet<>();

        // Add all positive integers from A to the set
        for (int num : A) {
            if (num > 0) {
                set.add(num);
            }
        }

        // Check for the smallest positive integer not in the set
        for (int i = 1; i <= A.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1; // Should not reach here
    }
}
