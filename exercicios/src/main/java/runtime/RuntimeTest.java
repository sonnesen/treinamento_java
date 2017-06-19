package runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RuntimeTest {

	public static void main(String[] args) throws IOException {
		String command = "cmd /c dir";
		Process processo = Runtime.getRuntime().exec(command);

		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(
						processo.getInputStream()));

		String line = null;

		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}

		reader.close();
	}

}
