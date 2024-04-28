import java.util.Scanner;
public class at2{
    public static Scanner leia = new Scanner(System.in);
    public static void main(String org[]){
        //variaveis
        int num;
        System.out.println("digite um número de 1 a 7");
        num = leia.nextInt();

switch (num){
            case 1:
            System.out.println("hoje é domingo");
            break;
            case 2:
 
            System.out.println("hoje é segunda ");
            break;
            case 3:
            System.out.println("hoje é terça");
            break;
            case 4:
            System.out.println("hoje é quarta");
            break;
            case 5:
            System.out.println("hoje é quinta ");
            break;
            case 6:
            System.out.println("hoje é sexta ");
            break;
            case 7:
            System.out.println("hoje é sabado");
            break;
            default:
            System.out.println("não existe essa opção");
        }
    }
}
