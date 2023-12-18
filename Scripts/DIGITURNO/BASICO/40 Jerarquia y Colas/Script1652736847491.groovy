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

WebUI.callTestCase(findTestCase('DIGITURNO/BASICO/39 Modelo de atencion'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/1Modelo de Atencion/0Principal/img_1Jerarquia y colas'))

WebUI.delay(3)

'Niveles'
WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/1Modelo de Atencion/1Jerarquia y Colas/2Configuracion/1Nodos y elementos/1Niveles/option_1Area'))

WebUI.delay(3)

'Elementos'
WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/1Modelo de Atencion/1Jerarquia y Colas/2Configuracion/1Nodos y elementos/2Elementos/td_1General (G)'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('DIGITURNO/CONFIGURACION/1Modelo de Atencion/1Jerarquia y Colas/2Configuracion/1Nodos y elementos/2Elementos/Edicion/img_Nuevo'), 
    0)

'Agregar Nodo'
WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/1Modelo de Atencion/1Jerarquia y Colas/2Configuracion/1Nodos y elementos/3Nodos/img_Nuevo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

