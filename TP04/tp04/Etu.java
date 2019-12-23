package tp04;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Etu {
		private String nom;
		private String prenom;
		private int matricule;
		private static int nbEtu = 0;
		private int [] resultats;
		private Date date;
	
		public Etu() {
			this.nom = JOptionPane.showInputDialog("Entre le nom de l'étudiant");
			this.prenom = JOptionPane.showInputDialog("Entre le prénom de l'étudiant");
			//this.matricule = Integer.parseInt(JOptionPane.showInputDialog("Entre le numéro ID de l'étudiant"));
			nbEtu++;
			this.matricule = nbEtu;
			this.date = new Date(JOptionPane.showInputDialog("Entre la date ")); 
		}
		
		public Etu(String nom, String prenom/*, int matricule*/) {
			this.nom = nom;
			this.prenom = prenom;
			//this.matricule = matricule;
			nbEtu++;
			this.matricule = nbEtu;
		}
		
		
		
	public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public int getMatricule() {
			return matricule;
		}

		public void setMatricule(int matricule) {
			this.matricule = matricule;
		}

		public static int getNbEtu() {
			return nbEtu;
		}

		public static void setNbEtu(int nbEtu) {
			Etu.nbEtu = nbEtu;
		}

		public int[] getResultats() {
			return resultats;
		}

		public void setResultats(int[] resultats) {
			this.resultats = resultats;
		}
		
		
		/**
		 * @return the date
		 */
		public Date getDate() {
			return date;
		}

		/**
		 * @param date the date to set
		 */
		public void setDate(Date date) {
			this.date = date;
		}

		/**
		 * divise la somme des résultats par le nombre de resultats 
		 * @return un double qui correspond a la moyenne
		 */
		public double moyenne() {
			if(this.resultats == null) return 0;
			double somme = 0;
			for(int i:resultats) {
				somme += i;
			}
			return somme/resultats.length;
		}
		
		public String toString(){
			return ("Nom: " + this.getNom() + "\nPrénom: " + this.getPrenom() + "\nMatricule: " + this.getMatricule() + "\nDate: " + this.getDate());
		}
		

		public boolean equals(Object obj) {
			if(this == obj) return true;
			if(obj == null) return false;
			if(this.getClass() != obj.getClass()) return false;
			Etu other = (Etu)obj;
			if(this.matricule != other.matricule) return false;
			return true;
		}
		
		
		public int compareTo(Etu etu) {
			if(this.equals(etu)) return 0;
			return this.matricule < etu.matricule ? -1 : 1;
		}
		
		

	public static void main(String[] args) {
		Etu e = new Etu();
		//Etu e2 = new Etu();
		//e2.setMatricule(1);
		//e.setResultats(new int[] {10,10,10,10,10});
		//System.out.println(e.moyenne());
		//System.out.println(e2);
		//System.out.println(e2.equals(e));
		//System.out.println(e2.compareTo(e));
		//System.out.println(e.compareTo(e2));
		System.out.println(e);
		

	}

	}
