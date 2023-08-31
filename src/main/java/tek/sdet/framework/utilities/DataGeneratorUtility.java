package tek.sdet.framework.utilities;

import net.datafaker.Faker;

public class DataGeneratorUtility {
	public static void main(String[] args) {
		
		System.out.println(data("firstName"));
		System.out.println(data("lastName"));
		System.out.println(data("fullName"));
		System.out.println(data("email"));
		System.out.println(data("password"));
		System.out.println(data("cartNumber"));
		System.out.println(data("PhoneNumber"));
		System.out.println(data("StreetAddress"));
		System.out.println(data("city"));
		System.out.println(data("state"));
		System.out.println(data("zipCode"));
		System.out.println(data("country"));
		System.out.println(data("United States"));
		System.out.println(data("year"));
	}
	
	public static String data(String input) {

		Faker faker = new Faker();

		String outPut = "";
		if (input.equals("firstName")) {
			outPut = faker.name().firstName();
		} else if (input.equals("lastName")) {
			outPut = faker.name().lastName();
		} else if (input.equals("email")) {
			outPut = faker.expression("#{letterify '?????@tekschool.us'}");
			
		} else if (input.equals("password")) {
			outPut = faker.expression("#{bothify '##?????@TEKschool.us'}");
			
//		} else if (input.equals("password")) {
//			outPut = faker.internet().password();
//		} else if (input.equals("PhoneNumber")) {
//			outPut = faker.phoneNumber().cellPhone();
		} else if (input.equals("PhoneNumber")) {
			outPut = faker.expression("#{numerify '904#######'}");
			
		} else if (input.equals("cartNumber")) {
			outPut = faker.expression("#{numerify '1##############7'}");
		} else if (input.equals("nameOnCard")) {
			outPut = faker.expression("#{letterify 'Abdul A ?????'}");
//		} else if (input.equals("expirationMonth")) {
//			outPut = faker.expression("#{date.birthday 'MM'}");
//		} else if (input.equals("expirationYear")) {
//			outPut = faker.expression("#{date.birthday 'yyyy'}");
		} else if (input.equals("securityCode")) {
			outPut = faker.expression("#{numerify '###'}");
			
		} else if (input.equals("expirationYear")) {
			outPut = faker.expression("#{numerify '2026'}");
		} else if (input.equals("expirationMonth")) {
			outPut = faker.expression("#{numerify '10'}");

			
		} else if (input.equals("fullName")) {
			outPut = faker.name().fullName();
		} else if (input.equals("StreetAddress")) {
			outPut = faker.address().streetAddress();
		} else if (input.equals("city")) {
			outPut = faker.address().city();
		} else if (input.equals("state")) {
			outPut = faker.address().state();
		} else if (input.equals("zipCode")) {
			outPut = faker.address().zipCode();
		}else if (input.equals("country")) {
			outPut = "United States";
		}else if(input.equals("apt")) {
			outPut = faker.address().secondaryAddress();
		}

		return outPut;
	}

}
