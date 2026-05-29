package d49;

public class Q22Kadai {
    static void main(String[] args) {
        int length = 2100; // 1600 -> 2100
        String type;
        if(length < 1000) {
            type ="Short";
        }else if(length > 2000) {
            type = "Longe";
        }else{
            type = "Standard";
        }
        System.out.println(type);
    }
}
