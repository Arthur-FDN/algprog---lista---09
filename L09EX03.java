import java.util.Scanner;

public class L09EX03 {
    static Scanner escreve = new Scanner(System.in);

    public static int[] scannerUsuario (){
        int[] valores = new int[3];
        System.out.println("Digite tres numeros:");
        for(int i=0;i<3;i++){
             valores[i]=escreve.nextInt();
        }
        return valores;
    }
    public static void calculo (int argumentoUm, int argumentoDois, int argumentotres){
        System.out.println("A soma dos argumentos e: "+(argumentoUm+argumentoDois+argumentotres));
        
    }
    public static void main(String[] args) {
        int[] valores = scannerUsuario();
        calculo(valores[0],valores[1],valores[2]);
    }
}
