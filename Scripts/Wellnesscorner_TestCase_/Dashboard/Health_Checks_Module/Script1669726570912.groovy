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

WebUI.click(findTestObject('Wellnesscorner_07/Health_Checks/Health_Cheack_Tab'))

WebUI.scrollToElement(findTestObject('Wellnesscorner_07/Health_Checks/Compelete_Care_Scroll_'), 3)

WebUI.click(findTestObject('Select_Pakage_OR/Page_Health Checks, Expert Tips  Advice, On_77cacb/Complete Care Premium Health Check Pack_'))

WebUI.click(findTestObject('Select_Pakage_OR/Page_Complete Care Premium Health Check Pac_5abd96/a_Book Now'))

WebUI.click(findTestObject('Wellnesscorner_07/Health_Checks/Select_Address/select_Address_Details/Add_Number_Tab'))

WebUI.click(findTestObject('Wellnesscorner_07/Health_Checks/Add_NewAddress_Tab'))

WebUI.setText(findTestObject('Wellnesscorner_07/Health_Checks/Select_Address/select_Address_Details/Enter_Name_Tab'), 'Hitesh Chandankar')

WebUI.delay(2)

WebUI.setText(findTestObject('Wellnesscorner_07/Health_Checks/Select_New_Patient/Enter_PhoneNumber_Tab'), '9766338207')

WebUI.delay(2)

WebUI.setText(findTestObject('Wellnesscorner_07/Health_Checks/Select_Address/select_Address_Details/Enter-Adress_Tab'), 
    'jaipur')

WebUI.delay(2)

WebUI.setText(findTestObject('Wellnesscorner_07/Health_Checks/Select_Address/select_Address_Details/Enter_Pincode_Tab'), 
    '302001')

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/Health_Checks/Select_Address/select_Address_Details/Enter_Home_Tab'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/Health_Checks/Select_Address/select_Address_Details/Submit_Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/Health_Checks/Select_Address/select_Address_Details/Next_Button_Tab'))

WebUI.click(findTestObject('Wellnesscorner_07/Health_Checks/Select_New_Patient/Add_New_Patient_Tab'))

WebUI.setText(findTestObject('Wellnesscorner_07/Health_Checks/Select_New_Patient/Enter_Patient_Name_Tab'), 'Pavan')

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/Health_Checks/Select_New_Patient/Gender_Male_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/Health_Checks/Select_New_Patient/Relation_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/Health_Checks/Select_New_Patient/Relation_Tab_Other'))

WebUI.delay(2)

WebUI.setText(findTestObject('Wellnesscorner_07/Health_Checks/Select_New_Patient/Enter_Age_Tab'), '25')

WebUI.delay(2)

WebUI.setText(findTestObject('Wellnesscorner_07/Health_Checks/Select_New_Patient/Enter_Email_ID_Tab'), 'hitesh.chandankar@truworth.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Wellnesscorner_07/Health_Checks/Enter_Phone_Number_Tab'), '9766338207')

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/Health_Checks/Select_New_Patient/Save_Button_ForNewPatient_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/Health_Checks/Select_New_Patient/Next_Button_Tab_For_Date_Time'))

WebUI.delay(5)

WebUI.click(findTestObject('Wellnesscorner_07/Health_Checks/Select_DateTime_/Select Sat_03_Tab'))

WebUI.scrollToElement(findTestObject('Wellnesscorner_07/Health_Checks/Select_DateTime_/Scroll_BY'), 3)

WebUI.delay(3)

WebUI.click(findTestObject('Wellnesscorner_07/Health_Checks/Select_DateTime_/Before_10_AM_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/Health_Checks/Select_DateTime_/Save_Tab_For_Save_Date_Time_Tab'))

WebUI.delay(2)

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/DashBoard'))

WebUI.delay(2)

if (WebUI.verifyElementClickable(findTestObject('Wellnesscorner_07/Medical__Pharmacy/Medical_Pharmacy_Tab'))) {
    System.out.println('Test case Pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.delay(2)

WebUI.closeBrowser()

