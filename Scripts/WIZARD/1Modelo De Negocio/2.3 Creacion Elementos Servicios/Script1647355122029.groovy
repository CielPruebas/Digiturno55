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

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/00Menu/span_Elementos'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Nivel/option_3Servicio'))

WebUI.delay(3)

'Servicio Información'
WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Nivel/Servicio/td_SRVO1'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Nombre Elemento'), 'Información')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Descripcion Elemento'), 'Información')

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoMaxAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlMaxTiempo_txtMinuto\').value=10', 
    [])

WebUI.delay(5)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2ModalTiempoMaxAtencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoControaldoAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlTiempoControlado_txtMinuto\').value=5', 
    [])

WebUI.delay(5)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Modal Tiempo Controlado de atencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/btn_Actualizar'))

WebUI.delay(20)

'Servicio Radicaciones'
WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Nivel/Servicio/td_SRVO2'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Nombre Elemento'), 'Radicaciones')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Descripcion Elemento'), 'Radicaciones')

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoMaxAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlMaxTiempo_txtMinuto\').value=10', 
    [])

WebUI.delay(5)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2ModalTiempoMaxAtencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoControaldoAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlTiempoControlado_txtMinuto\').value=5', 
    [])

WebUI.delay(5)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Modal Tiempo Controlado de atencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/btn_Actualizar'))

WebUI.delay(20)

'Servicio PQRS'
WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Nivel/Servicio/td_SRVO3'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Nombre Elemento'), 'PQRS')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Descripcion Elemento'), 'PQRS')

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoMaxAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlMaxTiempo_txtMinuto\').value=10', 
    [])

WebUI.delay(5)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2ModalTiempoMaxAtencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoControaldoAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlTiempoControlado_txtMinuto\').value=5', 
    [])

WebUI.delay(5)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Modal Tiempo Controlado de atencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/btn_Actualizar'))

WebUI.delay(20)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

