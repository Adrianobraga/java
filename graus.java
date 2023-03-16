import java.util.Scanner;
 public class graus {
  public static Scanner leia=new Scanner(System.in);
   public static void main (String args[]){
   
    float c;
    float f;
    
    System.out.println("digite o °C");
    c=leia.nextFloat();
    f = c * 1.8f + 32;
    System.out.println("resultado foi:"+f);
}}