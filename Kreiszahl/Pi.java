
public class Pi {

	/**
	 * @param args
	 */
	
	public static double berechne_pi(int tropfenzahl) {
		  double pi = 0;
		  int innerhalb = 0;
		  int gesamt = tropfenzahl;

		  while (tropfenzahl > 0) { // generiere Tropfen und addiere je nach Zugehörigkeit
		    double dotx = 2 * Math.random() - 1;
		    double doty = 2 * Math.random() - 1;

		    if (dotx*dotx + doty*doty <= 1) {
		      // Punkt liegt innerhalb des Kreises
		      innerhalb++;
		    } else {
		      // Punkt liegt außerhalb des Kreises
		    }

		    tropfenzahl--;
		  }

		  pi = 4*(double)innerhalb/gesamt;
		  return pi;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(berechne_pi(1000000));
	}
}
