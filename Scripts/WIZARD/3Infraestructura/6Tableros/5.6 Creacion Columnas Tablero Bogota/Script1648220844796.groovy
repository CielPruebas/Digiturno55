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

'Bogota'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Tableros'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/0OficinaModal/td_Bogota - CIEL'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Lista de Tableros/td_Tablero - 1'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/span_Columnas'))

WebUI.delay(2)

'Creacion Turno'
WebUI.setText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Columnas/input_Nombre'), 'Turno')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Columnas/textarea_Descripcion'), 'Turno')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Columnas/input_Titulo'), 'Turno')

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Columnas/btn_Atributos'), 2)

WebUI.check(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/Label/Columnas/label_Habilitada'))

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Columnas/btn_Atributos'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Columnas/btn_Atributos (1)/a_Turno.Numero'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Columnas/img_Nuevo'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Columnas/input_Nombre'), 2)

'Creacion Modulo'
WebUI.setText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Columnas/input_Nombre'), 'Modulo')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Columnas/textarea_Descripcion'), 'Modulo')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Columnas/input_Titulo'), 'Modulo')

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Columnas/btn_Atributos'), 2)

WebUI.clearText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Columnas/input_Elementos'))

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Columnas/btn_Atributos'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Columnas/btn_Atributos (1)/a_Terminal.Modulo'))

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Columnas/btn_Orden UP'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Columnas/img_Nuevo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

