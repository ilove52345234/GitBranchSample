package xxx;

public class mainApp {
	
	public static void main(String[] args) {
       System.out.println("第一個版本");
       int a=new gakki().add(10, 20);
       
       System.out.println(a);
    }

}

class gakki{
	
	int add(int a,int b) {
		return a+b;
	}
	
}