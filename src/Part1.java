public class Part1 {
    public static void main(String[] args) {
        nakoplenie(1000,5);

    }

    static double nakoplenie(double s,int n){
        double summaDeneg=s;
        for (int i = 0; i < n; i++) {
            summaDeneg+=summaDeneg*(1.5/100);
        }
        System.out.println(summaDeneg);
        return summaDeneg;
    }
}
