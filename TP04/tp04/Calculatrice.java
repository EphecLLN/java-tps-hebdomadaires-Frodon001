package tp04;

public class Calculatrice {
	private double valeurCourante;

	
	public Calculatrice(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}
	
	public double getValeurCourante() {
		return valeurCourante;
	}

	public void setValeurCourante(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}
	
	public double carre(){
		return Math.pow(this.valeurCourante, 2);
	}
	
	@Override
	public String toString(){
		return("Calculatrice valeurCourante = "+this.valeurCourante);
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		if(this.getClass() != obj.getClass()) return false;
		Calculatrice other = (Calculatrice)obj;
		if(this.valeurCourante != other.valeurCourante) return false;
		return true;
	}
	
	public int compareTo(Calculatrice obj) {
		if(this.equals(obj))return 0;
		return this.valeurCourante < obj.valeurCourante ? -1 : 1;
	}
	
	public static void main(String[] args) {
		Calculatrice c = new Calculatrice(2);
		Calculatrice c1 = new Calculatrice(4);
		System.out.println(c.equals(c1));
		System.out.println(c.compareTo(c1));
	}
}