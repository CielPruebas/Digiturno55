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

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/a_1lnkLogo'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/img_2Configuracion'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/img_3Usuarios'))

WebUI.delay(3)

WebUI.comment('Oficina Bogota')

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/img_4Usuariosen terminales'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Oficinas/td1_Bogota - CIEL'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/td_6CIEL'))

WebUI.delay(3)

'Agregar todos los selectores'
WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/a_SeleccionarTodo'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/img_Agregar selectores'))

WebUI.delay(3)

'Agregar todas las Terminales'
WebUI.scrollToElement(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Terminales Disponibles/img_AgregarTerminales'), 
    2)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Terminales Disponibles/a_SeleccionarTodo'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'cPHPri_menuEdicionAgregarTerminales_imgActualizar\').click()', 
    [])

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.back()

WebUI.comment('Oficina Cali')

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/img_4Usuariosen terminales'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Oficinas/td2_Cali - Chipichape'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/td_6CIEL'))

WebUI.delay(3)

'Agregar todos los selectores'
WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/a_SeleccionarTodo'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/img_Agregar selectores'))

WebUI.delay(3)

'Agregar todas las Terminales'
WebUI.scrollToElement(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Terminales Disponibles/img_AgregarTerminales'), 
    2)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Terminales Disponibles/a_SeleccionarTodo'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'cPHPri_menuEdicionAgregarTerminales_imgActualizar\').click()', 
    [])

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.back()

WebUI.comment('Oficina Cartagena')

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/img_4Usuariosen terminales'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Oficinas/td3_Cartagena - Bocagrande'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/td_6CIEL'))

WebUI.delay(3)

'Agregar todos los selectores'
WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/a_SeleccionarTodo'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/img_Agregar selectores'))

WebUI.delay(3)

'Agregar todas las Terminales'
WebUI.scrollToElement(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Terminales Disponibles/img_AgregarTerminales'), 
    2)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Terminales Disponibles/a_SeleccionarTodo'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'cPHPri_menuEdicionAgregarTerminales_imgActualizar\').click()', 
    [])

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.back()

WebUI.comment('Oficina Manizales')

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/img_4Usuariosen terminales'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Oficinas/td4_Manizales - Manizales'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/td_6CIEL'))

WebUI.delay(3)

'Agregar todos los selectores'
WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/a_SeleccionarTodo'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/img_Agregar selectores'))

WebUI.delay(3)

'Agregar todas las Terminales'
WebUI.scrollToElement(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Terminales Disponibles/img_AgregarTerminales'), 
    2)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Terminales Disponibles/a_SeleccionarTodo'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'cPHPri_menuEdicionAgregarTerminales_imgActualizar\').click()', 
    [])

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.back()

WebUI.comment('Oficina Medellin')

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/img_4Usuariosen terminales'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Oficinas/td5_Medellin - Laureles'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/td_6CIEL'))

WebUI.delay(3)

'Agregar todos los selectores'
WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/a_SeleccionarTodo'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/img_Agregar selectores'))

WebUI.delay(3)

'Agregar todas las Terminales'
WebUI.scrollToElement(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Terminales Disponibles/img_AgregarTerminales'), 
    2)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Terminales Disponibles/a_SeleccionarTodo'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'cPHPri_menuEdicionAgregarTerminales_imgActualizar\').click()', 
    [])

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.back()

WebUI.comment('Oficina Virtual')

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/img_4Usuariosen terminales'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Oficinas/td6_Virtual - Oficina Virtual'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/td_6CIEL'))

WebUI.delay(3)

'Agregar todos los selectores'
WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/a_SeleccionarTodo'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/img_Agregar selectores'))

WebUI.delay(3)

'Agregar todas las Terminales'
WebUI.scrollToElement(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Terminales Disponibles/img_AgregarTerminales'), 
    2)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Terminales Disponibles/a_SeleccionarTodo'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'cPHPri_menuEdicionAgregarTerminales_imgActualizar\').click()', 
    [])

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.back()

WebUI.comment('Oficina WorkFlow')

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/img_4Usuariosen terminales'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Oficinas/td7_WorkFlow - Oficina WorkFlow'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/td_6CIEL'))

WebUI.delay(3)

'Agregar todos los selectores'
WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/a_SeleccionarTodo'))

WebUI.delay(3)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Selectores Disponibles/img_Agregar selectores'))

WebUI.delay(3)

'Agregar todas las Terminales'
WebUI.scrollToElement(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Terminales Disponibles/img_AgregarTerminales'), 
    2)

WebUI.click(findTestObject('WIZARD/4Configuracion Terminales Y Selectores/Usuarios en terminales/Terminales Disponibles/a_SeleccionarTodo'))

WebUI.delay(3)

WebUI.executeJavaScript('return document.getElementById(\'cPHPri_menuEdicionAgregarTerminales_imgActualizar\').click()', 
    [])

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.back()

