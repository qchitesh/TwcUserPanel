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

WebUI.comment('Click on HRA ')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Tab'))

WebUI.comment('Verify Health Goal name')

if (WebUI.verifyTextPresent('Choose Your Health Goal', false)) {
    System.out.println('Test case Pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.comment('Click on Health Discorder Tab')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/Manage_My_Health_Disorders_Tab'))

WebUI.comment('Click HRA Assignment ')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/Being_Assignment_Tab'))

//WebUI.dragAndDropToObject(findTestObject('testtest/Page_Health Risk Assessment - The Wellness Corner/div_concat(5, , 0, ,  Feet)'), 
//    findTestObject('testtest/Page_Health Risk Assessment - The Wellness Corner/div_concat(6, , 1, ,  Feet)'))
WebUI.delay(5)

WebUI.comment('Click on Health risk assignment')

WebUI.click(findTestObject('Object Repository/testtest/Page_Health Risk Assessment - The Wellness Corner/test3'))

WebUI.delay(30)

WebUI.comment('Next button')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/Next_Button_Tab'))

WebUI.comment('HRA Question 1')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/1'))

WebUI.comment('HRA Question 2')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/2'))

WebUI.comment('Click on HRA Next ')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('HRA Question 3')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/3'))

WebUI.comment('Click on HRA Next')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_2'))

WebUI.comment('Click on HRA Yes')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/yes'))

WebUI.comment('Click on HRA question next')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_3'))

WebUI.comment('Click on HRA question 5')

WebUI.scrollToElement(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/5'), 5)

WebUI.comment('Click on HRA question ')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/5'))

WebUI.comment('Click on HRA question next')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 6')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/6'))

WebUI.comment('Click on HRA question')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 7')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/7'))

WebUI.comment('Click on HRA question Next')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 8')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/8'))

WebUI.comment('Click on HRA question Next')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 9')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/9'))

WebUI.comment('Click on HRA question next ')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 10 ')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/10'))

WebUI.comment('Click on HRA question next')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA questio 11')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/11'))

WebUI.comment('Click on HRA question next ')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 12')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/12'))

WebUI.comment('Click on HRA question next')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 13')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/13'))

WebUI.comment('Click on HRA question next')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 14')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/14'))

WebUI.comment('Click on HRA question next')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 15 ')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/15'))

WebUI.comment('Click on HRA question next ')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 16')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/16'))

WebUI.comment('Click on HRA question next')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 17')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/17'))

WebUI.comment('Click on HRA question next')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 18')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/18'))

WebUI.comment('Click on HRA question next ')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 19 ')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/19'))

WebUI.comment('Click on HRA question next')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 20')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/20'))

WebUI.comment('Click on HRA question next')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 21')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/21'))

WebUI.comment('Click on HRA question next ')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 22 ')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/22'))

WebUI.comment('Click on HRA question next')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 23 ')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/23'))

WebUI.comment('Click on HRA question next ')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 24 ')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/24'))

WebUI.comment('Click on HRA question next ')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 25')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/25'))

WebUI.comment('Click on HRA question next ')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 26')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/26'))

WebUI.comment('Click on HRA question next ')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 27')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/27'))

WebUI.comment('Click on HRA question next')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 28')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/28'))

WebUI.comment('Click on HRA next')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Next_1'))

WebUI.comment('Click on HRA question 29')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/29'))

WebUI.comment('Click on HRA submit')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Questions/Submit'))

WebUI.delay(15)

WebUI.comment('Verify Health report')

if (WebUI.verifyTextPresent('Health Risk Report', false)) {
    System.out.println('Test Case Pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Report/Risk_Assessment'))

WebUI.comment('HRA report cross')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Report/Cross_Arrow'))

WebUI.comment('Scroll to HRA report')

WebUI.scrollToElement(findTestObject('Wellnesscorner_07/HRA/HRA_Report/Scroll_Object'), 10)

WebUI.comment('Click on HRA immunity score')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Report/immunity_Score'))

WebUI.comment('Click on HRA report cross')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Report/cross_arrow_immunity'))

WebUI.comment('Scroll to HRA report')

WebUI.scrollToElement(findTestObject('Wellnesscorner_07/HRA/HRA_Report/Scroll_Object_LifeStyle'), 5)

WebUI.comment('Click on HRA life style score')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Report/Life_Style_Scroe'))

WebUI.comment('Click on HRA report cross')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Report/Cross_Life_Style'))

WebUI.delay(5)

WebUI.comment('Click on HRA set target')

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Report/Set_Target_Improve'))

WebUI.comment('Click on HRA back ')

WebUI.back()

WebUI.click(findTestObject('Wellnesscorner_07/HRA/HRA_Report/Home'))

WebUI.comment('Close tab')

WebUI.closeBrowser()

