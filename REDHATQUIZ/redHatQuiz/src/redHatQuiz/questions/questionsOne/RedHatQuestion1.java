package redHatQuiz.questions.questionsOne;

public class RedHatQuestion1 {
	public static void main(String[] args) {

		RangeImplm rimpl = new RangeImplm();

		System.out.println(rimpl.newRange(1, 5).isIn(3));
		System.out.println(rimpl.newRange(1, 5).isIn(6));
		System.out.println(rimpl.newRange(1, 5).add(rimpl.newRange(8, 10)).isIn(6));
		System.out.println(rimpl.newRange(8, 10).add(rimpl.newRange(4, 10)).min());
		System.out.println(rimpl.newRange(8, 12).add(rimpl.newRange(4, 10)).max());
	}
}
