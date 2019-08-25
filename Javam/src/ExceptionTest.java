import java.io.*;

public class ExceptionTest {
	public static void main(String[] args) throws IOException {
		FileReader reader = null;
		try {
			reader.read();
		} catch (NullPointerException e) {
			System.out.println("read()");
			try {
				close();
			} catch (IOException inner) {
				System.out.println("close()");
			}
		}
	}

	private static FileReader read()  {
		return null;
	}
	private static FileReader close() throws IOException {
		 throw new IOException(); 
		//return null;
	}
}
