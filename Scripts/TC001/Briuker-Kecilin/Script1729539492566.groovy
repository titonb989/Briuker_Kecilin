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

WebUI.navigateToUrl('https://staging-briuker.kecilin.id/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Login/input_Email_email'), 'admindoangkecilin@yopmail.com')

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Object Repository/Login/input_Password_password'), 'VchOD2GI8QfmzlDpXXLKjA==')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Login/input_Forgot Password_remember'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Login/button_Log in'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Dashboard/CardTotalCCTV'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Dashboard/DropdownRegional'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_Dashboard/SearchRegional'), 'Jakarta 1')

WebUI.sendKeys(findTestObject('Page_Dashboard/SearchRegional'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Dashboard/SideBar_DashBoard'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Dashboard/Select_SideNav'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Dashboard/DropdownSummayAI'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Page_Dashboard/DropdownSummayAI'), 'queue', false)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Dashboard/Button_FindResults'))

WebUI.scrollToElement(findTestObject('Page_Dashboard/Diagram'), 2)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_Dashboard/Btn_Logout'), 5)

WebUI.click(findTestObject('Page_Dashboard/Btn_Logout'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.closeBrowser()

