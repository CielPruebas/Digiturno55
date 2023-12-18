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

WebUI.callTestCase(findTestCase('DIGITURNO/BASICO/5 Usuarios'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/4Usuarios/0Principal/img_1Perfiles'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('DIGITURNO/CONFIGURACION/4Usuarios/1Perfiles/Edicion/input_Nombre'), 0)

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/4Usuarios/1Perfiles/Edicion/input_Nombre'), 'prueba')

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/4Usuarios/1Perfiles/Edicion/textarea_Descripcion'), 'prueba')

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/4Usuarios/1Perfiles/Edicion/input_Prioridad'), '3')

WebUI.delay(0)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/4Usuarios/1Perfiles/Edicion/img_Nuevo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

