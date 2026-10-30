import java.util.Scanner;

public class L09EX02 {
    static Scanner escreve=new Scanner(System.in);

    public static int scannerUsuario(){
        return escreve.nextInt();
    }
    public static void calculo (int numero){
        for(int i=1;i<=numero;i++){
        System.out.print("\n");
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
    }
}
    public static void main (String[] args){
        System.out.println("Digite um numero:");
        calculo(scannerUsuario());
    }
}
