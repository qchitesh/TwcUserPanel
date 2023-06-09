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

WebUI.openBrowser('')

WebUI.comment('Maximize window')

WebUI.maximizeWindow()

WebUI.comment('Open wellness corner app')

WebUI.navigateToUrl('thewellnesscorner.com')

WebUI.comment('Click on cross popup')

WebUI.click(findTestObject('Wellnesscorner_07/Login_/Cross_popup'))

WebUI.comment('Click on get started')

WebUI.click(findTestObject('Wellnesscorner_07/Login_/a_GET STARTED'))

WebUI.comment('Enter Email ID')

WebUI.setText(findTestObject('Wellnesscorner_07/Login_/input_Enter email'), GlobalVariable.Add_User)

WebUI.comment('Click on continue button')

WebUI.click(findTestObject('Wellnesscorner_07/Login_/button_Continue'))

WebUI.comment('Click on forgot password')

WebUI.click(findTestObject('Wellnesscorner_07/Login_/Forget_Password'))

WebUI.comment('Phone OTP')

WebUI.click(findTestObject('Wellnesscorner_07/Login_/Phone_OTP'))

WebUI.comment('Verify Login with Mobile')

if (WebUI.verifyTextPresent('Login with Mobile', false)) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.comment('Enter Phone Number')

WebUI.setText(findTestObject('Object Repository/Wellnesscorner_07/Login_/Phone_Number_Tab'), '9766338207')

WebUI.comment('Click on Continue button')

WebUI.click(findTestObject('Wellnesscorner_07/Login_/Continue_Button'))

WebUI.comment('Verify sign in Mobaile')

if (WebUI.verifyTextPresent('Sign-In with Mobaile', false)) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.comment('Back to OTP tab')

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Login_/Back_For_OTP_Tab'))

WebUI.comment('Cancel OTP')

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Login_/Cancel_Tab_OTP_Tab'))

WebUI.comment('Close Browser')

WebUI.closeBrowser()

