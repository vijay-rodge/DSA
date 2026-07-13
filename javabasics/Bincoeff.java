
public class Bincoeff {
    public static int Factorial(int num){
        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static int binCoeff(int n, int r){
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n - r);
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
    public static void main(String []args){
        System.out.println(binCoeff(5,2));
    }
}
