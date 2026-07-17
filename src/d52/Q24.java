package d52;

public class Q24 {
    static void main(String[] args) {
        int[] nums = {-5, 8, 3, 0, 9, -1};
        for (int n : nums){
            n *= 2;
            System.out.print(n + ":");
        }
        System.out.println();
        for (int n: nums){
            System.out.print(n + ":");
        }
    }
}
