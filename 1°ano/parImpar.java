import java.util.Scanner;
public class parImpar{
public static Scanner leia= new Scanner(System.in);
public static void main(String[] args) {
int par;
parImpar(par=leia.nextInt());
}
public static void parImpar(int par)
{
if(par %2== 0  ){
    System.out.println("o numero é par");
}else{
    System.out.println("o numero é impar");
}
}
}
