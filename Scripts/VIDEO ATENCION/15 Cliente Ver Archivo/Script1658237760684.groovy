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

WebUI.openBrowser(GlobalVariable.UrlDigiturno)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.setText(findTestObject('0Inicio Sesion/input_Usuario'), 'ciel')

WebUI.setText(findTestObject('0Inicio Sesion/input_Clave'), 'digiturno')

WebUI.click(findTestObject('0Inicio Sesion/btn_IniciarSesion'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/1Principal/img_Operacion(1)'))

WebUI.click(findTestObject('DIGITURNO/OPERACION/0Principal/Elementos del Sistema/img_Terminales'))

WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/0Oficinas/td_2Cali - Chipichape'))

WebUI.delay(2)

WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/0Terminales (Menos WorkFlow)/td_1 - Terminal - Informacion'))

WebUI.delay(3)

'Valor ventana Video Atencion = 0  y valor ventana terminal = 1'
WebUI.navigateToUrl(GlobalVariable.UrlVideoAtencion)

WebUI.waitForElementClickable(findTestObject('VIDEO ATENCION/Cliente/0btn_Solicitar Video Atencion'), 5)

WebUI.click(findTestObject('VIDEO ATENCION/Cliente/0btn_Solicitar Video Atencion'))

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('VIDEO ATENCION/Cliente/select_Tipo Identificacion'), 1)

WebUI.setText(findTestObject('VIDEO ATENCION/Cliente/input_Identificacion'), '636711')

WebUI.setText(findTestObject('VIDEO ATENCION/Cliente/input_NombreCompleto'), 'Jaime Enrique Davila Zuazo')

WebUI.setText(findTestObject('VIDEO ATENCION/Cliente/input_Primer Nombre'), 'Jaime')

WebUI.setText(findTestObject('VIDEO ATENCION/Cliente/input_Segundo Nombre'), 'Enrique')

WebUI.setText(findTestObject('VIDEO ATENCION/Cliente/input_Primer Apellido'), 'Davila')

WebUI.setText(findTestObject('VIDEO ATENCION/Cliente/input_Segundo Apellido'), 'Zuazo')

WebUI.setText(findTestObject('VIDEO ATENCION/Cliente/input_Celular'), '3194159302')

WebUI.setText(findTestObject('VIDEO ATENCION/Cliente/input_Correo'), 'edavilaz@gmail.com')

WebUI.setText(findTestObject('VIDEO ATENCION/Cliente/input_Confirme Correo'), 'edavilaz@gmail.com')

WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('VIDEO ATENCION/Cliente/img_Continuar (Guarda Cliente)'), 2)

WebUI.click(findTestObject('VIDEO ATENCION/Cliente/img_Continuar (Guarda Cliente)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

'Cambio a ventana Terminal para llamar el Turno'
WebUI.switchToWindowIndex(1)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/Terminal/img_Llamar'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/Terminal/img_Ocupado'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/Terminal/img_Ocupado(1)/a_1Actualizacion de Datos'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.switchToWindowIndex(0)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('VIDEO ATENCION/Cliente/Atencion/img_Adjuntar Archivo'), 3)

WebUI.uploadFile(findTestObject('VIDEO ATENCION/Cliente/Atencion/img_Adjuntar Archivo'), 'C:\\CIEL INGENIERIA\\Katalon\\Digiturno55\\archivos\\1.txt')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.switchToWindowIndex(0)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('VIDEO ATENCION/Cliente/Atencion/Archivos/img_Ver Archivo Enviado'), 2)

WebUI.click(findTestObject('VIDEO ATENCION/Cliente/Atencion/Archivos/img_Ver Archivo Enviado'))

WebUI.delay(2)

WebUI.switchToWindowIndex(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/Terminal/img_Cerrar'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/OPERACION/2Terminales/Terminal/img_Cerrar(1)/btn_4FindeJornada_8'))

WebUI.delay(3)

WebUI.closeBrowser()

