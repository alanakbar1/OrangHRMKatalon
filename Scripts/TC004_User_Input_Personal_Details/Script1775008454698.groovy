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


WebUI.callTestCase(findTestCase('Test Cases/TC001_User_Login_Sukses'), null)

WebUI.click(findTestObject('Object Repository/Page My Info/span_My Info'))

WebUI.setText(findTestObject('Object Repository/Page My Info/input_Employee Full Name_firstName'), 'Alfariz')

WebUI.setText(findTestObject('Object Repository/Page My Info/input_Employee Full Name_middleName'), 'akbar')

WebUI.setText(findTestObject('Object Repository/Page My Info/input_Employee Full Name_lastName'), 'farezi')

WebUI.setText(findTestObject('Object Repository/Page My Info/input_Employee Id_oxd-input oxd-input--active'), '02123')

WebUI.setText(findTestObject('Object Repository/Page My Info/input_Other Id_oxd-input oxd-input--active'), '1234')

WebUI.setText(findTestObject('Object Repository/Page My Info/input_concat(Driver, , s License Number)_oxd-input oxd-input--active'), '123')

WebUI.click(findTestObject('Object Repository/Page My Info/i_License Expiry Date_oxd-icon bi-calendar _fa83c8'))

WebUI.click(findTestObject('Object Repository/Page My Info/div_5'))

WebUI.click(findTestObject('Object Repository/Page My Info/i_Indian_oxd-icon bi-caret-down-fill oxd-se_4c56f2'))

WebUI.click(findTestObject('Object Repository/Page My Info/span_Indonesian'))

WebUI.click(findTestObject('Object Repository/Page My Info/i_Single_oxd-icon bi-caret-up-fill oxd-sele_2239c5'))

WebUI.click(findTestObject('Object Repository/Page My Info/div_Single'))

WebUI.click(findTestObject('Object Repository/Page My Info/i_Date of Birth_oxd-icon bi-calendar oxd-da_a2e97b'))

WebUI.click(findTestObject('Object Repository/Page My Info/div_24'))

WebUI.click(findTestObject('Object Repository/Page My Info/span_Female_oxd-radio-input oxd-radio-input_59a84c'))

WebUI.click(findTestObject('Object Repository/Page My Info/button_Save'))

WebUI.closeBrowser()