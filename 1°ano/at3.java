import java.util.Scanner;
public class at3{
    public static Scanner leia = new Scanner(System.in);
    public static void main(String org[]){
        //variaveis
        int num;
        System.out.println("digite um número de 1 a 12");
        num = leia.nextInt();

switch (num){
            case 1:
            System.out.println("o mês é janeiro");
            break;
            case 2:
            System.out.println("o mês é fevereiro ");
            break;
            case 3:
            System.out.println("o mês é março");
            break;
            case 4:
            System.out.println("o mês é abril");
            break;
            case 5:
            System.out.println("o mês é maio ");
            break;
            case 6:
            System.out.println("o mês é junho ");
            break;
            case 7:
            System.out.println("o mês é julho");
            break;
            case 8:
            System.out.println("o mês é agosto");
            break;
            case 9:
            System.out.println("o mês é setembro");
            break;
            case 10:
            System.out.println("o mês é outubro");
            break;
            case 11:
            System.out.println("o mês é novembro");
            break;
            case 12:
            System.out.println("o mês é dezembro");
            break;
            default:
            System.out.println("não existe essa opção");
        }
    }
}
