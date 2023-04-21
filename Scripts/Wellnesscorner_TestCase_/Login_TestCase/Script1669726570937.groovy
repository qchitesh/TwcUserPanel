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
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.App_URL)

WebUI.click(findTestObject('Wellnesscorner_07/Login_/Cross_popup'))

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Login_/a_GET STARTED'))

WebUI.setText(findTestObject('Object Repository/Wellnesscorner_07/Login_/input_Enter email'), GlobalVariable.Add_User)

if (GlobalVariable.Add_User == 'hitesh.chandankar@truworth.com') {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case failed')

    assert false
}

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Login_/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Wellnesscorner_07/Login_/input_Welcome_Password'), GlobalVariable.Add_Password)

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Login_/button_Continue'))

WebUI.click(findTestObject('Wellnesscorner_07/Login_/Location'))

WebUI.click(findTestObject('Wellnesscorner_07/Login_/Location_Surat'))

WebUI.click(findTestObject('Wellnesscorner_07/Health_Checks/Health_Cheack_Tab'))

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

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/Health_Checks/Select_DateTime_/Select Sat_03_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/Health_Checks/Select_DateTime_/Before_10_AM_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/Health_Checks/Select_DateTime_/Save_Tab_For_Save_Date_Time_Tab'))

WebUI.delay(2)

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.back()

WebUI.back()

WebUI.back()

WebUI.delay(2)

if (WebUI.verifyElementClickable(findTestObject('Wellnesscorner_07/Medical__Pharmacy/Medical_Pharmacy_Tab'))) {
    System.out.println('Test case Pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Emotional_Therapy/Emotional_Therapy_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Emotional_Therapy/Book_Now_Arrow_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Emotional_Therapy/Check_Symbol_2nd_Session_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Emotional_Therapy/Book_Therapy_appoinment_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Emotional_Therapy/Tue,06_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Emotional_Therapy/3PM_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Emotional_Therapy/Proceed_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Wellnesscorner_07/Emotional_Therapy/Proceed_to_Payment_Tab'))

WebUI.delay(2)

WebUI.back()

WebUI.back()

WebUI.back()

WebUI.back()

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

    assert false
}

WebUI.delay(5)

WebUI.switchToWindowIndex(0)

WebUI.back()

WebUI.back()

WebUI.click(findTestObject('Wellnesscorner_07/Ask_A_Doctor/Ask_Doc tor_Tab'))

WebUI.click(findTestObject('Wellnesscorner_07/Ask_A_Doctor/Slide_Arrow_Tab'))

WebUI.back()

WebUI.click(findTestObject('Wellnesscorner_07/Wellness_Plans/Wellness_Plans_Tab'))

WebUI.back()

WebUI.click(findTestObject('Wellnesscorner_07/Guided_Wellness_Programs/Guided_Wellness_Program_Tab'))

WebUI.back()

WebUI.click(findTestObject('Wellnesscorner_07/Gym_Fitness/Gym_Fitness_Tab'))

WebUI.back()

WebUI.click(findTestObject('Wellnesscorner_07/Refer_Earn/Refer_Earn_Tab'))

WebUI.back()

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

WebUI.delay(5)

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/ViewAll_Aeeow'))

if (WebUI.verifyTextPresent('My Health Benefits', false)) {
    System.out.println('Test case Pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Sponsored_Health_Cheack'))

WebUI.scrollToElement(findTestObject('Wellnesscorner_07/My_Health_Benefits/Scroll'), 2)

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Book'))

WebUI.scrollToElement(findTestObject('Wellnesscorner_07/My_Health_Benefits/Scroll_Test_Inculde'), 5)

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Live_Function_Test'))

WebUI.delay(3)

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Live_Function_Test'))

WebUI.scrollToElement(findTestObject('Wellnesscorner_07/My_Health_Benefits/Scroll_Truworth_Sponsred_CheckUp'), 5)

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Book_Now'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Select_Patient_Tab'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Select_Patient_Next'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Select_Address1'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Select _Address'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Proceed_Address'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Select_Address_Next'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Select_Time_Slot'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Date_3'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Bet_1_5'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Proceed'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/Next_Date_Time'))

WebUI.click(findTestObject('Wellnesscorner_07/My_Health_Benefits/DashBoard'))

WebUI.closeBrowser()

