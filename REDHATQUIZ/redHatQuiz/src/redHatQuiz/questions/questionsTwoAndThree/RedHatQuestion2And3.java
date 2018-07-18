package redHatQuiz.questions.questionsTwoAndThree;

import java.util.ArrayList;
import java.util.ListIterator;

public class RedHatQuestion2And3 {
	public static void main(String[] args) {
		RedHatQuestion2And3 obj = new RedHatQuestion2And3();
		String[] str = new String[50001];
		for (int i = 0; i < str.length; i++) {
			str[i]="abc"+i;
		}
		System.out.println(obj.addStringItems(str, true));
		//System.out.println(obj.addStringItemsUsingCollection(str, false));
	}

	private String addStringItems(String[] items, boolean forceUpperCase){
		//OPTIMIZATION
		//String should not be used when the value is constantly changing
		//as it will create a new object when it value change, due to it's immutable behaviour
		//String returnValue="";

		//StringBuilder is Faster as it is not thread safe
		//and the same object object will be updated with appended value
		StringBuilder returnValue = new StringBuilder();
		for (int i = 0; i < items.length; i++) {
			returnValue.append(items[i]);
		}
		
		//return forceUpperCase? returnValue.toUpperCase(): returnValue;
		return forceUpperCase? returnValue.toString().toUpperCase(): returnValue.toString();
	}
	
	
//QUESTION 3
	/*String array is iterated and added to the list
	 * ArrayList is chosen as ArrayList is dyanamic in nature, it grows as per need
	 * ArrayList is the best collection for insertion and traversing
	 * and implementation does not require manipulating or deleting the data as this requires a lot of processing */
	
	/*The unoptimized function is Thread Safe as String is immutable and Thread Safe*/
	/*The optimized implementation is not Thread safe */
	/*To make it Thread Safe, we should use StringBuffer instead of String builder*/
	private String addStringItemsUsingCollection(String[] items, boolean forceUpperCase){
		StringBuilder returnValue = new StringBuilder();
		ArrayList<String> itemList = new ArrayList<String>();
		for (int i = 0; i < items.length; i++) {
			itemList.add(items[i]);
		}
		ListIterator<String> iterator = itemList.listIterator();
		while (iterator.hasNext()) {
			returnValue.append(iterator.next());			
		}		
		//return forceUpperCase? returnValue.toUpperCase(): returnValue;
		return forceUpperCase? returnValue.toString().toUpperCase(): returnValue.toString();
	}

}
