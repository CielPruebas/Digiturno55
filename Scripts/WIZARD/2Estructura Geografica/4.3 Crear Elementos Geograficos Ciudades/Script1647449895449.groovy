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

WebUI.click(findTestObject('WIZARD/0Principal/img_EstructuraGeograficaMAX'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/0Arbol Geografico/span_Elementos geograficos'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Niveles Geograficos/option_Departamento'))

'Para crear la ciudad Bogota'
WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Niveles Geograficos/option_Ciudad'))

WebUI.selectOptionByLabel(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Elementos Geograficos/select_Nombre nivel'), 
    'Cundinamarca', false)

WebUI.setText(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/input_Nombre elemento'), 
    'Bogota')

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/btn_Nuevo'))

WebUI.delay(3)

'Para crear la ciudad Cali'
WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Niveles Geograficos/option_Ciudad'))

WebUI.selectOptionByLabel(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Elementos Geograficos/select_Nombre nivel'), 
    'Valle del Cauca', false)

WebUI.setText(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/input_Nombre elemento'), 
    'Cali')

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/btn_Nuevo'))

WebUI.delay(3)

'Para crear la ciudad Cartagena'
WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Niveles Geograficos/option_Ciudad'))

WebUI.selectOptionByLabel(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Elementos Geograficos/select_Nombre nivel'), 
    'Bolivar', false)

WebUI.setText(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/input_Nombre elemento'), 
    'Cartagena')

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/btn_Nuevo'))

WebUI.delay(3)

'Para crear la ciudad Manizales'
WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Niveles Geograficos/option_Ciudad'))

WebUI.selectOptionByLabel(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Elementos Geograficos/select_Nombre nivel'), 
    'Caldas', false)

WebUI.setText(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/input_Nombre elemento'), 
    'Manizales')

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/btn_Nuevo'))

WebUI.delay(3)

'Para crear la ciudad Virtual'
WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Niveles Geograficos/option_Ciudad'))

WebUI.selectOptionByLabel(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Elementos Geograficos/select_Nombre nivel'), 
    'Dpto Virtual', false)

WebUI.setText(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/input_Nombre elemento'), 
    'Virtual')

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/btn_Nuevo'))

WebUI.delay(3)

'Para crear la ciudad WorkFlow'
WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Niveles Geograficos/option_Ciudad'))

WebUI.selectOptionByLabel(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Elementos Geograficos/select_Nombre nivel'), 
    'Dpto WorkFlow', false)

WebUI.setText(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/input_Nombre elemento'), 
    'WorkFlow')

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/btn_Nuevo'))

WebUI.delay(3)

'Para crear la ciudad Medellin'
WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Niveles Geograficos/option_Ciudad'))

WebUI.selectOptionByLabel(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Elementos Geograficos/select_Nombre nivel'), 
    'Antioquia', false)

WebUI.setText(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/input_Nombre elemento'), 
    'Medellin')

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/2Elementos Geograficos/Edicion Elemento Geografico/btn_Nuevo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

