package ex1_stateless;

public class PriskalkulatorStateless {
	
	public int beregnTotalPrisMedRabatt(int stykkpris, int antall, double rabattprosent) {
		return (int) (stykkpris * antall * (1 - rabattprosent/100.0) + 0.5);
	}
	
	
}
