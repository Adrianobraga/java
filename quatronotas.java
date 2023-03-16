import java.util.Scanner;
 public class quatronotas {
  public static Scanner leia=new Scanner(System.in);
   public static void main (String args[]){
   
    float x[] = new float[4];
    float div;

    System.out.print("digite a primeira nota:");
    x[0] = leia.nextFloat();
    System.out.print("digite a segunda nota:");
    x[1] = leia.nextFloat();
    System.out.print("digite a terceira nota:");
    x[2] = leia.nextFloat();
    System.out.print("digite a quarta nota:");
    x[3] = leia.nextFloat();
    div = (x[0]+x[1]+x[2]+x[3])/4;
    System.out.println("a media foi:"+div);



}}