package tests.enreachTests;

import org.testng.Assert;
import org.testng.SuiteRunner;
import org.testng.annotations.Test;
import pages.FilterPage;
import tests.TestBase;
import utilities.ConfigurationReader;

public class FilterByName extends TestBase {

    @Test
    public  void filterByName(){
        FilterPage filter = new FilterPage();

        String expectedComputerName = ConfigurationReader.get("computerName");
        String expectedIntroducedDate = ConfigurationReader.get("introducedDate");
        String expectedDiscontinuedDate = ConfigurationReader.get("discontinuedDate");
        String expectedCompany = ConfigurationReader.get("companyName");

        filter.searchbox.sendKeys(expectedComputerName);
        filter.filterByName.click();

        // verifies the the computer names
       String actualfilteredComputer = filter.filteredComputerName.getText();
        Assert.assertEquals(actualfilteredComputer,expectedComputerName);

        //verifies the Introduced dates
        String  actualIntroducedDate = filter.dateConverter(filter.filteredIndroducedDate.getText());
        Assert.assertEquals(actualIntroducedDate,expectedIntroducedDate);

        //verifies the Discomtinued dates
        String actualDiscontinuedDate = filter.dateConverter(filter.filteredDiscontinueDate.getText());
        Assert.assertEquals(actualDiscontinuedDate,expectedDiscontinuedDate);

        //verifies the Company Names
        String actualCompany = filter.filteredCompany.getText();
        Assert.assertEquals(actualCompany,expectedCompany);





    }

}
