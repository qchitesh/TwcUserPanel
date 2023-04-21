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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Add_Url)

WebUI.click(findTestObject('Wellnesscorner_07/Login_/Cross_popup'))

WebUI.click(findTestObject('Wellnesscorner_07/Login_/a_GET STARTED'))

WebUI.setText(findTestObject('Wellnesscorner_07/Login_/input_Enter email'), 'hitesh@mailinator.com')

WebUI.click(findTestObject('Wellnesscorner_07/Login_/button_Continue'))

WebUI.setText(findTestObject('Wellnesscorner_07/Registration_Tab/Personal_Details_FirstName'), 'Hitesh')

WebUI.setText(findTestObject('Wellnesscorner_07/Registration_Tab/Personal_Details_LastName'), 'Chandankar')

WebUI.click(findTestObject('Wellnesscorner_07/Registration_Tab/Male_Tab'))

WebUI.click(findTestObject('Wellnesscorner_07/Registration_Tab/Date_Tab'))

WebUI.setText(findTestObject('Wellnesscorner_07/Registration_Tab/Date_Tab'), '19/03/1997')

WebUI.click(findTestObject('Wellnesscorner_07/Registration_Tab/19Date'))

WebUI.click(findTestObject('Wellnesscorner_07/Login_/Referal_Tab1'))

WebUI.click(findTestObject('Wellnesscorner_07/Registration_Tab/Registar_Tab'))

