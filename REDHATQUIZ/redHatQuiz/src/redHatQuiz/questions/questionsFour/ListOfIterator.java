package redHatQuiz.questions.questionsFour;

import java.util.Iterator;

public class ListOfIterator <T> implements Iterator<T> {
    private final Iterator<T> iteratorAry[];
    private int current;

    public ListOfIterator(Iterator<T>... iterators)
    {
    	iteratorAry = iterators;
            current = 0;
    }

    public boolean hasNext() {
            while ( current < iteratorAry.length && !iteratorAry[current].hasNext() )
                    current++;

            return current < iteratorAry.length;
    }

    public T next() {
            while ( current < iteratorAry.length && !iteratorAry[current].hasNext() )
                    current++;

            return iteratorAry[current].next();
    }

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
}
