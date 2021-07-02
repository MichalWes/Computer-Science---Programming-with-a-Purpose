public class RightTriangle {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int c = Integer.parseInt(args[2]);
	boolean d = (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) == c);
        d = d || (Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2)) == a);
	d = d || (Math.sqrt(Math.pow(c, 2) + Math.pow(a, 2)) == b);
        d = d && a > 0 && b > 0 && c > 0; 
	System.out.println(d);
      }

}