import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;



public class InputFileTest {

	@Test
	public void test() throws FileNotFoundException {
		String actual = "Test\n";
		InputFile input  = new InputFile();
		String matcher = input.read("hoge.txt"); 
		assertThat(actual, is(matcher));
	}

}
