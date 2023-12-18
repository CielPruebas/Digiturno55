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

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/Elementos del nivel/img_Relacionar'), 
    2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TabContainer1_tpEdicion_salasEntes_TablaHerramientas1_aSeleccionarTodo\').click()', 
    [])

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/Elementos del nivel/img_Relacionar'))

WebUI.delay(3)

'Cali'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Tableros'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/0OficinaModal/td_Cali - Chipichape'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Lista de Tableros/td_Tablero - 1'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/Elementos del nivel/img_Relacionar'), 
    2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TabContainer1_tpEdicion_salasEntes_TablaHerramientas1_aSeleccionarTodo\').click()', 
    [])

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/Elementos del nivel/img_Relacionar'))

WebUI.delay(3)

'Cali'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Tableros'))

WebUI.delay(3)

'Cartagena'
WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/0OficinaModal/td_Cartagena - Bocagrande'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Lista de Tableros/td_Tablero - 1'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/Elementos del nivel/img_Relacionar'), 
    2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TabContainer1_tpEdicion_salasEntes_TablaHerramientas1_aSeleccionarTodo\').click()', 
    [])

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/Elementos del nivel/img_Relacionar'))

WebUI.delay(3)

'Manizales'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Tableros'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/0OficinaModal/td_Manizales - Manizales'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Lista de Tableros/td_Tablero - 1'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/Elementos del nivel/img_Relacionar'), 
    2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TabContainer1_tpEdicion_salasEntes_TablaHerramientas1_aSeleccionarTodo\').click()', 
    [])

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/Elementos del nivel/img_Relacionar'))

WebUI.delay(3)

'Medellin'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Tableros'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/0OficinaModal/td_Medellin - Laureles'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Lista de Tableros/td_Tablero - 1'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/Elementos del nivel/img_Relacionar'), 
    2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TabContainer1_tpEdicion_salasEntes_TablaHerramientas1_aSeleccionarTodo\').click()', 
    [])

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/Elementos del nivel/img_Relacionar'))

WebUI.delay(3)

'Virtual'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Tableros'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/0OficinaModal/td_Virtual - Oficina Virtual'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Lista de Tableros/td_Tablero - 1'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/Elementos del nivel/img_Relacionar'), 
    2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TabContainer1_tpEdicion_salasEntes_TablaHerramientas1_aSeleccionarTodo\').click()', 
    [])

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/Elementos del nivel/img_Relacionar'))

WebUI.delay(3)

'WorkFlow'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Tableros'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/0OficinaModal/td_WorkFlow - Oficina WorkFlow'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Lista de Tableros/td_Tablero - 1'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/Elementos del nivel/img_Relacionar'), 
    2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TabContainer1_tpEdicion_salasEntes_TablaHerramientas1_aSeleccionarTodo\').click()', 
    [])

WebUI.click(findTestObject('WIZARD/3Infraestructura/6Tableros/Configuracion/Edicion/Elementos del nivel/img_Relacionar'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

