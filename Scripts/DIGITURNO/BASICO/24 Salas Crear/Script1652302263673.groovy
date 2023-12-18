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

WebUI.callTestCase(findTestCase('DIGITURNO/BASICO/21 Distribucion Geografica'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/0Principal/img_3Salas'))

WebUI.delay(2)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/3Salas/0Modal Inicial Oficinas/td_1Bogota - CIEL'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/3Salas/Edicion/btn_SeleccionarOficina'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/3Salas/Edicion/btn_SeleccionarOficina(1)/a_Bogota - CIEL'))

WebUI.delay(3)

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/3Salas/Edicion/input_Nombre'), 'Prueba')

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/3Salas/Edicion/textarea_Descripcion'), 'Prueba')

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/3Salas/Edicion/input_Maximo de ocupacion'), 
    '100')

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/3Salas/Edicion/input_Promesa de Espera MM'), 
    '5')

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/3Salas/Edicion/input_Promesa de Atencion MM'), 
    '5')

WebUI.check(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/3Salas/Edicion/label_Nivelar llamados en terminales'))

WebUI.delay(3)

WebUI.check(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/3Salas/Edicion/label_Habilitar agendamiento'))

WebUI.scrollToElement(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/3Salas/Edicion/label_Habilitar agendamiento'), 
    2)

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/3Salas/Edicion/Agendamiento de llamado/input_Intervalo creacion MM'), 
    '5')

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/3Salas/Edicion/Agendamiento de llamado/input_Tiempo Limite de creacion HH'))

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/3Salas/Edicion/Agendamiento de llamado/input_Tiempo Limite de creacion HH'), 
    '23')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/3Salas/Edicion/Agendamiento de llamado/input_Tiempo Limite de creacion MM'))

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/3Salas/Edicion/Agendamiento de llamado/input_Tiempo Limite de creacion MM'), 
    '59')

WebUI.delay(3)

WebUI.check(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/3Salas/Edicion/label_Paso a distraido'))

WebUI.delay(2)

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/3Salas/Edicion/Distraidos/input_Tiempo automatico a Distraido SS'), 
    '45')

WebUI.delay(1)

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/3Salas/Edicion/Distraidos/input_Tiempo de Rellamado MM'), 
    '3')

WebUI.scrollToPosition(0, 2)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/2Distribucion Geografica/3Salas/Edicion/img_Nuevo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

