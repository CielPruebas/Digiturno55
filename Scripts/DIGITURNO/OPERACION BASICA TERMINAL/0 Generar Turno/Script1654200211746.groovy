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

WebUI.callTestCase(findTestCase('0InicioSesionOperacionBasica'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/1Principal/img_Operacion(1)'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/OPERACION/0Principal/Elementos del Sistema/img_Selectores'))

WebUI.delay(3)

'Escogemos oficina'
WebUI.click(findTestObject('DIGITURNO/OPERACION/1Selectores/Oficinas/td_1Bogota - CIEL'))

WebUI.delay(3)

'Abrimos selector'
WebUI.click(findTestObject('DIGITURNO/OPERACION/1Selectores/Lista de Selectores/td_Selector 01'))

WebUI.delay(5)

'Para ir a la ventana del selector abierto'
WebUI.switchToWindowIndex(1)

WebUI.delay(2)

'Buscar por jerarquia'
WebUI.setText(findTestObject('DIGITURNO/OPERACION/1Selectores/Selector/Jerarquia/input_cajaBusqueda'), 'info')

WebUI.delay(3)

for (def index : (1..11)) {
    WebUI.click(findTestObject('DIGITURNO/OPERACION/1Selectores/Selector/Jerarquia/a_WIZ General Informacion'))

    WebUI.delay(3)

    WebUI.click(findTestObject('DIGITURNO/OPERACION/1Selectores/Selector/Generar Turno/img_Con Impresion'))

    WebUI.delay(3)
}

WebUI.click(findTestObject('DIGITURNO/OPERACION/1Selectores/Selector/0Informacion de Selector/img_Cerrar'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/OPERACION/1Selectores/Selector/0Informacion de Selector/img_Cerrar(1)/btn_4FindeJornada_8'))

WebUI.delay(3)

