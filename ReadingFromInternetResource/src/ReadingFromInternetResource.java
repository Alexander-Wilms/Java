import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ReadingFromInternetResource {

	public static void main(String[] args) {

		URL MyURL;

		try {
			MyURL = new URL("https://raw.githubusercontent.com/torvalds/linux/master/README");
			URLConnection MyConnection = MyURL.openConnection();
			InputStream MyInputStream = MyConnection.getInputStream();
			Scanner MyScanner = new Scanner(MyInputStream);
			while(MyScanner.hasNextLine())
				System.out.println(MyScanner.nextLine());
			MyScanner.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
