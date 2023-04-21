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

WebUI.scrollToElement(findTestObject('Wellnesscorner_07/Upcoming_Events/Upcoming_Event'), 2)

WebUI.click(findTestObject('Wellnesscorner_07/Upcoming_Events/Food_For-Health'))

WebUI.click(findTestObject('Wellnesscorner_07/Upcoming_Events/Maybe'))

WebUI.delay(5)

WebUI.back()

WebUI.scrollToElement(findTestObject('Wellnesscorner_07/Upcoming_Events/Upcoming_Event'), 2)

WebUI.click(findTestObject('Wellnesscorner_07/Upcoming_Events/Exercise_For_Bone'))

WebUI.click(findTestObject('Wellnesscorner_07/Upcoming_Events/Not_Going'))

WebUI.delay(5)

WebUI.back()

WebUI.scrollToElement(findTestObject('Wellnesscorner_07/Upcoming_Events/Upcoming_Event'), 2)

WebUI.click(findTestObject('Wellnesscorner_07/Upcoming_Events/Bone_Care_30'))

WebUI.click(findTestObject('Wellnesscorner_07/Upcoming_Events/Going'))

WebUI.delay(5)

WebUI.back()

WebUI.closeBrowser()

