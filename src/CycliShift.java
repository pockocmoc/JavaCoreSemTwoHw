public class CycliShift {
    public static void cyclicShift(int[] arr, int n) {
        int len = arr.length;
        n = n % len; // обработка случая, когда n > len

        // Сдвигаем элементы на n позиций вправо
        for (int i = 0; i < n; i++) {
            int temp = arr[len - 1];
            for (int j = len - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }

        // Выводим результат
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
