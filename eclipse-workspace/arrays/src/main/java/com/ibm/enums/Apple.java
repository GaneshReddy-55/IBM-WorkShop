package com.ibm.enums;

enum Apples {
RedDel(12),
GoldenDel(23),
Green(13);
	
	int price;
	Apples(int cost){
		price=cost;
	}
	public int getPrice() {
		return price;
	}
	
	
}

public class Apple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apples[] apples = Apples.values();
		for(Apples apple:apples) {
			System.out.println(apple +" "+apple.getPrice());
		}
		Apples app=Apples.RedDel;
		System.out.println(app);
		
		app=Apples.valueOf("Green");
				System.out.println(app);
		

	}

}
