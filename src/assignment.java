public class assignment {
    public static void main(String[] args) {
        int P = 1000;
        int T = 2;
        double R = 2.5;
        double SI = 0;
        int num1 = 27;
        {
            SI = (P*T*R)/100;
            System.out.println("The SI is "+ SI );

        }
        if (num1 % 2 == 0) {
            System.out.println("The number is even");
        }
        else if (num1 % 2 != 0) {
            System.out.println("The number is odd");
        }
        else {
            System.out.println("The number is zero");
        }
    }
}
