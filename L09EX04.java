import java.util.Scanner;

public class L09EX04 {
    static Scanner escreve = new Scanner(System.in);
    public static int scannerUsuario(){
        System.out.println("Digite um numero:");
        return escreve.nextInt();
    }
    public static void PositivoOuNegativo (int argumento){
        char N='N',P='P'; // Posso ignorar essas variaveis e colocar escrito direto no print. 
        if(argumento<=0){System.out.print("O valor digitado e:"+ N);} //System.out.print("O valor digitado e: N");
        if(argumento>0){System.out.print("O valor digitado e:"+ P);} //System.out.print("O valor digitado e: P");
    }
    public static void main(String[] args) {
        PositivoOuNegativo(scannerUsuario());
    }
}
