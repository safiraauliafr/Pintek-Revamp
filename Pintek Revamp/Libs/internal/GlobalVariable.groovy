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
    public static Object baseUrl1
     
    /**
     * <p></p>
     */
    public static Object baseUrl2
     
    /**
     * <p></p>
     */
    public static Object baseUrl3
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            baseUrl = selectedVariables['baseUrl']
            baseUrl1 = selectedVariables['baseUrl1']
            baseUrl2 = selectedVariables['baseUrl2']
            baseUrl3 = selectedVariables['baseUrl3']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
