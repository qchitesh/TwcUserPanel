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

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_File/My_Health_File_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_File/Add_Health_Record_Tab'))

WebUI.delay(2)

WebUI.setText(findTestObject('Wellnesscorner_07/My_Health_File/Enter_Name_HealthRecord_Tab'), 'test')

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Wellnesscorner_07/My_Health_File/IMG_Health_'), 'D:\\Hitesh Sanjay Chandankar\\Downloads\\MicrosoftTeams-image (4).png')

WebUI.delay(4)

WebUI.setText(findTestObject('Wellnesscorner_07/My_Health_File/Description_Tab'), 'I submitted my health report.')

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_File/Health_Record_Type_Tab'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_File/Submit_Tab'))

WebUI.back()

WebUI.closeBrowser()

