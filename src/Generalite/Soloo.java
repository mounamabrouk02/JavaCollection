package Generalite;

public class Soloo<T> {
	private T valeur;
	public Soloo(){
		this.valeur = null;
	}
	public Soloo(T val) {
		this.valeur = val;
	}
	public void setValue(T val) {
		this.valeur = val;
	}
	public T getValue() {
		return this.valeur;
	}
	public String toString() {
		return "Mon objet est : "+this.valeur;
	}
	public static void main(String[] args) {
		Soloo<Integer> objet1 = new Soloo<Integer>(12);
		System.out.println(objet1);
		Soloo<String> objet2 = new Soloo<String>("Mostafa");
		System.out.println(objet2);		
		Soloo<Double> objet3 = new Soloo<Double>(12.780303);
		System.out.println(objet3);
		Soloo<Float> objet4 = new Soloo<Float>(1.87F);
		System.out.println(objet4);
	}
}