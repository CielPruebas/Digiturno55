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

WebUI.click(findTestObject('WIZARD/0Principal/img_InfraestructuraMAX'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Oficinas'))

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/1Oficinas/2Edicion/Edicion/select_Pais'), 'Colombia', 
    false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/1Oficinas/2Edicion/Edicion/select_Departamento'), 'Bolivar', 
    false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/1Oficinas/2Edicion/Edicion/select_Ciudad'), 'Cartagena', 
    false)

WebUI.delay(2)

'Oficina Cartagena - Bocagrande'
WebUI.setText(findTestObject('WIZARD/3Infraestructura/1Oficinas/2Edicion/Edicion/input_Nombre'), 'Cartagena - Bocagrande')

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/1Oficinas/2Edicion/Edicion/select_Nivel de Pregunta'), 
    'Ninguno', false)

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/1Oficinas/2Edicion/Edicion/input_MaximoTurnosXCliente'), '2')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/1Oficinas/2Edicion/Edicion/input_Nivel de servicio de espera'), '0')

WebUI.scrollToPosition(100, 800)

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/1Oficinas/2Edicion/App/input_Nombre a mostrar'), 'Cartagena - Bocagrande')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/1Oficinas/2Edicion/App/input_Direccion'), 'Calle 1 No 24-3')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/1Oficinas/2Edicion/App/input_Numero de telefono'), '3279000')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/1Oficinas/2Edicion/App/input_Distancia minima creacion turnos (m)'), 
    '100')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/1Oficinas/2Edicion/App/input_Cantidad de turnos para prellamado'), 
    '2')

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/1Oficinas/2Edicion/App/input_Longitud'), '0.0000000000')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/1Oficinas/2Edicion/App/input_Latitud'), '0.0000000000')

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/1Oficinas/2Edicion/Edicion/img_Nuevo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

