import java.util.Scanner;
class cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total marks: ");
        double tm = sc.nextDouble();
        double n = sc.nextDouble();
        double cgpa = 0;
        for(int i=1; i<=n; i++){
            System.out.print("Enter scored marks: ");
            double x = sc.nextDouble();
            cgpa = (x/n);
        }
        cgpa = cgpa*9.5;
        System.out.println("The total cgpa is: " +cgpa);
    }
}
