
public class Exam43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 81;
		Exam43 ex = new Exam43();
		System.out.println("youre score is " + score + " and your grade is " + ex.grade(score));
	}

	private String grade(int score) {
		switch (score) {
		case 80: {

			return "A";

		}
		case 70:
			return "B";
		case 60:
			return "C";
		case 50:
			return "D";
		case 40:
			return "F";
		default:
			// throw new IllegalArgumentException("Unexpected value: " + score);
			return "E";
		}
	}
}
