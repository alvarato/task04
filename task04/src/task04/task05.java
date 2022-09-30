package task04;

public class task05 {
	public static void main(String[] args) {
		
	int A = 1;
	int B = 2;
	int C = 3;
	int D = 4;
	int E = 6;
	
	System.out.println("A:"+ A + "--" + "B:" + B + "--" + "C:" + C + "--" + "D:" + D);
	
	B = C;
	C = A;
	A = D;
	D = B;
	
	System.out.println("A:"+ A + "--" + "B:" + B + "--" + "C:" + C + "--" + "D:" + D);
	}
}
