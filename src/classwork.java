public class classwork {
    public static void main(String[] args) {
        int num1 = 23;
        int num2 = 456;
        int num3 = 789;

        if (num1 > num2&& num1 > num3) {
            System.out.println("The greatest number is " + num1);

        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest number is " + num2);
        }
        else if (num3 > num1 && num3 > num2) {
            System.out.println("The greatest number is " + num3);

        }
    }
}
