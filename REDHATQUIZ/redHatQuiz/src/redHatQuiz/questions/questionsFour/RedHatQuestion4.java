package redHatQuiz.questions.questionsFour;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class RedHatQuestion4 {
	
	public static void main(String[] args) {
		RedHatQuestion4 obj = new RedHatQuestion4();
		List<String> li = new ArrayList<>();
		li.add("q");
		li.add("w");
		li.add("e");
		li.add("r");
		Iterator<String> it1 = li.iterator();
		List<String> li2= new ArrayList<>();
		//li2.clear();
		li2.add("T");
		li2.add("Y");
		Iterator<String> it2 = li2.iterator();
		System.out.println("calling O(n)");
		List<String> list = obj.combine(it1, it2);
		Iterator<String> it3 = list.iterator();
		while (it3.hasNext()) {
			String string = (String) it3.next();
			System.out.println(string);
		}
		
		System.out.println("Calling o(1) approach");
		List<String> eg2li = new ArrayList<>();
		li.add("q");
		li.add("w");
		li.add("e");
		li.add("r");
		Iterator<String> eg2it1 = li.iterator();
		List<String> eg2li2= new ArrayList<>();
		//li2.clear();
		li2.add("T");
		li2.add("Y");
		Iterator<String> eg2it2 = li2.iterator();
		Iterator<String>[] iterators=new Iterator[]{eg2it1, eg2it2};
		Iterator<String> it4 = obj.combine(iterators);
		while (it4.hasNext()) {
			System.out.println((String) it4.next());
			
		}
	}

	//O(1)
	private Iterator<String> combine(Iterator<String>...iterators){
		List<String> returnList = new CopyOnWriteArrayList<String>();
		Iterator<String> listOfIterator = new ListOfIterator<String>(iterators);
		while ( listOfIterator.hasNext() )
			returnList.add(listOfIterator.next());
		return returnList.iterator();
	}
	
	
	//O(n)
	private List<String> combine(Iterator<String> it1, Iterator<String> it2){
		List<Iterator<String>> list = new CopyOnWriteArrayList<Iterator<String>>();
		list.add(it1);
		list.add(it2);
		
		List<String> returnList = new CopyOnWriteArrayList<String>();
		Iterator<Iterator<String>>  iterator = list.iterator();
		while (iterator.hasNext()) {
			Iterator<String> temp = iterator.next();
			while (temp.hasNext()) {
				returnList.add(temp.next());
			}
			
		}
		
		return returnList;
	}
}
