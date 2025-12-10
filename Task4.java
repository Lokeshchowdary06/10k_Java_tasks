
public class Task4 {
	public static void updateScore(int score, int bonus) {
		System.out.println("Updated score after subtraction: " + (score -= bonus));
		System.out.println("Updated score after addition: " + (score += bonus));
		System.out.println("Updated score after division: " + (score /= bonus));
		System.out.println("Updated score after multiplication: " + (score *= bonus));
		System.out.println("Updated score after modulous: " + (score %= bonus));
	}

	public static void main(String[] args) {
		int score = 69;
		int bonus = 5;
		updateScore(score, bonus);
	}

}
