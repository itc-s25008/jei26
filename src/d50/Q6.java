package d50;

public class Q6 {
    static void main(String[] args) {
        int min = Integer.parseInt(args[0]);// 引数を整数に
        int max = Integer.parseInt(args[1]);// 引数を整数に
        if (max < min) { // max<minなら入れ替え
            int tmp = max;
            max = min;
            min = tmp;
        }

        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.initializePrimeNumbers(max);// 下記メソッドの設計より引数にmaxを指定することがわかる
        int[] part = primeNumbers.getPart(min, max);// 下記メソッドの設計により引数にmin, maxを指定することがわかる

        // 拡張for文を使い配列partのすべての要素を出力
        for (int prime : part){
            System.out.printf("%d, ", prime);
        }
    }
}

// 素数判定配列を保持し、指定された配列の素数を求めるクラス
class PrimeNumbers{
    boolean[] isPrimeNumbers;

    // 素数判定配列を設定
    void initializePrimeNumbers(int max){
        isPrimeNumbers = new boolean[max + 1]; // 4.①: 最大値+1を要素数とする素数判定配列を用意する
        for (int i = 2; i <= max; i++){// 2から999の範囲とするためi=2としている
            isPrimeNumbers[i] = true;// 4．②: 要素をすべてtrueに初期化する
        }
        for (int p = 2; p <= Math.sqrt(max); p++){
            if (isPrimeNumbers[p]){// pが素数であれば倍数をfalseに設定する
                for (int m = p; m <= max; m += p){
                    isPrimeNumbers[m] = false;// 4．④: 素数pの倍数をすべてfalseに設定する
                }
            }
        }
    }

    // 指定された範囲の素数を素数判定配列から抜き出し、結果を配列で返す
    int[] getPart(int min, int max){
        int count = 0;
        for (int n = min; n <= max; n++){// 素数の数をカウントし、countへ格納
            if (isPrimeNumbers[n]){
                count++;
            }
        }
        int [] part = new int[count];
        int index = 0;
        for (int n = min; n <= max; n++){
            if (isPrimeNumbers[n]){
                part[index++] = n;
            }
        }
        return part;
    }

}
