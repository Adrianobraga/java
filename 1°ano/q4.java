import java.util.Scanner;
 public class q4 {
  public static Scanner leia=new Scanner(System.in);
public static void main (String args[]){
float base; float altura; float area; 
System.out.print("digite a base:");
base = leia.nextFloat();
System.out.print("digite a altura:");
altura = leia.nextFloat();
area = base*altura;
System.out.print("o resultado da area foi:"+area);
}
 }
