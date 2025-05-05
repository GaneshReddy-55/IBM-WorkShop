package com.ibm.objects;


class Point{
	int x,y;
	Point(int x, int y){
		this.x = x; 
		this.y = y;
		
	}
	
	@Override
	public boolean equals(Object target) {
		
		if(target instanceof Object) {
			Point point2 = (Point)target;
			if(this.x==point2.x && this.y==point2.y) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		 return x+","+y;
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point1 = new Point(2,4);
		Point point2 = new Point(2,5);
		String strpoint = point1.toString();
		System.out.println(point1);
		System.out.println(strpoint);
		System.out.println(point1.equals(point2));

	}

}
