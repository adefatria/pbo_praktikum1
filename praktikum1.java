public class praktikum1 {
    public static void main(String[] args) {
        int bilangan1 = Integer.parseInt(args[0]);
        int bilangan2 = Integer.parseInt(args[1]);

        String operator = args[2];
        System.out.println("Result :" + hasil(bilangan1, bilangan2, operator));
    }
     static int hasil(int a, int d, String op) {
        switch (op) {
            case "1":
                return a+d;

            case "2":
                return a-d;

            case "3":
                return a*d;

            default:
                System.out.println("Masukkan Operator");
                return 0;
        }
     }
}
