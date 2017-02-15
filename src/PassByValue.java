
public class PassByValue {
	public static void main(String[] args){
		Point p1 = new Point(5, 7);
		Point p2 = new Point(6, 4);
		
		System.out.println("-------------------------------");
		
		System.out.println("p1: " + p1.toString());
		System.out.println("p2: " + p2.toString());
		
		System.out.println("-------------------------------");
		
		Point temp = p1;
		p1 = p2;
		p2 = temp;
		
		// Swapped
		System.out.println("p1: " + p1.toString());
		System.out.println("p2: " + p2.toString());
		
		System.out.println("-------------------------------");
		
		PassByValue to = new PassByValue();
		to.swap(p1, p2);
		
		// Not Swapped
		System.out.println("p1: " + p1.toString());
		System.out.println("p2: " + p2.toString());
		
		System.out.println("-------------------------------");
		
		Point updatedP1 = to.swap1(p1, p2);
		
		System.out.println("p1: " + p1.toString());
		System.out.println("p2: " + p2.toString());
		
		System.out.println("updated P1: " + updatedP1.toString());
	}
	
    void swap(Point p1, Point p2){
		Point temp = p1;
		p1 = p2;
		p2 = temp;
	}
    
    Point swap1(Point p1, Point p2){
		Point temp = p1;
		p1 = p2;
		p2 = temp;
		
		return p1;
	}
}

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
