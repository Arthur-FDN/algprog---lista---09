import java.util.Scanner;


public class L09EX01 {

static Scanner escreve = new Scanner(System.in);

    public static int scannerUsuario (){
        return escreve.nextInt();
    }
    /*  public static void calculo (int numeroDigitado){
        for(int i=0;i<numeroDigitado;i++){
            System.out.print(numeroDigitado+" ");
        }
    }*/
   public static void calculo ( int numeroDigitado){
    for(int i=1;i<=numeroDigitado;i++){
        System.out.print("\n");
        for(int j=1;j<=i;j++){
            System.out.print(numeroDigitado+" ");
        }
    }
   }
    public static void main(String[] args){
        System.out.println("Digite um numero:");
        calculo(scannerUsuario());
    }
}
