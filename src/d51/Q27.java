package d51;

enum Signal {
    RED, YELLOW, GREEN
}
public class Q27 {
    public static void main(String[] args) {
        Signal signal = Signal.GREEN;
        switch (signal) {
            case RED:
                System.out.println("赤");
                break;
            case YELLOW:
                System.out.println("黄");
                break;
            case GREEN:
                System.out.println("青");
                break;
        }
    }
}
