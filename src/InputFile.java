import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class InputFile {

	String read(String fileName) throws FileNotFoundException{
	
		//�t�@�C���ǂݍ��݂̏���
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		
		//�P�s���Ƃɓǂݎ�邽�߂̑O����
		StringBuffer text = new StringBuffer(1024);
		String line;
		String lineSeparator = System.getProperty("line.separator");
		
		//�t�@�C���ǂݍ��ݏ���
		try {
			while((line = br.readLine()) != null) {
				text.append(line);
				text.append(lineSeparator);
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
		//String�^�ɕϊ����ĕԂ�
		String replaceText  = new String(text);
		Pattern pattern = Pattern.compile("\n$");
		Matcher matcher = pattern.matcher(replaceText);
		String strResult = matcher.replaceAll("");
		return strResult;
	}
	
}