package company;

public class RandomNumberGenerator {
	
	public static int getRandomNumber(int size){
		
		return new java.util.Random().nextInt(size);
	}
}