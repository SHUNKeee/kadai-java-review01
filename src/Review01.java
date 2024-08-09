
public class Review01 {

    public static void main(String[] args) {
        int genka = 1500;
        int result = tax(genka);


        System.out.println(genka+"円の商品の税込み価格は"+(genka+result)+"円（消費税は"+result+"円）です。");


    }

    public static int tax(int genka) {
        int tax = (int)(genka * 0.1);
        return tax;

    }
}
