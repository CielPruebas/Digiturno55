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

WebUI.callTestCase(findTestCase('0InicioSesion'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DIGITURNO/1Principal/img_Configuracion(1)'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/0Principal/img_7Sistema'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/7Sistema/0Principal/img_1 Parametros Generales'))

WebUI.delay(3)

'Sistema.Login.Intentos.Limite'
WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/7Sistema/1 Parametros Generales/input_Busqueda'), 'Sistema.Login.Intentos.Limite')

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/7Sistema/1 Parametros Generales/img_Filtrar'))

WebUI.delay(2)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/7Sistema/1 Parametros Generales/Lista Botones Editar/btn_Editar 1'))

WebUI.delay(2)

'numero 2'
WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/7Sistema/1 Parametros Generales/Pestanas/Cambiar Parametros/Numero/span_Valor-up'), 
    FailureHandling.STOP_ON_FAILURE)

'numero 2'
WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/7Sistema/1 Parametros Generales/Pestanas/Cambiar Parametros/Numero/span_Valor-up'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/7Sistema/1 Parametros Generales/Pestanas/Cambiar Parametros/Numero/a_Guardar'))

WebUI.delay(3)

WebUI.click(findTestObject('0Inicio Sesion/MenuInicio/img_MenuUsuario'))

WebUI.delay(2)

WebUI.click(findTestObject('0Inicio Sesion/MenuInicio/a_Cerrar sesion'))

WebUI.delay(3)

WebUI.setText(findTestObject('0Inicio Sesion/input_Usuario'), 'ciel')

WebUI.setText(findTestObject('0Inicio Sesion/input_Clave'), 'digiturn')

WebUI.click(findTestObject('0Inicio Sesion/btn_IniciarSesion'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.setText(findTestObject('0Inicio Sesion/input_Usuario'), 'ciel')

WebUI.setText(findTestObject('0Inicio Sesion/input_Clave'), 'digiturn')

WebUI.click(findTestObject('0Inicio Sesion/btn_IniciarSesion'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('0Inicio Sesion/input_Usuario'), 'ciel')

WebUI.setText(findTestObject('0Inicio Sesion/input_Clave'), 'digiturn')

WebUI.click(findTestObject('0Inicio Sesion/btn_IniciarSesion'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(13)

WebUI.setText(findTestObject('0Inicio Sesion/input_Usuario'), 'ciel')

WebUI.setText(findTestObject('0Inicio Sesion/input_Clave'), 'digiturno')

WebUI.click(findTestObject('0Inicio Sesion/btn_IniciarSesion'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/1Principal/img_ImageLogo'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

