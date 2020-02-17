import java.util.Arrays;

public class Task2 {
    public static boolean Only1And4(int[] arr) {
        String str = Arrays.toString(arr);
        if (str.indexOf(String.valueOf(4)) != -1 && str.indexOf(String.valueOf(1)) != -1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 4 || arr[i] != 1) return false;
            }
        }
        return false;
    }
}
