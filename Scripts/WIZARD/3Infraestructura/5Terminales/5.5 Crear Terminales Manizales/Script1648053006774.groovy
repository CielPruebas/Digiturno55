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

'inicio Manizales informacion'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Terminales'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/5Terminales/0OficinasModal/td_4Manizales - Manizales'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/btn_SeleccionarGrupo'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/btn_Seleccionar Grupo(1)/a_Grupo General'))

WebUI.delay(3)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/input_Nombre'), 'A01')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/textarea_Descripcion'), 'Manizales - Terminal - Informacion')

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/Label/label_Mostrar ventana emergente'), 
    2)

WebUI.check(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/Label/label_Mostrar ventana emergente'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/img_Nuevo'))

WebUI.delay(3)

'inicio Manizales PQRS'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Terminales'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/5Terminales/0OficinasModal/td_4Manizales - Manizales'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/btn_SeleccionarGrupo'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/btn_Seleccionar Grupo(1)/a_Grupo PQRS'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/input_Nombre'), 2)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/input_Nombre'), 'A02')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/textarea_Descripcion'), 'Manizales - Terminal - PQRS')

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/Label/label_Mostrar ventana emergente'), 
    2)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/input_Direccion en sala'), '2')

WebUI.check(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/Label/label_Mostrar ventana emergente'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/img_Nuevo'))

WebUI.delay(3)

'inicio Manizales Radicaciones'
WebUI.click(findTestObject('WIZARD/3Infraestructura/0Menu/span_Terminales'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/5Terminales/0OficinasModal/td_4Manizales - Manizales'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/btn_SeleccionarGrupo'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/btn_Seleccionar Grupo(1)/a_Grupo Radicaciones'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/input_Nombre'), 2)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/input_Nombre'), 'A03')

WebUI.setText(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/textarea_Descripcion'), 'Manizales - Terminal - Radicaciones')

WebUI.scrollToElement(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/Label/label_Mostrar ventana emergente'), 
    2)

WebUI.setText(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/input_Direccion en sala'), '3')

WebUI.check(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/Label/label_Mostrar ventana emergente'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('WIZARD/3Infraestructura/5Terminales/Edicion/img_Nuevo'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

