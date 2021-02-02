import java.util.*;
public class fooditem {
	
	private String name,category;
	private int price,qty;
	private float offer;
	
	private final int id;
	
	fooditem(String name1,String category1,int price1,int qty1, float offer1, int id1){
		name=name1;
		category=category1;
		price=price1;
		qty=qty1;
		offer=offer1;
		id=id1;
	}
	
	fooditem(int id1){
		id=id1;
	}
	
	fooditem(String name1,String category1,int price1,int id1){
		name=name1;
		category=category1;
		price=price1;
		id=id1;
	}
	
	
	String getname(){
		return name;
	}
	
	void setname(String str) {
		name=str;
	}
	
	String getcategory() {
		return category;
	}
	
	void setcategory(String str) {
		category=str;
	}
	
	int getprice() {
		return price;
	}
	
	void setprice(int b) {
		price=b;
	}
	
	int getqty() {
		return qty;
	}
	
	void setqty(int b) {
		qty=b;
	}
	
	float getoffer() {
		return offer;
	}
	
	void setoffer(int b) {
		offer=b;
	}
	
	int getid() {
		return id;
	}
	
}
