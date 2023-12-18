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

WebUI.callTestCase(findTestCase('DIGITURNO/BASICO/21 Distribucion Geografica'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/0Principal/img_2Oficinas'))

WebUI.delay(2)

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Lista de oficinas/input_TextoABuscar'), 
    'Prueba')

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Lista de oficinas/img_Filtrar'))

WebUI.delay(2)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Lista de oficinas/td_1 Seleccion Busqueda'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 1600)

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Otras Configuraciones/span_Colas(1)/a__SeleccionarTodo'))

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Otras Configuraciones/span_Colas(1)/img_Eliminar'))

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Otras Configuraciones/span_Colas(1)/img_Eliminar'))

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

