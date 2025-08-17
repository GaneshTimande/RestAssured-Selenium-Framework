package SeleniumPractice;

public class WorldCharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hello Java World";
		String [] words=str.split(" ");
		for(String word:words) {
			System.out.println(word + " >> "+word.length() );
		}
	}

}
