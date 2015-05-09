import java.awt.EventQueue;

public class Jeu {
	
	private TestTableau1 tableau1 = new TestTableau1();
	private TestTableau2 tableau2 = new TestTableau2();
	Jeu(){
		
	}
	
	 public static void main(String[] args) {

	        EventQueue.invokeLater(new Runnable() {

	            @Override
	            public void run() {
	                 new TestTableau1();
	                 new TestTableau2();
	                
	            }
	        });
	    }

}
