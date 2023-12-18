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

'Inicio Proceso Bogota'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Tableros'))

WebUI.delay(3)

'Inicio Creacion Tablero Bogota'
WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/0OficinaModal/a_x(Cerrar)'))

WebUI.delay(3)

'Inicio Creacion Tablero Bogota'
WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/btn_SeleccionarOficina'))

WebUI.delay(3)

'Inicio Creacion Tablero Bogota'
WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/btn_Seleccionar Oficina(1)/td_1Bogota - CIEL'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/input_Nombre'), 'Bogota - Tablero - 1 ')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/textarea_Descripcion'), 'Bogota - Tablero - 1')

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/img_Nuevo'))

WebUI.delay(3)

'Inicio Proceso Cali'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Tableros'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/0OficinaModal/a_x(Cerrar)'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/btn_SeleccionarOficina'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/btn_Seleccionar Oficina(1)/td_2Cali - Chipichape'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/input_Nombre'), 2)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/input_Nombre'), 'Cali - Tablero - 1 ')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/textarea_Descripcion'), 'Cali - Tablero - 1')

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/img_Nuevo'))

WebUI.delay(3)

'Inicio Proceso Cartagena'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Tableros'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/0OficinaModal/a_x(Cerrar)'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/btn_SeleccionarOficina'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/btn_Seleccionar Oficina(1)/td_3Cartagena - Bocagrande'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/input_Nombre'), 2)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/input_Nombre'), 'Cartagena - Tablero - 1 ')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/textarea_Descripcion'), 'Cartagena - Tablero - 1')

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/img_Nuevo'))

WebUI.delay(3)

'Inicio Proceso Manizales'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Tableros'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/0OficinaModal/a_x(Cerrar)'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/btn_SeleccionarOficina'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/btn_Seleccionar Oficina(1)/td_4Manizales - Manizales'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/input_Nombre'), 2)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/input_Nombre'), 'Manizales - Tablero - 1 ')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/textarea_Descripcion'), 'Manizales - Tablero - 1')

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/img_Nuevo'))

WebUI.delay(3)

'Inicio Proceso Medellin'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Tableros'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/0OficinaModal/a_x(Cerrar)'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/btn_SeleccionarOficina'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/btn_Seleccionar Oficina(1)/td_5Medellin - Laureles'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/input_Nombre'), 2)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/input_Nombre'), 'Medellin - Tablero - 1 ')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/textarea_Descripcion'), 'Medellin - Tablero - 1')

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/img_Nuevo'))

WebUI.delay(3)

'Inicio Proceso Virtual'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Tableros'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/0OficinaModal/a_x(Cerrar)'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/btn_SeleccionarOficina'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/btn_Seleccionar Oficina(1)/td_6Virtual - Oficina Virtual'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/input_Nombre'), 2)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/input_Nombre'), 'Virtual - Tablero - 1 ')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/textarea_Descripcion'), 'Virtual - Tablero - 1')

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/img_Nuevo'))

WebUI.delay(3)

'Inicio Proceso WorkFlow'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Tableros'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/0OficinaModal/a_x(Cerrar)'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/btn_SeleccionarOficina'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/btn_Seleccionar Oficina(1)/td_7WorkFlow - Oficina WorkFlow'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/input_Nombre'), 2)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/input_Nombre'), 'WorkFlow - Tablero - 1 ')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/textarea_Descripcion'), 'WorkFlow - Tablero - 1')

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/img_Nuevo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

