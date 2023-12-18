package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : Url digiturno</p>
     */
    public static Object UrlDigiturno
     
    /**
     * <p>Profile default : Url Servicios de digiturno</p>
     */
    public static Object UrlServicios
     
    /**
     * <p>Profile default : Para subir un archivo de prueba PDF</p>
     */
    public static Object ArchivoUpload
     
    /**
     * <p>Profile default : Url para solicitar cita en Video atenci&oacute;n</p>
     */
    public static Object UrlVideoAtencion
     
    /**
     * <p>Profile default : Abrir direcci&oacute;n url terminal 1 Bogot&aacute;</p>
     */
    public static Object UrlTerminal1
     
    /**
     * <p>Profile default : Para abrir url terminal 4 Cali</p>
     */
    public static Object UrlTerminal4
     
    /**
     * <p></p>
     */
    public static Object PDFile
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            UrlDigiturno = selectedVariables['UrlDigiturno']
            UrlServicios = selectedVariables['UrlServicios']
            ArchivoUpload = selectedVariables['ArchivoUpload']
            UrlVideoAtencion = selectedVariables['UrlVideoAtencion']
            UrlTerminal1 = selectedVariables['UrlTerminal1']
            UrlTerminal4 = selectedVariables['UrlTerminal4']
            PDFile = selectedVariables['PDFile']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
