import java.util.Scanner;
public class Main {
//Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// Napishete programa, koiato priema realno chislo kato vhod, 
		//i izkarva na konzola rezultat ot delenieto mu s cialo chislo.
		{
Scanner scan=new Scanner (System.in);
System.out.print("Въведи число 1");
  double a = scan.nextDouble(); 
  System.out.print("Въведи цяло число 2");
  int b= scan.nextInt();
  double rezult = a/b;
  
  System.out.println("Резултата е:" + rezult );
		
		}

	}

}