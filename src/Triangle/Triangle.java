package Triangle;

public class Triangle {
	
	public boolean isRightAngle(int length, int width, int hyp) {
		if(((length*length)+(width*width)) == (hyp*hyp)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		System.out.println(t1.isRightAngle(3, 4, 5));
		System.out.println(t1.isRightAngle(3, 3, 5));
	}
}


