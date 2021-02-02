import java.util.*;
public class customer{
	
	Scanner sc4=new Scanner(System.in);
	private String name;
	float reward;
	float discount;
	float delivery;
	private String type;
	private float cartamt=0;
	private ArrayList<fooditem> cart=new ArrayList<fooditem>();
	private ArrayList<String> rname=new ArrayList<String>();
	private String restname;
	private float wallet;
	private ArrayList<fooditem> recent=new ArrayList<fooditem>();
	
	customer(){
		
	}
	
	customer(String name1, String type1){
		name=name1;
		type=type1;
		wallet=1000;
	}
	
	String getname() {
		return name;
	}

	String gettype() {
		return type;
	}
	
	void setname(String str) {
		name=str;
	}
	
	void settype(String str) {
		type=str;
	}
	
	float getwallet() {
		return wallet;
	}
	
	void printfooditems(restaurant r2) {
		
		for (int i=0;i<r2.items.size();i++) {
			fooditem f=r2.items.get(i);
			System.out.println(f.getid()+" "+f.getname()+" "+f.getprice()+" "+f.getqty()+" "+f.getoffer()+"% off "+f.getcategory());
		}
		
	}
	
	void chooserestaurant(restaurant[] r1) {
		System.out.println("Choose Restaurant");
		for (int i=0;i<5;i++) {
			System.out.println(i+1+") "+r1[i].getname()+" ("+r1[i].gettype()+")");
		}
		
		int ch5=sc4.nextInt();
		int k1=ch5-1;
		
		printfooditems(r1[k1]);
		
		System.out.println("Choose item by code");
		
		int code=sc4.nextInt();
		
		System.out.println("Enter Quantity");
		int quantity=sc4.nextInt();
		
		
		int k=0;
		for (int i=0;i<r1[k1].items.size();i++) {
			fooditem f=r1[k1].items.get(i);
			if (f.getid()==code) {
				k=i;
				break;
			}
		}
		
		fooditem f=r1[k1].items.get(k);
		
		
		
		//System.out.println(f.getoffer());
		
//		System.out.println(f.getid());
//		System.out.println(f.getname());
//		System.out.println(f.getprice());
//		System.out.println(quantity);
//		System.out.println(f.getcategory());
		
		fooditem f2=new fooditem(f.getname(),f.getcategory(),f.getprice(),quantity,f.getoffer(),f.getid());
		cart.add(f2);
		recent.add(f2);
		rname.add(r1[k1].getname());
		restname=r1[k1].getname();
		
		int newqty=r1[k1].items.get(k).getqty()-quantity;
		r1[k1].items.get(k).setqty(newqty);
		
		System.out.println("Items added to cart");
		
	}
	
	void printcart(restaurant[] r1) {
		cartamt=0;
		for (int i=0;i<cart.size();i++) {
			fooditem f=cart.get(i);
			cartamt+=(f.getprice()*f.getqty());
			cartamt-=((cartamt)*(f.getoffer()/100));
			//System.out.println(f.getoffer());
			System.out.println(f.getid()+" "+rname.get(i)+" "+f.getname()+" "+f.getqty()+" "+f.getoffer()+"% off ");
		}
		
		
		
		//System.out.println(cartamt);
		
		
		for (int i=0;i<5;i++) {
			if (r1[i].getname()==restname) {
				if (r1[i].gettype().compareTo("fastfood")==0) {
					fastfoodr ffr=new fastfoodr();
					discount=ffr.discountcalc(cartamt, r1[i].offer);
					//reward=ffr.rewardcalc(cartamt);
				}
				else if (r1[i].gettype().compareTo("normal")==0) {
					normalr nor=new normalr();
					discount=nor.discountcalc(cartamt, r1[i].offer);
					//reward=nor.rewardcalc(cartamt);
				}
				else {
					authenticr aur=new authenticr();
					discount=aur.discountcalc(cartamt, r1[i].offer);
					//reward=aur.rewardcalc(cartamt);
				}
				break;
			}
		}
		
		cartamt-=(discount);
		
		
		//System.out.println(cartamt);
		
		
		if (type.compareTo("elite")==0) {
			elitec elc=new elitec();
			discount=elc.discountcalc(cartamt);
			delivery=elc.deliverycalc();
		}
		else if (type.compareTo("normal")==0) {
			normalc noc=new normalc();
			discount=noc.discountcalc(cartamt);
			delivery=noc.deliverycalc();
		}
		else {
			splc spc=new splc();
			discount=spc.discountcalc(cartamt);
			delivery=spc.deliverycalc();
		}
		
		cartamt-=(discount);
		cartamt+=(delivery);
		
		
		
		//System.out.println(cartamt);
		
//		if (wallet>=cartamt) {
//			wallet-=(cartamt);
//		}
//		else {
//			System.out.println("Cannot be purchased");
//			return;
//		}
		
		if (reward<=cartamt) {
			cartamt-=reward;
			//System.out.println("The reward discount was : "+reward);
			reward=0;
		}
		
		for (int i=0;i<5;i++) {
			if (r1[i].getname().compareTo(restname)==0) {
				if (r1[i].gettype().compareTo("fastfood")==0) {
					fastfoodr ffr=new fastfoodr();
					//discount=ffr.discountcalc(cartamt, r1[i].offer);
					reward=ffr.rewardcalc(cartamt);
					r1[i].reward=reward;
				}
				else if (r1[i].gettype().compareTo("normal")==0) {
					normalr nor=new normalr();
					//discount=nor.discountcalc(cartamt, r1[i].offer);
					reward=nor.rewardcalc(cartamt);
					r1[i].reward=reward;
				}
				else {
					authenticr aur=new authenticr();
					//discount=aur.discountcalc(cartamt, r1[i].offer);
					reward=aur.rewardcalc(cartamt);
					r1[i].reward=reward;
				}
				break;
			}
		}
		
//		if (reward<=cartamt) {
//			cartamt-=reward;
//			//System.out.println("The reward discount was : "+reward);
//			reward=0;
//		}
		
		if (wallet>=cartamt) {
			wallet-=(cartamt);
		}
		else {
			System.out.println("Cannot be purchased");
			return;
		}
		
		System.out.println("Items in cart are : ");
		System.out.println("Delivery charge is : "+delivery);
		System.out.println("Total Value : "+cartamt);
		
//		accountbalance=((cartamt)/100);
//		deliverycharge=delivery;
	
		for (int i=0;i<5;i++) {
			if (r1[i].getname().compareTo(restname)==0) {
				r1[i].delcharge+=delivery;
				r1[i].acbalance+=((cartamt)/100);
			}
		}
		
		cart.clear();
		rname.clear();
	}
	
	void printrecentorders() {
		for (int i=0;i<recent.size();i++) {
			fooditem f=recent.get(i);
			System.out.println(i+1+") "+f.getid()+" "+restname+" "+f.getname()+" "+f.getqty());
		}
	}
	
	void menu3(restaurant[] r1) {
		while (true) {
			System.out.println("Welcome "+name);
			System.out.println("1. select restaurant");
			System.out.println("2. checkout cart");
			System.out.println("3. rewards won");
			System.out.println("4. print recent orders");
			System.out.println("5. Exit");
			int ch4=sc4.nextInt();
			if (ch4==1) {
				chooserestaurant(r1);
			}
			else if (ch4==2) {
				printcart(r1);
			}
			else if (ch4==3) {
				System.out.println("Reward is : "+reward);
			}
			else if (ch4==4) {
				printrecentorders();
			}
			else {
				break;
			}
		}
	}
}
