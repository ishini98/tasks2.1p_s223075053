package sit707_week2;

public class Main 
{
    public static void main( String[] args )
    {
        String officeworksUrl = "https://www.officeworks.com.au/app/identity/create-account"; 
        String linkedinUrl = "https://www.linkedin.com/signup";
        
        SeleniumOperations.officeworks_registration_page(officeworksUrl);
        SeleniumOperations.linkedin_registration_page(linkedinUrl);
    }
}
