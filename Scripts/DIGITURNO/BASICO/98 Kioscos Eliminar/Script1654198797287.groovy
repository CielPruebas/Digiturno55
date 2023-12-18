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

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/0Principal/img_6Kioscos'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/6 Kioscos/0 Modal Oficinas/td_1 Bogota - CIEL'))

WebUI.delay(2)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/6 Kioscos/Lista de Kioscos/td_1 Kiosco Bogota'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/6 Kioscos/Jornadas Oficinas/input_TextoABuscar'), 
    2)

'Selecciona una Jornada'
WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/6 Kioscos/Jornadas Oficinas/td_1 Bogota - CIEL Jornada 1 Ter 1'))

WebUI.delay(2)

'Selecciona una cola'
WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/6 Kioscos/Colas Oficinas/a_SeleccionarTodo'))

'Relaciona la cola'
WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/6 Kioscos/Colas Oficinas/img_Eliminar Colas'))

'Relaciona la cola'
WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/6 Kioscos/Colas Oficinas/img_Eliminar Colas'))

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.delay(3)

'Selecciona una cola'
WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/6 Kioscos/Edicion/img_Eliminar'))

'Selecciona una cola'
WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/6Elementos del Sistema/6 Kioscos/Edicion/img_Eliminar'))

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

