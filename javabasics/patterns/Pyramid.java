// public class Pyramid {
//     public static void inverted_rotated_pyramid (int n){
//         for (int i = 1; i <=n ;i++) {
//             for (int j= 1 ;j<=n-i; j++){
//                 System.out.print(" ");

//             }
//             for (int j = 1; j<= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String[] args) {
//         inverted_rotated_pyramid(5);
//     }
// }


// public class Pyramid {
//     public static void inverted_half_pyramid_withnumbers (int n){
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1 ; j <= n-i + 1; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }

//     }
//     public static void main (String[] args) {
//         inverted_half_pyramid_withnumbers(5);
//     }
// }

public class Pyramid {
    public static void floyds_triangle(int n){
        int count = 1;
        for (int i = 1; i<= n; i++){
            for (int j = 1 ; j<=i; j++){
                System.out.print( count + " ");
                count++;
            }
            System.out.println();
            
        }
    }
    public static void main (String[] args) {
        floyds_triangle(5);
    }
}