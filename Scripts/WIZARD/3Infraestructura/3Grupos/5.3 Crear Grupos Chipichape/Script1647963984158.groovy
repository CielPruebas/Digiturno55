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

'Se escoge sala Chipichape - Sala General'
WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/btn_Sala'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/btn_Sala(1)/a_2Chipichape - Sala General'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/input_Nombre'), 'Grupo Información')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/textarea_Descripcion'), 'Chipichape - Grupo Información')

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

'Para crear Grupo PQRS'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Grupos'))

WebUI.delay(3)

'Se escoge sala Chipichape - Sala General'
WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/btn_Sala'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/btn_Sala(1)/a_2Chipichape - Sala General'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/input_Nombre'), 'Grupo PQRS')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/textarea_Descripcion'), 'Chipichape - PQRS')

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

'Se escoge sala Chipichape - Sala General'
WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/btn_Sala'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/btn_Sala(1)/a_2Chipichape - Sala General'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/input_Nombre'), 'Grupo Radicaciones')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/3Grupos/Edicion/textarea_Descripcion'), 'Chipichape- Radicaciones')

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

