import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) throws Exception {
        try(Scanner input = new Scanner(System.in)){
            Calculation cal = new Calculation();
            double square,circle,trapezoid;
            do{
                try{
                    switch(){
                        case 1:
                        System.out.print("Hasil Luas Persegi" + square);
                        case 2 :
                        System.out.println("Hasil Luas Lingkaran : "+ circle
                        );
                        case 3:
                        System.out.println("Hasil Luas Trapesium :" +trapezoid);

                    }
                  
                }
            }
        }
    }
}
