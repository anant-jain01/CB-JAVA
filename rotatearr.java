public class rotatearr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 1;
        rotateArray(arr, k);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void rotateArray(int[] arr, int k) {
        k %= arr.length;  // In case k is greater than the array length
        if (k == 0) return;  // No need to rotate if k is 0

        int[] temp = new int[arr.length];
        // Copy the first part shifted by k
        for (int i = 0; i < arr.length - k; i++) {
            temp[i + k] = arr[i];
        }
        // Copy the last k elements to the start of the temp array
        for (int j = 0; j < k; j++) {
            temp[j] = arr[arr.length - k + j];
        }
        // Copy the rotated temp array back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}
