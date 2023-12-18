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

'Buscamos el Servicio PQRS General'
WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/input_cajaBusqueda'), 'PQRS')

WebUI.delay(3)

WebUI.rightClick(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/8 General PQRS/span_8 PQRS'))

WebUI.mouseOver(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/8 General PQRS/span_Elemento'))

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/8 General PQRS/span_Elemento(1)/span_Agregar Elementos'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/8 General PQRS/span_Elemento(1)/span_Agregar Elementos(1)/servicios/label_6 Peticion'))

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/8 General PQRS/span_Elemento(1)/span_Agregar Elementos(1)/servicios/label_7 Queja'))

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/8 General PQRS/span_Elemento(1)/span_Agregar Elementos(1)/servicios/label_8 Reclamo'))

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/8 General PQRS/span_Elemento(1)/span_Agregar Elementos(1)/servicios/label_11 Solicitud'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/8 General PQRS/span_Elemento(1)/span_Agregar Elementos(1)/btn_Agregar'))

WebUI.delay(3)

'Buscamos el Servicio PQRS Preferencial'
WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/input_cajaBusqueda'), 'PQRS')

WebUI.delay(3)

WebUI.rightClick(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/5 Preferencial PQRS/span_5 PQRS'))

WebUI.mouseOver(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/5 Preferencial PQRS/span_Elemento'))

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/5 Preferencial PQRS/span_Elemento(1)/span_Agregar Elementos'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/5 Preferencial PQRS/span_Elemento(1)/span_Agregar Elementos(1)/servicios/label_6 Peticion'))

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/5 Preferencial PQRS/span_Elemento(1)/span_Agregar Elementos(1)/servicios/label_7 Queja'))

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/5 Preferencial PQRS/span_Elemento(1)/span_Agregar Elementos(1)/servicios/label_8 Reclamo'))

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/5 Preferencial PQRS/span_Elemento(1)/span_Agregar Elementos(1)/servicios/label_11 Solicitud'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/5 Preferencial PQRS/span_Elemento(1)/span_Agregar Elementos(1)/btn_Agregar'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

