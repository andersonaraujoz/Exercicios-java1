import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero ");
		
		int num = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(num + "X" + i + "=" + (num*i));
		}

	}

}
