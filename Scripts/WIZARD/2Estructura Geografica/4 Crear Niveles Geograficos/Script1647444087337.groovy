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

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/0Arbol Geografico/span_Niveles geograficos'))

WebUI.delay(3)

'Ingresamos Pais'
WebUI.setText(findTestObject('WIZARD/2Estructura Geografica/1Niveles Geograficos/Edicion de niveles geograficos/input_Nombre'), 
    'Pais')

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/1Niveles Geograficos/Edicion de niveles geograficos/btn_Crear'))

WebUI.delay(3)

'Ingresamos Departamento'
WebUI.setText(findTestObject('WIZARD/2Estructura Geografica/1Niveles Geograficos/Edicion de niveles geograficos/input_Nombre'), 
    'Departamento')

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/1Niveles Geograficos/Edicion de niveles geograficos/btn_Crear'))

WebUI.delay(3)

'Ingresamos Ciudad'
WebUI.setText(findTestObject('WIZARD/2Estructura Geografica/1Niveles Geograficos/Edicion de niveles geograficos/input_Nombre'), 
    'Ciudad')

WebUI.click(findTestObject('WIZARD/2Estructura Geografica/1Niveles Geograficos/Edicion de niveles geograficos/btn_Crear'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

