import java.util.Scanner;
public class at {
 public static Scanner leia=new Scanner(System.in);
 public static void main (String args[]){
    int number1;
	int number2;
    int primeiro;
	System.out.print("Digite o primeiro número:   \n");
	number1 = leia.nextInt();
	
	System.out.print("Digite o segundo número:    \n");
	number2 =  leia.nextInt();
	
	if(number1 > number2){
		primeiro=number1;
		System.out.print("esse número vem primeiro:"+primeiro);
	}
	else if(number2 >number1){
		primeiro=number2;
		System.out.print("esse número vem primeiro:"+primeiro);
	}
	else{
		System.out.print("os número são iguais:");
	}
 }
}
	
    
