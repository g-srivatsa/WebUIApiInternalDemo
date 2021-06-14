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

WebUI.callTestCase(findTestCase('Web Test Cases/CURA Healthcare Service/Appointment/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Web Test Cases/CURA Healthcare Service/Appointment/Click on Login Link'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Web Test Cases/CURA Healthcare Service/Appointment/Login Application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Web Object Repository/CURA Healthcare Service/Appointment Page/facility'), Facility, 
    false)

WebUI.click(findTestObject('Web Object Repository/CURA Healthcare Service/Appointment Page/Apply for hospital readmission_hospital_readmission'))

WebUI.sendKeys(findTestObject('Web Object Repository/CURA Healthcare Service/Appointment Page/Visit Date (Required)'), VisitDate)

WebUI.sendKeys(findTestObject('Web Object Repository/CURA Healthcare Service/Appointment Page/Comment_comment'), Comment)

WebUI.click(findTestObject('Web Object Repository/CURA Healthcare Service/Appointment Page/Book Appointment'))

WebUI.verifyElementVisible(findTestObject('Web Object Repository/CURA Healthcare Service/Confirmation Page/Appointment Confirmation'))

WebUI.callTestCase(findTestCase('Web Test Cases/CURA Healthcare Service/Appointment/LogOut Application'), [:], FailureHandling.STOP_ON_FAILURE)

