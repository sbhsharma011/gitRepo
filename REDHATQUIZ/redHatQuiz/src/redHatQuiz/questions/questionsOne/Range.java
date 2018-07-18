package redHatQuiz.questions.questionsOne;

public interface Range {

public Range newRange(int to, int from);
	
	public boolean isIn(int value);
	
	public int min();
	
	public int max();
	
	public Range add(Range r);
	
}
