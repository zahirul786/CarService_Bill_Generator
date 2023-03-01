import java.util.*;

public class ZeroSumItems {

    public static int[] findZeroSumItems(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] == 0) {
                return new int[] { arr[i] };
            } else if (sum == 0) {
                return Arrays.copyOfRange(arr, 0, i + 1);
            } else if (map.containsKey(sum)) {
                return Arrays.copyOfRange(arr, map.get(sum) + 1, i + 1);
            } else {
                map.put(sum, i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Eneter Array Element");
        for (int j = 0; j < size; j++) {
            arr[j] = sc.nextInt();
        }
        int[] result = findZeroSumItems(arr);
        if (result == null) {
            System.out.println("No Elements found");
        } else {
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }
}