import java.util.*;
public class zotato {
	
	Scanner s=new Scanner(System.in);
	
	private restaurant[] r=new restaurant[5];
	private customer[] c=new customer[5];
	protected float accountbalance,deliverycharge;
	
	zotato() {
		r[0]=new restaurant("Shah","authentic");
		r[1]=new restaurant("Ravi's","normal");
		r[2]=new restaurant("The chinese","authentic");
		r[3]=new restaurant("Wang's","fastfood");
		r[4]=new restaurant("Paradise","normal");
		
		c[0]=new customer("Ram","elite");
		c[1]=new customer("Sam","elite");
		c[2]=new customer("Tim","spl");
		c[3]=new customer("Kim","normal");
		c[4]=new customer("Jim","normal");
		
		accountbalance=0;
		deliverycharge=0;
		
	}
	
	void print() {
		System.out.println(r[0].getname());
	}
	
	void menu1() {
		System.out.println("Welcome to Zotato :");
		System.out.println("1. Enter as Restaurant Owner");
		System.out.println("2. Enter as customer");
		System.out.println("3. Check User details");
		System.out.println("4. Company Account details");
		System.out.println("5. Exit");
	}
	
	void menu2() {
		System.out.println("Choose Restaurant");
		for (int i=0;i<5;i++) {
			System.out.println(i+1+") "+r[i].getname()+" ("+r[i].gettype()+")");
		}
	}
	
	void func1(int j) {
		r[j].menu3();
	}
	
	void menu4() {
		System.out.println("Choose customer");
		for (int i=0;i<5;i++) {
			System.out.println(i+1+") "+c[i].getname()+" ("+c[i].gettype()+")");			
		}
	}
	
	void func2(int j) {
		c[j].menu3(r);
	}
	
	void checkdetail(int m1) {
		if (m1==1) {
			for (int i=0;i<5;i++) {
				System.out.println(i+1+") "+c[i].getname());
//				int m2=s.nextInt();
//				int l=m2-1;
//				System.out.println(c[l].getname()+" ("+c[l].gettype()+"), "+c[l].getwallet()+"/-");
			}
			int m2=s.nextInt();
			int l=m2-1;
			System.out.println(c[l].getname()+" ("+c[l].gettype()+"), "+c[l].getwallet()+"/-");
		}
		else if (m1==2) {
			for (int i=0;i<5;i++) {
				System.out.println(i+1+") "+r[i].getname());
//				int m2=s.nextInt();
//				int l=m2-1;
//				System.out.println(r[l].getname()+" ("+r[l].gettype()+") ");
			}
			int m2=s.nextInt();
			int l=m2-1;
			System.out.println(r[l].getname()+" ("+r[l].gettype()+") ");
		}
		
	}
	
	void func6() {
		
		deliverycharge=0;
		accountbalance=0;
		for (int i=0;i<5;i++) {
			deliverycharge+=r[i].delcharge;
			accountbalance+=r[i].acbalance;
		}
		System.out.println("Delivery charge is : "+deliverycharge);
		System.out.println("Account balance is : "+accountbalance);
	}
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//System.out.println("HELLO");
//		Scanner sc=new Scanner(System.in);
//		zotato z=new zotato();
////		z.print();
//		int ch1,ch2;
//		while (true) {
//			z.menu1();
//			ch1=sc.nextInt();
//			if (ch1==1) {
//				z.menu2();
//				ch2=sc.nextInt();
//				z.func1(ch2-1);
//			}
//			else if (ch1==2) {
//				z.menu4();
//				ch2=sc.nextInt();
//				z.func2(ch2-1);
//			}
//			else if (ch1==3) {
//				System.out.println("1. Customer List");
//				System.out.println("2. Restaurant list");
//				int m1=sc.nextInt();
//				z.checkdetail(m1);
//			}
//			else if (ch1==4) {
//				z.func6();
//				//System.out.println("Delivery charge is : "+deliverycharge);
//			}
//			else {
//				break;
//			}
//		}
//
//	}

}
