package d49;

public class Q27Rensyu {
    static void main(String[] args) {
        int num[] = {10, 20, 30};
        int sum = 0;
        // 普通のfor文
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
        // 拡張for文
        for(int n: num){
            sum += n;
        }
        System.out.println(sum);
    }
}
//Javaは静的格付け言語
