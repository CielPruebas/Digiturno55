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

WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Motivos por oficinas'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/8Motivos por Oficina/Motivos por Oficina/a_clickOficinas'))

'Seleccionamos todas las oficinas'
WebUI.check(findTestObject('WIZARD/3Infraestructura/8Motivos por Oficina/Motivos por Oficina/Label/label_Seleccionar todas las oficinas'))

WebUI.click(findTestObject('WIZARD/3Infraestructura/8Motivos por Oficina/Motivos por Oficina/a_clickOficinas'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/8Motivos por Oficina/Motivos por Oficina/a_SeleccionarTodo'))

WebUI.click(findTestObject('WIZARD/3Infraestructura/8Motivos por Oficina/Motivos por Oficina/a_SeleccionarTodo'))

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/8Motivos por Oficina/Motivos por Oficina/btn_Relacionar oficinas'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

