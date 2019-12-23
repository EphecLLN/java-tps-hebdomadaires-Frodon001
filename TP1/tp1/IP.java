/**
 * 
 */
package tp1;

import javax.swing.JOptionPane;

/**
 * @author florent
 *
 */
public class IP {

	
	private int octet1;
	private int octet2;
	private int octet3;
	private int octet4;
	
	
	
	
	public IP(int octet1, int octet2, int octet3, int octet4) {
		super();
		this.octet1 = octet1;
		this.octet2 = octet2;
		this.octet3 = octet3;
		this.octet4 = octet4;
	}
	
	

	public IP() {
		super();
		this.octet1 = Integer.parseInt(JOptionPane.showInputDialog("entre l'octet"));
		this.octet2 = Integer.parseInt(JOptionPane.showInputDialog("entre l'octet"));
		this.octet3 = Integer.parseInt(JOptionPane.showInputDialog("entre l'octet"));
		this.octet4 = Integer.parseInt(JOptionPane.showInputDialog("entre l'octet"));
	}



	public String toString() {
		return (octet1 + "." + octet2 + "." + octet3 + "." + octet4);
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IP ip = new IP(192,168,1,1);
		System.out.println(ip.toString());
		IP ip2 = new IP();
		System.out.println(ip2);
	}

}
