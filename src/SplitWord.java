import java.io.FileNotFoundException;


public class SplitWord {

	String[] split(String sentence) throws FileNotFoundException {
		
		String[] words = sentence.split(" ");
		
		return words;
	}
}
