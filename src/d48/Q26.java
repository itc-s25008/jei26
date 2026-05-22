package d48;

public class Q26 {
    public static void main(String[] args) {
        int i = 0, sum = 0;
        while (++i < 8) {
            sum += i;
        }
        System.out.println(sum);
    }
}
/*
whileは++で1たされた後に8以下かの判定をする
1から7を足した結果が出る
 */
