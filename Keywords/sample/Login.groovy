package sample

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Login {
	//Element declaration
	TestObject ddl_Login = findTestObject('Login/ddl_Login') // ('folder/ xpath name testObject')
	TestObject ddl_Username = findTestObject('Login/ddl_Username')
	TestObject btn_Login = findTestObject('Login/btn_Login')
	TestObject lbl_Products = findTestObject('Login/lbl_Products')
	TestObject btn_EsportsWeb = findTestObject('Login/btn_EsportsWeb')
	TestObject tab_Progame = findTestObject('MS/tab_Progame')

	//Action and Assertion
	@Keyword
	def LoginValidCredentials() {
		WebUI.verifyElementVisible(ddl_Login).TRUE
		Thread.sleep(1000)
		WebUI.click(ddl_Login) //click the username drop down list
		WebUI.click(ddl_Username) //select the username = qedrewtest
		//WebUI.verifyOptionSelectedByValue(ddl_Login, 'qedrewtest', true, 3) //verify if selected option = qedrewtest
		WebUI.click(btn_Login) //click login button
		WebUI.mouseOver(lbl_Products) //mouse over products label
		WebUI.click(btn_EsportsWeb) //click Esports Web
		WebUI.verifyElementPresent(tab_Progame, 30)
	}
}
