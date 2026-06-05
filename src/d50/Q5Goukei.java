package d50;

public class Q5Goukei {
    static void main(String[] args) {
        int[] num = new int[args.length];

        for (int i = 0; i < args.length; i++){
            num[i] = Integer.parseInt(args[i]);
        }
        int sum = 0;
        for(int val :num){
            sum += val;
        }
        System.out.println(sum);
    }
}
