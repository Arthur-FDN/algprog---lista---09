import java.util.Scanner;

public class L09EX06 {
    static Scanner escreve = new Scanner(System.in);
        public static int horas(){
            System.out.println("Digite as horas:");
            int hora = escreve.nextInt();
            return hora;
        }
        public static int minutos(){
            System.out.println("Digite os minutos:");
            int minutos = escreve.nextInt();
            return minutos;
        }
        public static void printDasHoras(int argHora,int argMinuto){
            System.out.println("O horario digitado foi "+argHora+":"+ argMinuto);
        }
        public static void printDasHorasPM(int argHora,int argMinuto){
            if(argHora>12 && argHora<24){
                argHora=argHora-12;
                System.out.println("O horario digitado foi "+argHora+":"+ argMinuto+" P.M");
            }
            else {
                System.out.println("O horario digitado foi "+argHora+":"+ argMinuto+" A.M");
            }
        }
        public static void loop(){
            int loop=0;
            while(loop!=-1){
                printDasHorasPM(horas(), minutos());
                System.out.println("Digite -1 para parar o codigo ou 0 para continuar.");
                loop=escreve.nextInt();
            }
        }
        public static void main(String[] args) {
            loop();
        }
    
}
