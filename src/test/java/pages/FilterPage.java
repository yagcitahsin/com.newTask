package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterPage extends  AddNewComputerPage {

    @FindBy(id ="searchbox")
    public WebElement searchbox;

    @FindBy(id="searchsubmit")
    public  WebElement filterByName;

    @FindBy(xpath = "(//table//td[1]/a)[1]")
    public  WebElement filteredComputerName;

    @FindBy(xpath = "(//table//tr)[2]/td[2]")
    public  WebElement filteredIndroducedDate;

    @FindBy(xpath = "(//table//tr)[2]/td[3]")
    public  WebElement filteredDiscontinueDate;

    @FindBy(xpath = "(//table//tr)[2]/td[4]")
    public  WebElement filteredCompany;



    public  String dateConverter (String date) {
        String convertedDate;

       String[] array = date.split(" ");

        String year = array[2];
        String day = array[0];
        String month="null";

        if (array[1].equals("Jan")) {
            month = "01";
        } else if (array[1].equals("Feb")) {
            month = "02";
        } else if (array[1].equals("Mar")) {
            month = "03";
        } else if (array[1].equals("Apr")) {
            month = "04";
        } else if (array[1].equals("May")) {
            month = "05";
        } else if (array[1].equals("Jun")) {
            month = "06";
        } else if (array[1].equals("Jul")) {
            month = "07";
        } else if (array[1].equals("Aug")) {
            month = "08";
        } else if (array[1].equals("Sep")) {
            month = "09";
        } else if (array[1].equals("Oct")) {
            month = "10";
        } else if (array[1].equals("Nov")) {
            month = "11";
        } else if (array[1].equals("Dec")) {
            month = "12";
        }
        convertedDate= year+"-"+month+"-"+day;
        return convertedDate;
    }
}



