public class Challenge1 {
    public static void main(String[] args) {
        double firstVariable = 20.00d;
        double secondVariable = 80.00d;
        double result = 100.00d*(firstVariable + secondVariable);
        System.out.println(result);
        double remainder = result % 40.00d;
        System.out.println(remainder);
        boolean isTrue = (remainder == 0) ? true : false;
        System.out.println(isTrue);
        if (!isTrue) {
            System.out.println("Got some remainder");
        }
    }
}