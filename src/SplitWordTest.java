import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;


public class SplitWordTest {

	@Test
	public void test() throws FileNotFoundException {
		String[] actual = {"Test", "hogehoge\n"};
		
		InputFile input  = new InputFile();
		String text = input.read("hoge.txt"); 
		
		SplitWord splitInstance = new SplitWord();
		String[] matcher = splitInstance.split(text);
		
		assertThat(actual, is(matcher));
	}

}
