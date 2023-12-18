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

WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Salas'))

WebUI.delay(3)

'Se escoge oficina WorkFlow para crear WorkFlow - Sala Entrega Documentos'
WebUI.click(findTestObject('WIZARD/3Infraestructura/2Salas/2Edicion/btn_SeleccionarOficina'))

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/2Salas/2Edicion/btn_Seleccionar Oficina(1)/a_WorkFlow - Oficina WorkFlow'))

WebUI.delay(2)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/2Salas/2Edicion/input_Nombre'), 'WorkFlow - Sala Pagos')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/2Salas/2Edicion/textarea_Descripcion'), 'WorkFlow - Sala Pagos')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/2Salas/2Edicion/input_MaximoOcupacion'), '100')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/2Salas/2Edicion/input_Tiempo de Abandono HH'), '4')

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/2Salas/2Edicion/Label/label_Habilitar Agendamiento'), 2)

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/2Salas/2Edicion/Promesa de Espera/input_Minutos promesa de espera'), 
    '10')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/2Salas/2Edicion/Promesa de atencion/input_Minutos Promesa Atencion'), 
    '5')

WebUI.check(findTestObject('WIZARD/3Infraestructura/2Salas/2Edicion/Label/label_Habilitar Agendamiento'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/2Salas/2Edicion/AgendamientoLlamado/Intervalo creacion/input_Minutos Intervalo Creacion'), 
    '2')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/2Salas/2Edicion/AgendamientoLlamado/Tiempo Limite Creacion/input_Minutos Tiempo Limite Creacion'), 
    '2')

WebUI.check(findTestObject('WIZARD/3Infraestructura/2Salas/2Edicion/Label/label_Paso a distraido'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/2Salas/2Edicion/Distraidos/Tiempo Automatico a distraido/input_Tiempo automatico a distrado MM'), 
    '1')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/2Salas/2Edicion/Distraidos/Tiempo de Rellamado/input_Tiempo de Rellamado MM'), 
    '1')

WebUI.scrollToPosition(0, 0)

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/2Salas/2Edicion/img_Nuevo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

