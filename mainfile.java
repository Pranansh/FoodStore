import java.util.Scanner;

public class mainfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("HELLO");
		Scanner sc=new Scanner(System.in);
		zotato z=new zotato();
//		z.print();
		int ch1,ch2;
		while (true) {
			z.menu1();
			ch1=sc.nextInt();
			if (ch1==1) {
				z.menu2();
				ch2=sc.nextInt();
				z.func1(ch2-1);
			}
			else if (ch1==2) {
				z.menu4();
				ch2=sc.nextInt();
				z.func2(ch2-1);
			}
			else if (ch1==3) {
				System.out.println("1. Customer List");
				System.out.println("2. Restaurant list");
				int m1=sc.nextInt();
				z.checkdetail(m1);
			}
			else if (ch1==4) {
				z.func6();
				//System.out.println("Delivery charge is : "+deliverycharge);
			}
			else {
				break;
			}
		}

	}
}
