import java.util.Scanner;
 public class operacoes {
  public static Scanner leia=new Scanner(System.in);
   public static void main (String args[]){
      int num1;
      int num2;
      int num;
      int soma;
      System.out.print("digite um número");
      num1 = leia.nextInt();
      System.out.print("digite outro número");
      num2 = leia.nextInt();
 System.out.print("1 soma,2 subtração,3 multiplicação,4 divisão");
num = leia.nextInt();
switch (num){
   case(1):
soma=num1+num2;
System.out.print("o resultado é:"+soma);
break;
case(2):
soma=num1-num2;
System.out.print("o resultado é:"+soma);
break;
case(3):
soma=num1*num2;
System.out.print("o resultado é:"+soma);
break;
case(4):
soma=num1/num2;
System.out.print("o resultado é:"+soma);
break;
default:
System.out.print("não tem essa função");
}

   }
}
