package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object baseUrl
     
    /**
     * <p></p>
     */
    public static Object successCode
     
    /**
     * <p></p>
     */
    public static Object globalId
     
    /**
     * <p></p>
     */
    public static Object response
     
    /**
     * <p></p>
     */
    public static Object getid
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            baseUrl = selectedVariables['baseUrl']
            successCode = selectedVariables['successCode']
            globalId = selectedVariables['globalId']
            response = selectedVariables['response']
            getid = selectedVariables['getid']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
