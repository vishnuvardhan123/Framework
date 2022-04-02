package stepdefinations;

	import  org.apache.commons.lang3.RandomStringUtils;

	public class BaseClass {


	    //Created for generating random string for Unique email
	    public static String randomestring() {
	        String generatedString1 = RandomStringUtils.randomAlphabetic(5);
	        return (generatedString1);
	    }

	}


