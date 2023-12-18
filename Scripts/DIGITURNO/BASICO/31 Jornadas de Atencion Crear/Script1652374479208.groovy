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

WebUI.callTestCase(findTestCase('DIGITURNO/BASICO/3 Configuracion'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/0Principal/img_3Jornadas de atencion'))

WebUI.delay(2)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/3Jornadas de Atencion/0Modal Inicial Oficinas/td_1Bogota - CIEL'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/3Jornadas de Atencion/Edicion/btn_SeleccionarOficina'))

WebUI.delay(3)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/3Jornadas de Atencion/Edicion/btn_SeleccionarOficina(1)/td_1Bogota - CIEL'))

WebUI.delay(3)

WebUI.check(findTestObject('DIGITURNO/CONFIGURACION/3Jornadas de Atencion/Edicion/Label/label_Habilitada'))

WebUI.delay(3)

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/3Jornadas de Atencion/Edicion/input_Nombre'), 'Prueba')

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/3Jornadas de Atencion/Edicion/textarea_Descripcion'), 'Prueba')

'Cambiar prioridad para que no se repita con otra'
WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/3Jornadas de Atencion/Edicion/input_Prioridad'), '9')

'Fecha inicio Formato dd/mm/aaaa'
WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/3Jornadas de Atencion/Edicion/input_Fecha inicio ddmmaaaa'), '12/05/2022')

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/3Jornadas de Atencion/Edicion/input_Fecha Inicio HH'), '08')

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/3Jornadas de Atencion/Edicion/input_Fecha Inicio MM'), '00')

WebUI.delay(3)

'Fecha Fin Formato dd/mm/aaaa'
WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/3Jornadas de Atencion/Edicion/input_Fecha fin ddmmaaaa'), '30/06/2022')

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/3Jornadas de Atencion/Edicion/input_Fecha Fin HH'), '18')

WebUI.setText(findTestObject('DIGITURNO/CONFIGURACION/3Jornadas de Atencion/Edicion/input_Fecha Fin MM'), '00')

WebUI.delay(3)

WebUI.scrollToPosition(0, 700)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/3Jornadas de Atencion/Edicion/Label/label_Semanal'))

WebUI.delay(2)

WebUI.check(findTestObject('DIGITURNO/CONFIGURACION/3Jornadas de Atencion/Edicion/Label/label_Semanal(1)/label_lunes'))

WebUI.check(findTestObject('DIGITURNO/CONFIGURACION/3Jornadas de Atencion/Edicion/Label/label_Semanal(1)/label_martes'))

WebUI.check(findTestObject('DIGITURNO/CONFIGURACION/3Jornadas de Atencion/Edicion/Label/label_Semanal(1)/label_miercoles'))

WebUI.check(findTestObject('DIGITURNO/CONFIGURACION/3Jornadas de Atencion/Edicion/Label/label_Semanal(1)/label_jueves'))

WebUI.check(findTestObject('DIGITURNO/CONFIGURACION/3Jornadas de Atencion/Edicion/Label/label_Semanal(1)/label_viernes'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('DIGITURNO/CONFIGURACION/3Jornadas de Atencion/Edicion/img_Nuevo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

