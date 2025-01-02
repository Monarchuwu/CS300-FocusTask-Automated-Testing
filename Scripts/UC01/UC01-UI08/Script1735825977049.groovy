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

WebUI.setText(findTestObject('Object Repository/Page_Log In - FocusTask/input_Email_email'), 'test@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log In - FocusTask/input_Password_password'), 'r98I3Krbh9FyLvOoVhuYpw==')

WebUI.click(findTestObject('Object Repository/Page_Log In - FocusTask/button_Log In'))

WebUI.setText(findTestObject('Object Repository/Page_Inbox - FocusTask/input_Projects_r2'), 'Testing Task')

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/path'))

WebUI.setText(findTestObject('Object Repository/Page_Inbox - FocusTask/input_Task Due Date_r10'), '01/04/2025 11:53 PM')

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/input_Task Due Date_r10'))

WebUI.setText(findTestObject('Object Repository/Page_Inbox - FocusTask/input_Task Due Date_r10'), '01/04/2025 11:59 PM')

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/button_CONFIRM'))

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/svg'))

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/p_High'))

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/span_Testing Task'))

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/input_Completed_MuiInputBase-input MuiInput_66c611'))

WebUI.setText(findTestObject('Object Repository/Page_Inbox - FocusTask/input_Completed_MuiInputBase-input MuiInput_66c611_1'), 
    'E Task')

WebUI.setText(findTestObject('Object Repository/Page_Inbox - FocusTask/input_Completed_MuiInputBase-input MuiInput_66c611_1_2'), 
    'Ed Task')

WebUI.setText(findTestObject('Object Repository/Page_Inbox - FocusTask/input_Completed_MuiInputBase-input MuiInput_66c611_1_2_3'), 
    'Edi Task')

WebUI.setText(findTestObject('Object Repository/Page_Inbox - FocusTask/input_Completed_MuiInputBase-input MuiInput_66c611_1_2_3_4'), 
    'Edii Task')

WebUI.setText(findTestObject('Object Repository/Page_Inbox - FocusTask/input_Completed_MuiInputBase-input MuiInput_66c611_1_2_3'), 
    'Edi Task')

WebUI.setText(findTestObject('Object Repository/Page_Inbox - FocusTask/input_Completed_MuiInputBase-input MuiInput_66c611_1_2_3_4_5'), 
    'Edit Task')

WebUI.setText(findTestObject('Object Repository/Page_Inbox - FocusTask/input_Completed_MuiInputBase-input MuiInput_66c611_1_2_3_4_5_6'), 
    'Editt Task')

WebUI.setText(findTestObject('Object Repository/Page_Inbox - FocusTask/input_Completed_MuiInputBase-input MuiInput_66c611_1_2_3_4_5_6_7'), 
    'Editte Task')

WebUI.setText(findTestObject('Object Repository/Page_Inbox - FocusTask/input_Completed_MuiInputBase-input MuiInput_66c611_1_2_3_4_5_6_7_8'), 
    'Editted Task')

WebUI.sendKeys(findTestObject('Object Repository/Page_Inbox - FocusTask/input_Completed_MuiInputBase-input MuiInput_66c611_1_2_3_4_5_6_7_8'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Inbox - FocusTask/div_High2359, 04-01-25PomodoroToday'))

WebUI.closeBrowser()

