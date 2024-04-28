import java.util.Scanner;
public class crescente{
    public static Scanner leia = new Scanner(System.in);
    public static void main(String org[]){
    int num;
    int num1;
    System.out.println("digite 1 ou 2");
    num1=leia.nextInt();
    
        if(num1 == 1){
        for(num = 0; num <= 10; num++){
    
        System.out.println(num);
        }
    
        if (num1 == 2){
        for(num = 100; num > 0; num--){
            System.out.println(num);
        
        }
    } 
    else{
        System.out.println("não tem essa opção");

    }}
    }}
