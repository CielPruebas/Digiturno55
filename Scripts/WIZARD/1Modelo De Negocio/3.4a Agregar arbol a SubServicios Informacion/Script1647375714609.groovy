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

'Buscamos el Servicio Información General'
WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/input_cajaBusqueda'), 'Información')

WebUI.delay(3)

WebUI.rightClick(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/7 General Informacion/span_7 Informacion'))

WebUI.mouseOver(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/7 General Informacion/span_Elemento'))

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/7 General Informacion/span_Elemento(1)/span_Agregar Elementos'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/7 General Informacion/span_Elemento(1)/span_Agregar Elementos(1)/servicios/label_0 Actualizacion de Datos'))

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/7 General Informacion/span_Elemento(1)/span_Agregar Elementos(1)/servicios/label_3 Facturacion'))

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/7 General Informacion/span_Elemento(1)/span_Agregar Elementos(1)/servicios/label_5 Inscripciones'))

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/7 General Informacion/span_Elemento(1)/span_Agregar Elementos(1)/servicios/label_10 Renovaciones'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/7 General Informacion/span_Elemento(1)/span_Agregar Elementos(1)/btn_Agregar'))

WebUI.delay(3)

'Buscamos el Servicio Información Preferencial'
WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/input_cajaBusqueda'), 'Información')

WebUI.delay(3)

WebUI.rightClick(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/4 Preferencial Informacion/span_4 Informacion'))

WebUI.mouseOver(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/4 Preferencial Informacion/span_Elemento'))

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/4 Preferencial Informacion/span_Elemento(1)/span_Agregar Elementos'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/4 Preferencial Informacion/span_Elemento(1)/span_Agregar Elementos(1)/servicios/label_0 Actualizacion de Datos'))

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/4 Preferencial Informacion/span_Elemento(1)/span_Agregar Elementos(1)/servicios/label_3 Facturacion'))

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/4 Preferencial Informacion/span_Elemento(1)/span_Agregar Elementos(1)/servicios/label_5 Inscripciones'))

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/4 Preferencial Informacion/span_Elemento(1)/span_Agregar Elementos(1)/servicios/label_10 Renovaciones'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/4 Preferencial Informacion/span_Elemento(1)/span_Agregar Elementos(1)/btn_Agregar'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

