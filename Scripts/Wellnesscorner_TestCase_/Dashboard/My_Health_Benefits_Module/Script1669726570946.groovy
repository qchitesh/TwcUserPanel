import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'login_wellness.login_demo.login_wellness'()

WebUI.comment('View All')

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/ViewAll_Aeeow'))

WebUI.comment('Verify Health benfits')

if (WebUI.verifyTextPresent('My Health Benefits', false)) {
    System.out.println('Test case Pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.comment('Click on sponoserd health cheack')

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Sponsored_Health_Cheack'))

WebUI.comment('Scroll health benefits')

WebUI.scrollToElement(findTestObject('Wellnesscorner_07/My_Health_Benefits/Scroll'), 2)

WebUI.comment('Click on Health benifits Book')

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Book'))

WebUI.comment('Scroll test include')

WebUI.scrollToElement(findTestObject('Wellnesscorner_07/My_Health_Benefits/Scroll_Test_Inculde'), 5)

WebUI.comment('Click on live function test')

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Live_Function_Test'))

WebUI.delay(3)

WebUI.comment('Click on live function test')

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Live_Function_Test'))

WebUI.delay(2)

WebUI.comment('Click on Sponosered checkup')

WebUI.scrollToElement(findTestObject('Wellnesscorner_07/My_Health_Benefits/Scroll_Truworth_Sponsred_CheckUp'), 3)

WebUI.delay(2)

WebUI.comment('Click on Book Now')

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Book_Now'))

WebUI.comment('Click on Select Patient tab')

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Select_Patient_Tab'))

WebUI.comment('Click on select patient tab next button')

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Select_Patient_Next'))

WebUI.delay(2)

not_run: WebUI.scrollToElement(findTestObject('Wellnesscorner_07/My_Health_Benefits/Selected_Lab'), 3)

WebUI.delay(2)

WebUI.comment('Click on select lab')

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/select_Lab'))

WebUI.delay(3)

WebUI.delay(2)

WebUI.comment('Click on selected lab')

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Selected_Lab'))

WebUI.comment('Click on select lab date')

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Select_Lab_Date'))

WebUI.comment('Click on Time lab')

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Time_Lab'))

WebUI.comment('Click on lab Procced')

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Lab_Procced_'))

WebUI.comment('Click on next date time')

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Next_Date_Time'))

WebUI.comment('Click on dashboard')

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/DashBoard'))

WebUI.closeBrowser()

