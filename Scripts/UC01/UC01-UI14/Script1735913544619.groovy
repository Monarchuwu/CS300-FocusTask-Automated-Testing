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

WebUI.navigateToUrl('https://cs300-focustask.vercel.app/signin')

WebUI.setText(findTestObject('Object Repository/Page_Log In - FocusTask/input_Email_email (2)'), 'test@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log In - FocusTask/input_Password_password (2)'), 'r98I3Krbh9FyLvOoVhuYpw==')

WebUI.click(findTestObject('Object Repository/Page_Log In - FocusTask/button_Log In (2)'))

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/span_Inbox'))

WebUI.setText(findTestObject('Object Repository/Page_Inbox - FocusTask/input_Projects_r2 (1)'), 'Testing Task')

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/svg (1)'))

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/svg_Task Due Date_MuiSvgIcon-root MuiSvgIco_d4d3d0'))

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/button_4'))

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/li_11'))

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/li_55'))

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/input_Task Due Date_rk'))

WebUI.setText(findTestObject('Object Repository/Page_Inbox - FocusTask/input_Task Due Date_rk'), '01/04/2025 11:59 PM')

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/button_CONFIRM (1)'))

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/svg_1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/p_High (1)'))

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/button_Add (1)'))

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/div_Testing TaskHigh2359, 04-01-25 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/button_Today'))

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/span_Today'))

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/div_Testing TaskHigh2359, 04-01-25_1'))

WebUI.closeBrowser()

