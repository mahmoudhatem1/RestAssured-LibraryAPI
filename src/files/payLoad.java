package files;

public class payLoad {
	public static String returningLibraryApi(String isbn,String aisle) {
		return "{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\"John foee\"\r\n"
				+ "}\r\n"
				+ " ";
	}

}
