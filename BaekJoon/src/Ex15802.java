import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex15802 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String name = br.readLine();

		if (name.equals("kkyu8925")) {
			bw.write(String.valueOf("1"));
		} else {
			bw.write(String.valueOf("0"));
		}

		bw.flush();
	}

}