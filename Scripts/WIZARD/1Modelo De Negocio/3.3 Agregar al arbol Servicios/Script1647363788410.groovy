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

'Buscamos el Tipo de cliente Preferencial (P)'
WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/input_cajaBusqueda'), 'Preferencial (P)')

WebUI.delay(3)

WebUI.rightClick(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/span_3 Preferencial (P)'))

WebUI.mouseOver(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/span_Elemento'))

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/span_Elemento(1)/span_Agregar Elementos'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/span_Elemento(1)/span_Agregar Elementos(1)/label_Informacion'))

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/span_Elemento(1)/span_Agregar Elementos(1)/label_PQRS'))

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/span_Elemento(1)/span_Agregar Elementos(1)/label_Radicaciones'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1Preferencial/span_Elemento(1)/span_Agregar Elementos(1)/btn_Agregar'))

WebUI.delay(3)

'Buscamos el Tipo de cliente General (G)'
WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/input_cajaBusqueda'), 'General (G)')

WebUI.delay(3)

WebUI.rightClick(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/span_2 General (G)'))

WebUI.mouseOver(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/span_Elemento'))

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/span_Elemento(1)/span_Agregar Elementos'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/span_Elemento(1)/span_Agregar Elementos(1)/label_Informacion'))

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/span_Elemento(1)/span_Agregar Elementos(1)/label_PQRS'))

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/span_Elemento(1)/span_Agregar Elementos(1)/label_Radicaciones'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/0ArbolDeJerarquia/1General/span_Elemento(1)/span_Agregar Elementos(1)/btn_Agregar'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

