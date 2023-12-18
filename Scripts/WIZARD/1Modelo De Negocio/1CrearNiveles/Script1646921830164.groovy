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

WebUI.click(findTestObject('WIZARD/0Principal/img_ModeloDeNegocioMAX'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/00Menu/span_Niveles'))

WebUI.delay(3)

'Se crea Nivel Área'
WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/1Niveles/Edicion de Niveles/input_Nombre Nivel'), 'Área')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/1Niveles/Edicion de Niveles/input_Descripcion Nivel'), 'Área')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/1Niveles/Edicion de Niveles/input_Cantidad de elementos'), '1')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/1Niveles/Edicion de Niveles/input_Prefijo'), 'AG')

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/1Niveles/Edicion de Niveles/btn_Nuevo'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/00Menu/span_Niveles'))

WebUI.delay(3)

'Se crea Nivel Tipo cliente'
WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/1Niveles/Edicion de Niveles/input_Nombre Nivel'), 'Tipo cliente')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/1Niveles/Edicion de Niveles/input_Descripcion Nivel'), 'Tipo cliente')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/1Niveles/Edicion de Niveles/input_Cantidad de elementos'), '2')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/1Niveles/Edicion de Niveles/input_Prefijo'), 'TC')

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/1Niveles/Edicion de Niveles/btn_Nuevo'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/00Menu/span_Niveles'))

WebUI.delay(3)

'Se crea Nivel Servicio'
WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/1Niveles/Edicion de Niveles/input_Nombre Nivel'), 'Servicio')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/1Niveles/Edicion de Niveles/input_Descripcion Nivel'), 'Servicio')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/1Niveles/Edicion de Niveles/input_Cantidad de elementos'), '3')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/1Niveles/Edicion de Niveles/input_Prefijo'), 'SRVO')

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/1Niveles/Edicion de Niveles/btn_Nuevo'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/00Menu/span_Niveles'))

WebUI.delay(3)

'Se crea Nivel Subservicio'
WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/1Niveles/Edicion de Niveles/input_Nombre Nivel'), 'Subservicio')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/1Niveles/Edicion de Niveles/input_Descripcion Nivel'), 'Subservicio')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/1Niveles/Edicion de Niveles/input_Cantidad de elementos'), '12')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/1Niveles/Edicion de Niveles/input_Prefijo'), 'SUB')

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/1Niveles/Edicion de Niveles/btn_Nuevo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

