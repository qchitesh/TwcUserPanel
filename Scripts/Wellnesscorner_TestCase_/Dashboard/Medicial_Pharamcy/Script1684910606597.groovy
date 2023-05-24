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

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/Medical__Pharmacy/Medical_Pharmacy_Tab'))

WebUI.click(findTestObject('Wellnesscorner_07/Medical__Pharmacy/Detect_Location'))

WebUI.delay(2)

WebUI.setText(findTestObject('Wellnesscorner_07/Medical__Pharmacy/OTP'), '882560', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Wellnesscorner_07/Medical__Pharmacy/Ayurveda'))

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/Medical__Pharmacy/Filter_Relevance'))

WebUI.click(findTestObject('Wellnesscorner_07/Medical__Pharmacy/Low_High'))

if (WebUI.verifyElementPresent(findTestObject('Wellnesscorner_07/Medical__Pharmacy/filter_Apply-verify'), 2)) {
    System.out.println('Filter Applied')
} else {
    System.out.println('Filter not selected')

    assert false : 'Filter not seletced'
}

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/Medical__Pharmacy/Chavanparsh_Filter'))

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/Medical__Pharmacy/Select_Chavanparsh'))

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Wellnesscorner_07/Medical__Pharmacy/Add to cart'))

if (WebUI.verifyElementPresent(findTestObject('Wellnesscorner_07/Medical__Pharmacy/Product_add_Cart'), 2)) {
    System.out.println('Product added to cart')
} else {
    System.out.println('Test case fail')

    assert false : 'Product not added in cart'
}

WebUI.delay(2)

WebUI.click(findTestObject('Wellnesscorner_07/Medical__Pharmacy/My_Cart'))

WebUI.click(findTestObject('Wellnesscorner_07/Medical__Pharmacy/Checkout'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Wellnesscorner_07/Medical__Pharmacy/Select_Address'))

WebUI.click(findTestObject('Wellnesscorner_07/Medical__Pharmacy/Next_'))

WebUI.click(findTestObject('Wellnesscorner_07/Medical__Pharmacy/Checkout_payment'))

//WebUI.switchToWindowIndex(1)
//
//if (WebUI.verifyElementPresent(findTestObject('Wellnesscorner_07/Medical__Pharmacy/Proceed'), 2)) {
//    System.out.println('Test case pass')
//} else {
//    System.out.println('Test case fail')
//
//    assert false : 'Payment option not shown'
//}

WebUI.closeBrowser()

