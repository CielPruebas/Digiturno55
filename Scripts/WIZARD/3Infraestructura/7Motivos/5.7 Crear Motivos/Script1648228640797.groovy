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

'Motivos listado jerarquia'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Motivos'))

WebUI.delay(3)

'Pestaña Motivos para crear'
WebUI.click(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos'))

WebUI.delay(3)

'Motivo 1'
WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/input_Nombre'), 'Hora de almuerzo')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/textarea_Descripcion'), 'Hora de almuerzo')

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo motivo'), 
    'Cierre', false)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo Ocio'), 'Receso Laboral', 
    false)

WebUI.click(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/img_Nuevo'))

WebUI.delay(3)

'Motivo 2'
WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/input_Nombre'), 'Pausa Activa AM')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/textarea_Descripcion'), 'Pausa Activa AM')

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo motivo'), 
    'Cierre', false)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo Ocio'), 'Receso Laboral', 
    false)

WebUI.click(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/img_Nuevo'))

WebUI.delay(3)

'Motivo 3'
WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/input_Nombre'), 'Pausa Activa PM')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/textarea_Descripcion'), 'Pausa Activa PM')

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo motivo'), 
    'Cierre', false)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo Ocio'), 'Receso Laboral', 
    false)

WebUI.click(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/img_Nuevo'))

WebUI.delay(3)

'Motivo 4'
WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/input_Nombre'), 'Capacitación')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/textarea_Descripcion'), 'Capacitación')

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo motivo'), 
    'Cierre', false)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo Ocio'), 'Labores Administrativas', 
    false)

WebUI.click(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/img_Nuevo'))

WebUI.delay(3)

'Motivo 5'
WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/input_Nombre'), 'Permiso Autorizado')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/textarea_Descripcion'), 'Permiso Autorizado')

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo motivo'), 
    'Cierre', false)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo Ocio'), 'Tiempo Ocio Voluntario', 
    false)

WebUI.click(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/img_Nuevo'))

WebUI.delay(3)

'Motivo 6'
WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/input_Nombre'), 'Falla Técnica')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/textarea_Descripcion'), 'Falla Técnica')

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo motivo'), 
    'Cierre', false)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo Ocio'), 'Labores Administrativas', 
    false)

WebUI.click(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/img_Nuevo'))

WebUI.delay(3)

'Motivo 7'
WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/input_Nombre'), 'WC - Baño')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/textarea_Descripcion'), 'WC - Baño')

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo motivo'), 
    'Cierre', false)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo Ocio'), 'Receso Laboral', 
    false)

WebUI.click(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/img_Nuevo'))

WebUI.delay(3)

'Motivo 8'
WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/input_Nombre'), 'Fin de Jornada')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/textarea_Descripcion'), 'Fin de Jornada')

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo motivo'), 
    'Cierre', false)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo Ocio'), 'Labores Administrativas', 
    false)

WebUI.click(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/img_Nuevo'))

WebUI.delay(3)

'Motivo 9'
WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/input_Nombre'), 'Actividad Interna')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/textarea_Descripcion'), 'Actividad Interna')

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo motivo'), 
    'Cierre', false)

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo Ocio'), 'Labores Administrativas', 
    false)

WebUI.click(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/img_Nuevo'))

WebUI.delay(3)

'Motivo 10'
WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/input_Nombre'), 'Falta Fotocopia')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/textarea_Descripcion'), 'Falta Fotocopia')

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo motivo'), 
    'Suspensión', false)

WebUI.click(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/img_Nuevo'))

WebUI.delay(3)

'Motivo 11'
WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/input_Nombre'), 'Falta Autorización')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/textarea_Descripcion'), 'Falta Autorización')

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo motivo'), 
    'Suspensión', false)

WebUI.click(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/img_Nuevo'))

WebUI.delay(3)

'Motivo 12'
WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/input_Nombre'), 'Falta Recibo de Pago')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/textarea_Descripcion'), 'Falta Recibo de Pago')

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo motivo'), 
    'Suspensión', false)

WebUI.click(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/img_Nuevo'))

WebUI.delay(3)

'Motivo 13'
WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/input_Nombre'), 'Falta Ausente')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/textarea_Descripcion'), 'Falta Ausente')

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo motivo'), 
    'Suspensión', false)

WebUI.click(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/img_Nuevo'))

WebUI.delay(3)

'Motivo 14'
WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/input_Nombre'), 'No Corresponde a Negocio')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/textarea_Descripcion'), 'No Corresponde a Negocio')

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo motivo'), 
    'Cancelación servicio', false)

WebUI.click(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/img_Nuevo'))

WebUI.delay(3)

'Motivo 15'
WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/input_Nombre'), 'Sin Documento')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/textarea_Descripcion'), 'Sin Documento')

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo motivo'), 
    'Cancelación servicio', false)

WebUI.click(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/img_Nuevo'))

WebUI.delay(3)

'Motivo 16'
WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/input_Nombre'), 'Tramitador')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/textarea_Descripcion'), 'Tramitador')

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo motivo'), 
    'Cancelación servicio', false)

WebUI.click(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/img_Nuevo'))

WebUI.delay(3)

'Motivo 17'
WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/input_Nombre'), 'Caída de ERP')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/textarea_Descripcion'), 'Caída de ERP')

WebUI.selectOptionByLabel(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/select_Tipo motivo'), 
    'Cancelación servicio', false)

WebUI.click(findTestObject('WIZARD/3Infraestructura/7Motivos/Motivos/span_Motivos(1)/img_Nuevo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

