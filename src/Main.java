import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        CountingSort.countingSort(arr);
        System.out.println(Arrays.toString(arr));

        String message = "Hello, World!";
        int key = 3;
        String encrypted = CaesarCipher.caesarCipher(message, true, key);
        System.out.println(encrypted);
        String decrypted = CaesarCipher.caesarCipher(encrypted, false, key);
        System.out.println(decrypted);

        int[] array = {1, 2, 3, 4, 5};
        int n = 3;
        CycliShift.cyclicShift(array, n);

    }
}
