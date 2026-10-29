import java.util.Scanner;

public class L09EX05 {
static Scanner escreve = new Scanner(System.in);

public static double taxaImposto(){
    System.out.println("Digite o valor do imposto em %: ");
    return escreve.nextDouble();
}
public static double custo(){
    System.out.println("Digite o valor do custo em R$: ");
    return escreve.nextDouble();
}
/*public static double[] scannerUsuario(){
    System.out.println("Digite dois valores, sendo o primeiro o imposto em % e o seguindo o custo em R$: ");
    double[] valores = new double[2];
    for(int i=0;i<valores.length;i++){
        valores[i]=escreve.nextDouble();
    }
    return valores;
}*/
    public static void somaImposto(double taxaImposto,double custo){
        double resultado = (((custo*taxaImposto)/100)+custo);
        System.out.println("A soma do custo mais o imposto e: "+resultado);
    } 
   /*  public static void main(String[] args) {
        double[] valores = scannerUsuario();
        somaImposto(valores[0],valores[1]); 
    }*/
   public static void main(String[] args) {
        somaImposto(taxaImposto(),custo()); 
    }
}
