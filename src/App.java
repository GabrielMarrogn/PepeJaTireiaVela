import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 0; i < a; i++){
            int h = sc.nextInt();
            int m = sc.nextInt();
            int p = sc.nextInt();

            DecimalFormat decimal = new DecimalFormat("00");

            System.out.print(decimal.format(h)+":" +decimal.format(m) +" - ");

            if(p == 1){
                System.out.println("A porta abriu!");
            }else if(p == 0){
                System.out.println("A porta fechou!");
            }
        }

        sc.close();
    }
}
