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

//CustomKeywords.'login.test.userLogin'()
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('thewellnesscorner.com')

WebUI.click(findTestObject('Wellnesscorner_07/Login_/Cross_popup'))

WebUI.click(findTestObject('Pracatice_Purpose/Titles_/Covid19'))

if (WebUI.verifyTextPresent('COVID-19', false)) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.back()

WebUI.click(findTestObject('Pracatice_Purpose/Titles_/Health_'))

if (WebUI.verifyTextPresent('HEALTH', false)) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.back()

WebUI.click(findTestObject('Pracatice_Purpose/Titles_/Nutrition_'))

if (WebUI.verifyTextPresent('NUTRITION', false)) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.back()

WebUI.click(findTestObject('Pracatice_Purpose/Titles_/Fitness_'))

if (WebUI.verifyTextPresent('FITNESS', false)) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.back()

WebUI.click(findTestObject('Pracatice_Purpose/Titles_/Mindfullness'))

if (WebUI.verifyTextPresent('MINDFULNESS', false)) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.back()

WebUI.click(findTestObject('Pracatice_Purpose/Titles_/Beauty_'))

if (WebUI.verifyTextPresent('BEAUTY', false)) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.back()

WebUI.click(findTestObject('Pracatice_Purpose/Titles_/LifeStyle_'))

if (WebUI.verifyTextPresent('LIFESTYLE', false)) {
	System.out.println('Test case pass')
} else {
	System.out.println('Test case fail')

	assert false
}

WebUI.back()

WebUI.closeBrowser()


