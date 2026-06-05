package d50;

public class Q17 {
    static void main(String[] args) {
        float f = 7.8f;
        double d = 15.37;

        double x = f * d; // 異なる型の計算はより大きい型に自動変換される
        System.out.println(x);
    }
}
