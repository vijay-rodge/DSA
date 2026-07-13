import java.util.*;
public class Prod {
    public static int calculateProd(int num1, int num2){
        int prod = num1 * num2;
        return prod;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = calculateProd(a, b);
        System.out.println("The product is: " + prod);
    }
}