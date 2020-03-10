package libraries;

import java.io.FileReader;
import java.io.IOException;
import com.opencsv.CSVReader;

public class Dataprovider {
	private static String CSV_PATH = "src/test/resources/testdata.csv";
	static Dataprovider TestData = new Dataprovider();
	static String [] csvCell = TestData.ReadData();
	
	public static String url;
	public static String valid_email;
	public static String valid_password;
	public static String invalid_password;
	public static String invalid_email;
	
	public String[] ReadData() {
		// Retrieving data from CSV file
		try {
			CSVReader reader = new CSVReader(new FileReader(CSV_PATH));
			 //Retrieving data from a CSV file.
			csvCell = reader.readNext();
			csvCell = reader.readNext();
			url = csvCell[0];
			valid_email = csvCell[1];
			valid_password=csvCell[2];
			invalid_password=csvCell[3];
			invalid_email=csvCell[4];
			reader.close();

			
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] RetrivedData = {url,valid_email,valid_password,invalid_password,invalid_email };

		return RetrivedData;
}
}