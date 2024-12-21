package returntype.example;

public class Sample {
	
	public B A()
	{
		int a=10;
		B b = new B();
		return  b;
	}
	
	public static void main(String[] args) {
		Sample sample = new Sample();
		B b = sample.A();
		
		sample.A().testing();
		
		b.testing();
	}
	

}
