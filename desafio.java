import java.util.Scanner;
 public class desafio {
  public static Scanner leia=new Scanner(System.in);
   public static void main (String args[]){
   
    int num;
    int num1 = 1;
    int num2 = 1;
    System.out.print("digite o numero de termos:");
    num=leia.nextInt();
    System.out.println(num1);
    System.out.println(num2);
    for(int i = 2;i<num;i++){
        num1=num2+num1;
        num2=num1-num2;
        System.out.println(num1);
    }
}}