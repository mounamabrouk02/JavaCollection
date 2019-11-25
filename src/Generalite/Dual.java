package Generalite;

public class Dual<M,A> {
	private M val1;
	private A val2;
	
	public Dual(){
		this.val1 = null;
		this.val2 = null;
	}
	public Dual(M v1,A v2){
		this.val1 = v1;
		this.val2 = v2;
	}
	public void setValue(M v1,A v2) {
		this.val1 = v1;
		this.val2 = v2;
	}
	public void setValue1(M v1) {
		this.val1 = v1;
	}
	public void setValue2(A v2) {
		this.val2 = v2;
	}
	public M getValue1() {
		return this.val1;
	}
	public A getValue2() {
		return this.val2;
	}
	public String toString() {
		return "valeur 1 est : "+val1+" valeur 2 est : "+val2;
	}
	public static void main(String[] args) {
		Dual<String,Integer> v1 = new Dual<String,Integer>("Mostafa",21);
		System.out.println(v1);
		Dual<Double,Float> v2 = new Dual<Double,Float>(1.632984,1.23F);
		System.out.println(v2);
		Dual<Boolean,String> v3 = new Dual<Boolean,String>(true,"f");
		System.out.println(v3.toString());
	}
}
