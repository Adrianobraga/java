import java.util.Scanner;
public class calculadora{
    public static Scanner leia = new Scanner(System.in);
    public static void main(String org[]){
        int valor1;
        int valor2;
        int op;
        System.out.println("digite o primeiro valor");
        valor1 = leia.nextInt();
        System.out.println("digite o segundo valor");
        valor2 = leia.nextInt();
        System.out.println("Digite 1 para somar, 2 para subtrair, 3 para multiplicar, 4 para dividir."); 
        op = leia.nextInt();
switch (op){
            case 1:
            System.out.println("soma é = "+(valor1+valor2));

            break;
            case 2:
            System.out.println("Subtração é = "+(valor1-valor2));

            break;
            case 3:
            System.out.println("multiplicação é = "+(valor1*valor2));

            break;
            case 4:
            System.out.println("divisão é = "+(valor1/valor2));

            break;
            default:
            System.out.println("não existe essa opção");
        }
    }
}
