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

'inicio Seleector Bogota'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Selectores'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/btn_Oficinas(2)/td_1Bogota - CIEL'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Lista de Selectores/td_Selector 01'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/a_SeleccionarTodo'), 
    2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/a_SeleccionarTodo'))

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/img_Relacionar'))

WebUI.delay(3)

'inicio Seleector Cali'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Selectores'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/btn_Oficinas(2)/td_2Cali - Chipichape'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Lista de Selectores/td_Selector 01'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/a_SeleccionarTodo'), 
    2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/a_SeleccionarTodo'))

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/img_Relacionar'))

WebUI.delay(3)

'inicio Selector Cartagena'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Selectores'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/btn_Oficinas(2)/td_3Cartagena - Bocagrande'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Lista de Selectores/td_Selector 01'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/a_SeleccionarTodo'), 
    2)

WebUI.check(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/a_SeleccionarTodo'))

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/img_Relacionar'))

WebUI.delay(3)

'inicio Selector Manizales'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Selectores'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/btn_Oficinas(2)/td_4Manizales - Manizales'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Lista de Selectores/td_Selector 01'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/a_SeleccionarTodo'), 
    2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/a_SeleccionarTodo'))

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/img_Relacionar'))

WebUI.delay(3)

'inicio Selector Medellin'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Selectores'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/btn_Oficinas(2)/td_5Medellin - Laureles'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Lista de Selectores/td_Selector 01'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/a_SeleccionarTodo'), 
    2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/a_SeleccionarTodo'))

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/img_Relacionar'))

WebUI.delay(3)

'inicio Selector Virtual'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Selectores'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/btn_Oficinas(2)/td_6Virtual - Oficina Virtual'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Lista de Selectores/td_Selector 01'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/a_SeleccionarTodo'), 
    2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/a_SeleccionarTodo'))

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/img_Relacionar'))

WebUI.delay(3)

'inicio Selector WorkFlow'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Selectores'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/btn_Oficinas(2)/td_7WorkFlow - Oficina WorkFlow'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Lista de Selectores/td_Selector 01'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/a_SeleccionarTodo'), 
    2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/a_SeleccionarTodo'))

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/Destino del turno/img_Relacionar'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

