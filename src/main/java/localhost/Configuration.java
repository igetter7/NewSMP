/*
 * NewSMPShopManagementPlatformLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package localhost;

import java.util.HashMap;
import java.util.Map;

import localhost.models.*;

public class Configuration {
    //OAuth 2 Client ID
    //TODO: Replace the oAuthClientId with an appropriate value
    public static String oAuthClientId = "TODO: Replace";

    //OAuth 2 Redirection endpoint or Callback Uri
    //TODO: Replace the oAuthRedirectUri with an appropriate value
    public static String oAuthRedirectUri = "TODO: Replace";

    /**
     * Current API environment
     */
    public static Environments environment = Environments.PRODUCTION;

    /**
     *  brandMongodbId value
     */
    public static String brandMongodbId = "DefaultParameterValue";

    /**
     * Get base URI by current environment
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public static String getBaseUri(Servers server) {
        StringBuilder baseUrl = new StringBuilder(environmentMapper(Configuration.environment, server));
        Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("brand_mongodb_id", Configuration.brandMongodbId);
        APIHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }
    
    /**
     * Get base URI by current environment
     * @return Processed base URI
     */
    public static String getBaseUri() {
        return Configuration.getBaseUri(Servers.SERVER_1);
    }
    
    /**
     * Base URLs by environments and server aliases 
     */

    private static String environmentMapper(Environments environments, Servers servers) {
		String url = "";
		if(environments.equals(Environments.PRODUCTION)) {
			if(servers.equals(Servers.SERVER_1))
				url = "http://localhost/smp/api/brand/{brand_mongodb_id}";
			if(servers.equals(Servers.AUTH_SERVER))
				url = "http://example.com";
		}
		return url;
	}
}
