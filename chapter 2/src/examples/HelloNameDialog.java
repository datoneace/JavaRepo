package examples;
import javax.swing.JOptionPane; 
public class HelloNameDialog {
	public static void main(String[] args){
	
	String result;
	result = JOptionPane.showInputDialog(null, "what is your name?");
	JOptionPane.showMessageDialog(null, "Hello, " + result + "!");
		
		
		
//	int aWholeNumber = 315;
//	int STATES_IN_US = 50;
//	System.out.println("the number is " + aWholeNumber);
//	
//	System.out.println("the number is states is " + STATES_IN_US); 
	}
}
