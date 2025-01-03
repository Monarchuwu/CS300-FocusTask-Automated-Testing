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

WebUI.navigateToUrl('https://cs300-focustask.vercel.app/register')

WebUI.setText(findTestObject('Object Repository/Page_Sign Up - FocusTask/input_Username_username'), 'validUser')

WebUI.setText(findTestObject('Object Repository/Page_Sign Up - FocusTask/input_Email_email'), 'test7@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign Up - FocusTask/input_Password_password'), 'r98I3Krbh9FyLvOoVhuYpw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign Up - FocusTask/input_Confirm Password_confirmPassword'), 
    'r98I3Krbh9FyLvOoVhuYpw==')

WebUI.click(findTestObject('Object Repository/Page_Sign Up - FocusTask/button_Create Account'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Inbox - FocusTask/p_validUser'))

WebUI.closeBrowser()

