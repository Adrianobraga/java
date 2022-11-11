import java.util.Scanner;
public class tabela{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        int codigo;
        int copias;
        float pago;
        float valor;
        float troco;
        System.out.print("Digite o código: ");
        codigo=leia.nextInt();
        System.out.print("Digite a quantidade de cópias: ");
        copias=leia.nextInt();
        System.out.print("Valor pago: ");
        pago=leia.nextFloat();
        switch(codigo){
            case 10:
            valor= copias*1.50f;
            troco = valor - pago;
            if (pago>valor){   
            System.out.println("A quantidade de cópias é: " +copias);
            System.out.println("O valor pago foi: " +pago);
            System.out.println("O valor da compra é: " +(copias*1.50f));
            System.out.println("O seu troco é: " +(pago-(copias*1.50f)));
            }else{
                System.out.println("falta dinheiro");
            }
            break;
            case 20:
            valor= copias*0.80f;
            troco = valor - pago;
            if (pago>valor){  
            System.out.println("A quantidade de cópias é: " +copias);
            System.out.println("O valor pago foi: " +pago);
            System.out.println("O valor da compra é: " +(copias*0.80f));
            System.out.println("O seu troco é: " +(pago-(copias*0.80f)));
            }else{
                System.out.println("falta dinheiro");
            }
            break;
            case 30:
            valor= copias*0.60f;
            troco = valor - pago;
            if (pago>valor){  
            System.out.println("A quantidade de cópias é: " +copias);
            System.out.println("O valor pago foi: " +pago);
            System.out.println("O valor da compra é: " +(copias*0.60f));
            System.out.println("O seu troco é: " +(pago-(copias*0.60f)));
            }else{
                System.out.println("falta dinheiro");
            }
            break;
            case 40:
            valor= copias*2;
            troco = valor - pago;
            if (pago>valor){  
            System.out.println("A quantidade de cópias é: " +copias);
            System.out.println("O valor pago foi: " +pago);
            System.out.println("O valor da compra é: " +(copias*2));
            System.out.println("O seu troco é: " +(pago-(copias*2)));
            }else{
                System.out.println("falta dinheiro");
            }
            break;
            default:
            System.out.println("ERRO :( ");
            
        } 
    }
}
