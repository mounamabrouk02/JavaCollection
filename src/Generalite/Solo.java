package Generalite;


public class Solo {
	private String valeur;
    public Solo() {
    	this.valeur=null;
    }
    public Solo(String valeur) {
    	this.valeur=valeur;
    }
    public void setValeur(String val) {
    	this.valeur = val;
    }
    public String getValeur() {
    	return this.valeur;
    }
    public String toString() {
    	return "mon objet est : "+this.valeur;
    }
    
    
	public static void main(String[] args) {
    Solo objet1 = new Solo("mouna");
    System.out.println(objet1.toString());
	}

}


