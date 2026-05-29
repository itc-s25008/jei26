package d49;

public class Q25 {
    static void main(String[] args) {
        double a = 12.3;
        double b = 4.5;
        Q25 o = new Q25();  //Q25型のoにnewでQ25のインスタンスを代入
        int c = o.number(a, b);  //インスタンスoのnumberメソットを引数指定して呼び出し
        System.out.println(c);
    }

    int number(double v1, double v2) {  // 呼び出す際にv1 = a, v2 = bを代入
        return (int)(v1 / v2);  // 12.3 / 4.5 = 2.7333 をintにキャスト(小数点部分を切り捨て)して「2」となる
    }
}

// このコードのクラスは自らをインスタンス化して使用
// (numberメソッドがインスタンスメソッドなため)
