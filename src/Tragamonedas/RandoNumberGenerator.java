package Tragamonedas;

public class RandoNumberGenerator implements NumberGenerator{

	@Override
	public Integer generate() {
		// TODO Auto-generated method stub
		return (int) (Math.random()*10 + 1);
	}
}
