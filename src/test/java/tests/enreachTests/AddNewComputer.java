package tests.enreachTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddNewComputerPage;
import tests.TestBase;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AddNewComputer extends TestBase {

    @Test

    // Add a new computer and veify that it is done.
    public void addComputer (){
        AddNewComputerPage addNewComputerPage = new AddNewComputerPage();

        addNewComputerPage.add.click();
        addNewComputerPage.computerName.sendKeys(ConfigurationReader.get("computerName"));
        addNewComputerPage.introducedDate.sendKeys(ConfigurationReader.get("introducedDate"));
        addNewComputerPage.discontinuedDate.sendKeys(ConfigurationReader.get("discontinuedDate"));
        Select slc = new Select(addNewComputerPage.company);
        slc.selectByVisibleText(ConfigurationReader.get("companyName"));
        addNewComputerPage.createComputer.submit();
        String alert =driver.findElement(By.xpath("(//div)[1]")).getText();
        Assert.assertTrue(alert.contains("Done"),"verfiy that new computer was created ");



    }





}
