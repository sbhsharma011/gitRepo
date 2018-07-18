package redHatQuiz.questions.questionsOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;


public class RangeImplm implements Range {

	//Range range;
	
	/*private final int[] emptyRange = {};
	
	public int[] rangeLimit;*/
	ArrayList<Object> rangeLimit;
	
	public RangeImplm() {
		super();
		this.rangeLimit = new ArrayList<Object>();
	}
	
	@Override
	public Range newRange(int from, int to) {
		RangeImplm rng = new RangeImplm();
		ArrayList<Object> arylist =  new ArrayList<Object>();
		while(from<=to){
			//System.out.println(from);
			arylist.add(from);
			from++;
		}
		
		rng.rangeLimit = (ArrayList<Object>) this.sort(arylist);
		return rng;
		
	}

	@Override
	public boolean isIn(int value) {
		
		return rangeLimit.contains(value);
	}

	@Override
	public int min() {
		return (int)rangeLimit.get(0);
	}

	@Override
	public int max() {
		// TODO Auto-generated method stub
		
		return (int)rangeLimit.get(rangeLimit.size()-1);
	}

	@Override
	public Range add(Range r) {
		RangeImplm rimpl = (RangeImplm)r;
		ListIterator<Object> li = rimpl.rangeLimit.listIterator();
		while(li.hasNext()){
		this.rangeLimit.add(li.next());
		}
		this.rangeLimit = (ArrayList<Object>) this.sort(this.rangeLimit);
		return this;
		
		
	}
	
	private List<Object> sort(List<Object> list){
		
		Collections.sort(list, new Comparator<Object>() {


			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return ((Integer)o1).compareTo((Integer)o2);
			}
		});
		
		return list;
		
		
	}

}
