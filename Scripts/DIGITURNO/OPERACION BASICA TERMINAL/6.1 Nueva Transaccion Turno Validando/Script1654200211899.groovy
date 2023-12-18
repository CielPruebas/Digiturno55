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

WebUI.callTestCase(findTestCase('0InicioSesionOperacionBasica'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DIGITURNO/1Principal/img_Operacion(1)'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/OPERACION/0Principal/Elementos del Sistema/img_Terminales'))

WebUI.delay(3)

'Escogemos oficina'
WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/0Oficinas/td_1Bogota - CIEL'))

WebUI.delay(3)

'Abrimos Terminal'
WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/0Terminales (Menos WorkFlow)/td_1 - Terminal - Informacion'))

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/Terminal/img_Llamar'))

'validando Llamando'
WebUI.verifyElementVisible(findTestObject('DIGITURNO/OPERACION/2Terminales/Estados a Verificar/div_Llamando'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/Terminal/img_Ocupado'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/Terminal/img_Ocupado(1)/a_1Actualizacion de Datos'))

'validando Ocupado'
WebUI.verifyElementVisible(findTestObject('DIGITURNO/OPERACION/2Terminales/Estados a Verificar/span_Ocupado'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/Terminal/img_Nueva Transaccion'))

'Nueva Transacción'
WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/Terminal/img_Nueva Transaccion(1)/a_1Informacion General'))

'Nueva Transacción'
WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/Terminal/img_Nueva Transaccion(1)/img_Nueva Transaccion(2)/a_3'))

WebUI.delay(3)

'validando Nueva Transaccion'
WebUI.verifyElementVisible(findTestObject('DIGITURNO/OPERACION/2Terminales/Estados a Verificar/div_Nueva Transaccion'))

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/Terminal/img_Cerrar'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/Terminal/img_Cerrar(1)/btn_4FindeJornada_8'))

'validando Cerrado'
WebUI.verifyElementVisible(findTestObject('DIGITURNO/OPERACION/2Terminales/Estados a Verificar/div_Terminal Cerrado'))

WebUI.delay(3)

