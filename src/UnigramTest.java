import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import java.io.FileNotFoundException;
import java.util.HashMap;

import org.junit.Test;


public class UnigramTest {

	@Test
	public void test() throws FileNotFoundException {
		
		double actual = 0.5;
		
		
		InputFile input  = new InputFile();
		String text = input.read("hoge.txt"); 
		
		SplitWord splitInstance = new SplitWord();
		String[] words = splitInstance.split(text);
		
		Unigram unigram = new Unigram();
		HashMap<String, Double> matcher = unigram.UnigramPro(words);
		assertThat(actual, is(matcher.get("Test")));
		assertThat(actual, is(matcher.get("hogehoge")));
	}

}
