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

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Tab'))

if (WebUI.verifyTextPresent('Choose Your Health Goal', false)) {
    System.out.println('Test case Pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.click(findTestObject('Wellnesscorner_07/HRA/Manage_My_Health_Disorders_Tab'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/Being_Assignment_Tab'))

WebUI.delay(5)

WebUI.dragAndDropToObject(findTestObject('testtest/Page_Health Risk Assessment - The Wellness Corner/div_concat(5, , 0, ,  Feet)'), 
    findTestObject('testtest/Page_Health Risk Assessment - The Wellness Corner/div_concat(6, , 1, ,  Feet)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/testtest/Page_Health Risk Assessment - The Wellness Corner/test3'))

WebUI.delay(5)

WebUI.click(findTestObject('Wellnesscorner_07/HRA/Next_Button_Tab'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/2'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/3'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_2'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/yes'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_3'))

WebUI.scrollToElement(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/5'), 5)

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/5'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/6'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/7'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/8'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/9'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/10'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/11'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/12'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/13'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/14'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/15'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/16'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/17'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/18'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/19'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/20'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/21'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/22'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/23'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/24'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/25'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/26'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/27'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/28'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/29'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Submit'))

WebUI.delay(15)

if (WebUI.verifyTextPresent('Health Risk Report', false)) {
    System.out.println('Test Case Pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Report/Risk_Assessment'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Report/Cross_Arrow'))

WebUI.scrollToElement(findTestObject('Wellnesscorner_07/HRA/HRA_Report/Scroll_Object'), 10)

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Report/immunity_Score'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Report/cross_arrow_immunity'))

WebUI.scrollToElement(findTestObject('Wellnesscorner_07/HRA/HRA_Report/Scroll_Object_LifeStyle'), 5)

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Report/Life_Style_Scroe'))

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Report/Cross_Life_Style'))

WebUI.delay(5)

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Report/Set_Target_Improve'))

WebUI.back()

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Report/Home'))

WebUI.closeBrowser()

