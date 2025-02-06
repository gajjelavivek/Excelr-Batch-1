public class Demo064 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        if (arr.length > 1) {
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
            System.out.println("Array after swapping first and last elements:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Array must have at least two elements to swap.");
        }
    }
}
