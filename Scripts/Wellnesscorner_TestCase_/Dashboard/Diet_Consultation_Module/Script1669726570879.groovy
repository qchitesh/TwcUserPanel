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

WebUI.click(findTestObject('Wellnesscorner_07/Diet_Consulatation_Tab/Diet_Consultation_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/Diet_Consulatation_Tab/Start_NowArrow_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/Diet_Consulatation_Tab/Select_Plan_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/Diet_Consulatation_Tab/Click_On_IShita_Profile_Tab'))

WebUI.switchToWindowIndex(1)

def test1 = 'Ishita Sharma'

WebUI.delay(5)

def test2 = WebUI.getText(findTestObject('Page_Ishita Sharma - The Wellness Corner/h1_Ishita Sharma'))

WebUI.comment(test2)

if (test1 == test2) {
    System.out.println('Testcase pass')
} else {
    System.out.println('Test case fail')

    assert false : 'test'
}

WebUI.delay(5)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/DashBoard'))

WebUI.closeBrowser()

