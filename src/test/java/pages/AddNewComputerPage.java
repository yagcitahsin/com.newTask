package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddNewComputerPage {

    public  AddNewComputerPage (){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id ="add")
    public WebElement add;

   @FindBy(id ="name")
    public WebElement computerName;

   @FindBy(id ="introduced")
   public WebElement introducedDate;

   @FindBy(id="discontinued")
   public  WebElement discontinuedDate;

   @FindBy(id="company")
    public  WebElement company;

   @FindBy(xpath = "//input[@type='submit']")
   public WebElement  createComputer;





}
