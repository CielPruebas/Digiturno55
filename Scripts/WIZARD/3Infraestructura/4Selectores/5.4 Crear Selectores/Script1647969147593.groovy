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

WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Selectores'))

WebUI.delay(3)

'Se escoge Oficina Bogota'
WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/btn_Oficina'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/btn_Oficina(1)/td_1Bogota - CIEL'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/input_Nombre'), 'Bogota Selector 01')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/textarea_Descripcion'), 'Bogota Selector 01')

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/img_Nuevo'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Selectores'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/btn_Oficinas(2)/td_2Cali - Chipichape'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/input_Nombre'), 'Cali Selector 01')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/textarea_Descripcion'), 'Cali Selector 01')

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/img_Nuevo'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Selectores'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/btn_Oficinas(2)/td_3Cartagena - Bocagrande'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/input_Nombre'), 'Cartagena Selector 01')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/textarea_Descripcion'), 'Cartagena Selector 01')

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/img_Nuevo'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Selectores'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/btn_Oficinas(2)/td_4Manizales - Manizales'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/input_Nombre'), 'Manizales Selector 01')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/textarea_Descripcion'), 'Manizales Selector 01')

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/img_Nuevo'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Selectores'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/btn_Oficinas(2)/td_5Medellin - Laureles'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/input_Nombre'), 'Medellin Selector 01')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/textarea_Descripcion'), 'Medellin Selector 01')

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/img_Nuevo'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Selectores'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/btn_Oficinas(2)/td_6Virtual - Oficina Virtual'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/input_Nombre'), 'Virtual Selector 01')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/textarea_Descripcion'), 'Virtual Selector 01')

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/img_Nuevo'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Selectores'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/btn_Oficinas(2)/td_7WorkFlow - Oficina WorkFlow'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/input_Nombre'), 'WorkFlow Selector 01')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/textarea_Descripcion'), 'WorkFlow Selector 01')

WebUI.click(findTestObject('WIZARD/3Infraestructura/4Selectores/Edicion Selectores/img_Nuevo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

