public class Main {

    public static void main(String[] args) {

    }

    public static int add(int x,int y){
        return (x + y);
    }

    public static int add(int a, int b, int c, int d){
        return (a + b + c + d);
    }

    public static String morningGreeting(String x){
        String greeting = "早上好 ";
        return (greeting + x);
    }

    public static String afternoonGreeting(String x){
        String greeting = "下午好 ";
        return (greeting + x);
    }

    public static String triple(String x){
        return (x+x+x);
    }

    public static double half(int x){
        double y = (double) x / 2;
        return y;

    }

    public static int roundPositiveValueToNearestInteger(double x){
        if (x>=0) {
            int y = (int) x;
            double z = y + 0.5;
            if (x >= z) {
                return (y + 1);
            } else {
                return (y);
            }
        }
        return 0;


    }

    public static int roundNegativeValueToNearestInteger(double x){
        if (x<=0) {
            int y = (int) x;
            double z = y - 0.5;
            if (x <= z) {
                return (y - 1);
            } else {
                return (y);
            }
        }
        return 0;
    }
}
