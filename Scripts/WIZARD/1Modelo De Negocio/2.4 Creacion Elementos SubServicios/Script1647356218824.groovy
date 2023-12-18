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

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Nivel/option_4Subservicio'))

WebUI.delay(3)

'Actualización de Datos'
WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Nivel/SubServicio/td_SUB1'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Nombre Elemento'), 'Actualización de Datos')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Descripcion Elemento'), 'Actualización de Datos')

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoMaxAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlMaxTiempo_txtMinuto\').value=10', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2ModalTiempoMaxAtencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoControaldoAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlTiempoControlado_txtMinuto\').value=5', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Modal Tiempo Controlado de atencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/btn_Actualizar'))

WebUI.delay(3)

'Inscripciones'
WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Nivel/SubServicio/td_SUB2'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Nombre Elemento'), 'Inscripciones')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Descripcion Elemento'), 'Inscripciones')

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoMaxAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlMaxTiempo_txtMinuto\').value=10', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2ModalTiempoMaxAtencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoControaldoAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlTiempoControlado_txtMinuto\').value=5', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Modal Tiempo Controlado de atencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/btn_Actualizar'))

WebUI.delay(3)

'Facturación'
WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Nivel/SubServicio/td_SUB3'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Nombre Elemento'), 'Facturación')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Descripcion Elemento'), 'Facturación')

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoMaxAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlMaxTiempo_txtMinuto\').value=10', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2ModalTiempoMaxAtencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoControaldoAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlTiempoControlado_txtMinuto\').value=5', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Modal Tiempo Controlado de atencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/btn_Actualizar'))

WebUI.delay(3)

'Renovaciones'
WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Nivel/SubServicio/td_SUB4'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Nombre Elemento'), 'Renovaciones')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Descripcion Elemento'), 'Renovaciones')

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoMaxAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlMaxTiempo_txtMinuto\').value=10', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2ModalTiempoMaxAtencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoControaldoAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlTiempoControlado_txtMinuto\').value=5', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Modal Tiempo Controlado de atencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/btn_Actualizar'))

WebUI.delay(3)

'Autorizaciones'
WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Nivel/SubServicio/td_SUB5'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Nombre Elemento'), 'Autorizaciones')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Descripcion Elemento'), 'Autorizaciones')

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoMaxAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlMaxTiempo_txtMinuto\').value=10', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2ModalTiempoMaxAtencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoControaldoAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlTiempoControlado_txtMinuto\').value=5', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Modal Tiempo Controlado de atencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/btn_Actualizar'))

WebUI.delay(3)

'Certificado'
WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Nivel/SubServicio/td_SUB6'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Nombre Elemento'), 'Certificado')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Descripcion Elemento'), 'Certificado')

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoMaxAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlMaxTiempo_txtMinuto\').value=10', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2ModalTiempoMaxAtencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoControaldoAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlTiempoControlado_txtMinuto\').value=5', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Modal Tiempo Controlado de atencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/btn_Actualizar'))

WebUI.delay(3)

'Facturas'
WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Nivel/SubServicio/td_SUB7'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Nombre Elemento'), 'Facturas')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Descripcion Elemento'), 'Facturas')

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoMaxAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlMaxTiempo_txtMinuto\').value=10', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2ModalTiempoMaxAtencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoControaldoAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlTiempoControlado_txtMinuto\').value=5', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Modal Tiempo Controlado de atencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/btn_Actualizar'))

WebUI.delay(3)

'Remisión'
WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Nivel/SubServicio/td_SUB8'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Nombre Elemento'), 'Remisión')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Descripcion Elemento'), 'Remisión')

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoMaxAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlMaxTiempo_txtMinuto\').value=10', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2ModalTiempoMaxAtencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoControaldoAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlTiempoControlado_txtMinuto\').value=5', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Modal Tiempo Controlado de atencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/btn_Actualizar'))

WebUI.delay(3)

'Petición'
WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Nivel/SubServicio/td_SUB9'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Nombre Elemento'), 'Petición')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Descripcion Elemento'), 'Petición')

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoMaxAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlMaxTiempo_txtMinuto\').value=10', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2ModalTiempoMaxAtencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoControaldoAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlTiempoControlado_txtMinuto\').value=5', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Modal Tiempo Controlado de atencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/btn_Actualizar'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Nivel/SubServicio/td_SUB10'), 2)

'Queja'
WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Nivel/SubServicio/td_SUB10'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Nombre Elemento'), 'Queja')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Descripcion Elemento'), 'Queja')

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoMaxAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlMaxTiempo_txtMinuto\').value=10', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2ModalTiempoMaxAtencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoControaldoAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlTiempoControlado_txtMinuto\').value=5', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Modal Tiempo Controlado de atencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/btn_Actualizar'))

WebUI.delay(3)

'Reclamo'
WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Nivel/SubServicio/td_SUB11'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Nombre Elemento'), 'Reclamo')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Descripcion Elemento'), 'Reclamo')

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoMaxAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlMaxTiempo_txtMinuto\').value=10', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2ModalTiempoMaxAtencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoControaldoAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlTiempoControlado_txtMinuto\').value=5', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Modal Tiempo Controlado de atencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/btn_Actualizar'))

WebUI.delay(3)

'Solicitud'
WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Nivel/SubServicio/td_SUB12'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Nombre Elemento'), 'Solicitud')

WebUI.setText(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/input_Descripcion Elemento'), 'Solicitud')

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoMaxAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlMaxTiempo_txtMinuto\').value=10', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2ModalTiempoMaxAtencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_lnkTiempoControaldoAtencion\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'ContentPlaceHolder1_TimeSpanControlTiempoControlado_txtMinuto\').value=5', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Modal Tiempo Controlado de atencion/btn_Aceptar'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/1Modelo De Negocio/2Elementos/Edicion de Elementos/btn_Actualizar'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

