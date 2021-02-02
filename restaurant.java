import java.util.*;
public class restaurant{
	
	Scanner sc3=new Scanner (System.in);
	
	int idcnt=1;
	private String name;
	float reward;
	float discount;
	int delivery;
	float offer;
	private String type;
	ArrayList<fooditem> items=new ArrayList<fooditem>();
	float acbalance,delcharge;
	
	restaurant(){
		
	}
	
	restaurant(String name1, String type1){
		name=name1;
		type=type1;
		reward=0;
		delivery=0;
		offer=0;
		acbalance=0;
		delcharge=0;
	}
	
	String getname() {
		return name;
	}
	
	String gettype() {
		return type;
	}
	
	void printlist() {
		System.out.println(") "+name+" ("+type+")");
	}
	
	void addfooditem() {
		
		System.out.println("Enter food item details");
		System.out.println("Food name");
		String name2=sc3.next();
		System.out.println("Item Price");
		int price2=sc3.nextInt();
		System.out.println("Item quantity");
		int qty2=sc3.nextInt();
		System.out.println("Item category");
		String category2=sc3.next();
		System.out.println("offer");
		float offer2=sc3.nextFloat();
		fooditem f=new fooditem(name2,category2,price2,qty2,offer2,idcnt);
		idcnt++;
		items.add(f);
		System.out.println(f.getid()+" "+f.getname()+" "+f.getprice()+" "+f.getqty()+" "+f.getoffer()+"% off "+f.getcategory());
		
	}
	
	void printfooditems() {
		
		for (int i=0;i<items.size();i++) {
			fooditem f=items.get(i);
			System.out.println(f.getid()+" "+f.getname()+" "+f.getprice()+" "+f.getqty()+" "+f.getoffer()+"% off "+f.getcategory());
		}
		
	}
	
	void editfooditem() {
		
		System.out.println("Choose Item by code");
		printfooditems();
		int code=sc3.nextInt();
		int k=0;
		for (int i=0;i<items.size();i++) {
			fooditem f=items.get(i);
			if (f.getid()==code) {
				k=i;
				break;
			}
		}
		
		fooditem f=items.get(k);
		
		System.out.println("Choose an Attribute to edit");
		System.out.println("1. name");
		System.out.println("2. price");
		System.out.println("3. qty");
		System.out.println("4. category");
		System.out.println("5. offer");
		
		int ch4=sc3.nextInt();
		if (ch4==1) {
			System.out.println("Enter new name");
			String name2=sc3.next();
			f.setname(name2);
		}
		else if (ch4==2) {
			System.out.println("Enter new price");
			int name2=sc3.nextInt();
			f.setprice(name2);
		}
		else if (ch4==3) {
			System.out.println("Enter new qty");
			int name2=sc3.nextInt();
			f.setqty(name2);
		}
		else if (ch4==4) {
			System.out.println("Enter new category");
			String name2=sc3.next();
			f.setcategory(name2);
		}
		else {
			System.out.println("Enter new offer");
			int name2=sc3.nextInt();
			f.setoffer(name2);
		}
		
		System.out.println(f.getid()+" "+f.getname()+" "+f.getprice()+" "+f.getqty()+" "+f.getoffer()+"% off "+f.getcategory());
	}
	
	void menu3() {
		while(true) {
			System.out.println("Welcome "+name);
			System.out.println("1. Add item");
			System.out.println("2. Edit item");
			System.out.println("3. Print rewards");
			System.out.println("4. Discount on bill value");
			System.out.println("5. Exit");
			int ch3=sc3.nextInt();
			if (ch3==1) {
				addfooditem();
			}
			else if (ch3==2) {
				editfooditem();
			}
			else if (ch3==3) {
				System.out.println("Reward points : "+reward);
			}
			else if (ch3==4) {
				System.out.println("Offer on bill value is :");
				offer=sc3.nextInt();
			}
			else {
				break;
			}
		}
	}
	

}
