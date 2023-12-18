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

WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Grupos'))

WebUI.delay(3)

'Se escoge sala WorkFlow - Sala General'
WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/btn_Sala'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/btn_Sala(1)/a_WorkFlow - Sala General'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/input_Nombre'), 'Grupo General')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/textarea_Descripcion'), 'WorkFlow - Grupo General')

WebUI.scrollToPosition(0, 800)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/select_Nivel de visualizacion en Transferencias'), 
    'Área', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/select_Nivel de visualizacion en Nuevo Servicio'), 
    'Área', false)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/img_Nuevo'))

WebUI.delay(3)

'Para crear Grupo Entrega Documentos'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Grupos'))

WebUI.delay(3)

'Se escoge sala WorkFlow - Sala Entrega Documentos'
WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/btn_Sala'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/btn_Sala(1)/a_WorkFlow - Sala Entrega Documentos'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/input_Nombre'), 'Grupo Entrega Documentos')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/textarea_Descripcion'), 'WorkFlow - Entrega Documentos')

WebUI.scrollToPosition(0, 800)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/select_Nivel de visualizacion en Transferencias'), 
    'Área', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/select_Nivel de visualizacion en Nuevo Servicio'), 
    'Área', false)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/img_Nuevo'))

WebUI.delay(3)

'Grupo Pagos'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Grupos'))

WebUI.delay(3)

'Se escoge sala WorkFlow - Sala Pagos'
WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/btn_Sala'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/btn_Sala(1)/a_WorkFlow - Sala Pagos'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/input_Nombre'), 'Grupo Pagos')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/textarea_Descripcion'), 'WorkFlow - Pagos')

WebUI.scrollToPosition(0, 800)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/select_Nivel de visualizacion en Transferencias'), 
    'Área', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/select_Nivel de visualizacion en Nuevo Servicio'), 
    'Área', false)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/img_Nuevo'))

WebUI.delay(3)

'Grupo Radicaciones'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Grupos'))

WebUI.delay(3)

'Se escoge sala WorkFlow - Sala Radicaciones'
WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/btn_Sala'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/btn_Sala(1)/a_WorkFlow - Sala Radicaciones'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/input_Nombre'), 'Grupo Radicaciones')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/textarea_Descripcion'), 'WorkFlow - Radicaciones')

WebUI.scrollToPosition(0, 800)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/select_Nivel de visualizacion en Transferencias'), 
    'Área', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/select_Nivel de visualizacion en Nuevo Servicio'), 
    'Área', false)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/img_Nuevo'))

WebUI.delay(3)

'Grupo Recepciones'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Grupos'))

WebUI.delay(3)

'Se escoge sala WorkFlow - Sala Recepcion'
WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/btn_Sala'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/btn_Sala(1)/a_WorkFlow - Sala Recepcion'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/input_Nombre'), 'Grupo Recepciones')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/textarea_Descripcion'), 'WorkFlow - Recepciones')

WebUI.scrollToPosition(0, 800)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/select_Nivel de visualizacion en Transferencias'), 
    'Área', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/select_Nivel de visualizacion en Nuevo Servicio'), 
    'Área', false)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/img_Nuevo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

