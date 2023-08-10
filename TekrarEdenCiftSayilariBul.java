import java.util.Arrays;
public class TekrarEdenCiftSayilariBul {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {25, 236, 36, 6, 87, 236, 25, 8, 6,};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        int ciftOlan = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (list[i] % 2 == 0) {
                        if (!isFind(duplicate, list[i])) {
                            duplicate[startIndex++] = list[i];
                            break;
                        }
                    }
                }
            }
        }
        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}
