import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] nums = new int[] { 0, 1, 2, 3, 4 };
        int[] index = new int[] { 0, 1, 2, 2, 1 };
        int[] ans = targetarray(nums, index);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] targetarray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] target = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            target[j] = list.get(j);
        }
        return target;
    }
}
