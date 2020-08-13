import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the maximum value: ");
		int max = sc.nextInt();
		
		int a=0, b=1, temp=0;
		
		while(true){
			a=b;
			b=temp;
			temp=a+b;
			if (temp<=max){
				System.out.print(temp + "  ");
			}
			else
				break;
		}
		sc.close();
	}
}
