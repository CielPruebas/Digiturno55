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

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/0Principal/img_8Impresoras'))

WebUI.delay(2)

WebUI.scrollToPosition(50, 700)

WebUI.selectOptionByIndex(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/8 Impresoras/Configuracion Impresoras/span_Edicion Impresoras(1)/Informacion general/select_Tipo Impresora'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/8 Impresoras/Configuracion Impresoras/span_Edicion Tiquetes'))

WebUI.scrollToPosition(0, 300)

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/8 Impresoras/Configuracion Impresoras/span_Edicion Tiquetes(1)/Tiquete/input_Nombre Tiquete'), 
    'Prueba')

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/8 Impresoras/Configuracion Impresoras/span_Edicion Tiquetes(1)/Tiquete/img_Nuevo'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/8 Impresoras/Configuracion Impresoras/span_Edicion Impresoras'))

WebUI.delay(2)

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/8 Impresoras/Configuracion Impresoras/span_Edicion Impresoras(1)/Informacion general/input_Nombre Impresora'), 
    'Prueba')

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/8 Impresoras/Configuracion Impresoras/span_Edicion Impresoras(1)/Informacion general/btn_Nombre de la Red'))

WebUI.delay(2)

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/8 Impresoras/Configuracion Impresoras/span_Edicion Impresoras(1)/Informacion general/btn_Nombre de la Red(1)/input__TextoABuscar'), 
    'Prueba')

WebUI.delay(2)

'text = Prueba'
WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/8 Impresoras/Configuracion Impresoras/span_Edicion Impresoras(1)/Informacion general/btn_Nombre de la Red(1)/td_1 Red Fis Bogota - CIEL'))

WebUI.delay(2)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/8 Impresoras/Configuracion Impresoras/span_Edicion Impresoras(1)/Lista de Tiquetes/td_1 Tiquete1'))

WebUI.delay(2)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/8 Impresoras/Configuracion Impresoras/span_Edicion Impresoras(1)/Informacion general/img_Nuevo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

