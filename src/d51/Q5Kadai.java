package d51;

public class Q5Kadai {
    static void main(String[] args) {
        double[] level = {0.0, 24.0, 57.0, Double.MAX_VALUE};//配列の最後を「上限なし」に
        double[] unit = {0.0, 2.0, 3.0, 5.0};
        int[] rate = {0, 20, 18, 15};
        if (args.length != 1){
            System.out.print("引数の個数が不正");
            return;
        }
        double amount = Double.parseDouble(args[0]);
        if(amount < 0.0){
            System.out.print("0.0以上の使用量を入力");
            return;
        }

        int i, price = 1300;
        for (i = 1; amount >= level[i]; i++){
            price += (int)((level[i] - level[i-1])/ unit[i]) * rate[i];
        }// iはforループ外で宣言されてるからループ後も使える
        //            ↓これで小数点以下を切り上げて、最も近い整数に
        price += (int)Math.ceil((amount - level[i - 1]) / unit[i]) * rate[i];
        System.out.print("今月のガス料金" + price + "円");
    }
}
