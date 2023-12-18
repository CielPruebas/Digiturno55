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

WebUI.selectOptionByIndex(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Edicion/select_Pais'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Edicion/select_Departamento'), 
    1)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Edicion/select_Ciudad'), 
    1)

WebUI.delay(2)

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Edicion/input_Nombre'), 'Prueba')

'Oficina Sala Grupo'
WebUI.selectOptionByIndex(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Edicion/select_Nivel Pregunta'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Edicion/input_Nivel de servicio de espera'), 
    '1')

WebUI.scrollToElement(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Edicion/App/input_NombreAMostrar'), 
    0)

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Edicion/App/input_NombreAMostrar'), 
    'Prueba')

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Edicion/App/input_Direccion'), 
    'Carrera')

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Edicion/App/input_Telefono'), '1234567')

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Edicion/App/input_Distancia minima creacion turnos (m)'), 
    '100')

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Edicion/App/input_Cantidad de turnos para prellamado'), 
    '2')

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Edicion/Coordenada Grafica/input_Longitud'), 
    '0.0000000000')

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Edicion/Coordenada Grafica/input_Latitud'), 
    '0.0000000000')

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Edicion/img_Nuevo'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Otras Configuraciones/span_Numeradores'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 1800)

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Otras Configuraciones/span_Numeradores(1)/Numeradores/td_1Numerador Bogota - CIEL'))

WebUI.delay(2)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Otras Configuraciones/span_Numeradores(1)/Colas del sistema/a_SeleccionarTodo'))

WebUI.delay(2)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/2Oficinas/Otras Configuraciones/span_Numeradores(1)/Numeradores/img_Relacionar colas'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

