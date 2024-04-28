import java.util.Scanner;
public class at1{
    public static Scanner leia = new Scanner(System.in);
    public static void main(String org[]){
        //variaveis
        int qtdAnos;
        int HorasT;
        int valorHora;
        int salario;
        int salariofinal;
        //entradas
        System.out.print("quantos anos o funcionario trabalha: \n");
        qtdAnos = leia.nextInt();
        System.out.print("quantas horas o funcionario trabalhou: \n");
        HorasT = leia.nextInt();
        System.out.print("quanto é o valor por hora:\n");
        valorHora = leia.nextInt();
        //verdadeiro ou falso
        if (qtdAnos <= 1){
            salario = 1500;
            salariofinal = valorHora * HorasT + salario;
            System.out.print("o salario final é"+ salariofinal);
       }
           if((qtdAnos > 1) && (qtdAnos < 3)){
               salario = 2000;
               salariofinal = valorHora * HorasT + salario;
               System.out.print("o salario final é"+ salariofinal);
           }
           else{
            salario = 3000;
            salariofinal = valorHora * HorasT + salario;
            System.out.print("o salario final é"+ salariofinal);
           }
        

}
}
