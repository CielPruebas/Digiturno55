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

WebUI.callTestCase(findTestCase('DIGITURNO/BASICO/32 Elementos del Sistema'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/0Principal/img_1Selectores'))

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/1 Selectores/0Oficina Modal/td_1Bogota - CIEL'))

WebUI.scrollToElement(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/1 Selectores/Configuracion/span_Edicion(1)/Infomacion General/btn_SelecccionarOficina'), 
    2)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/1 Selectores/Configuracion/span_Edicion(1)/Infomacion General/btn_SelecccionarOficina'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/1 Selectores/Configuracion/span_Edicion(1)/Infomacion General/btn_SeleccionarOficina(1)/td_Bogota - CIEL'))

WebUI.scrollToElement(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/1 Selectores/Configuracion/span_Edicion(1)/Infomacion General/input_Nombre'), 
    2)

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/1 Selectores/Configuracion/span_Edicion(1)/Infomacion General/input_Nombre'), 
    'Prueba')

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/1 Selectores/Configuracion/span_Edicion(1)/Infomacion General/textarea_Descripcion'), 
    'Prueba')

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/1 Selectores/Configuracion/span_Edicion(1)/Infomacion General/img_Nuevo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

