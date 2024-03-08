/*
 * Cashfree Payout APIs
 * Cashfree's Payout APIs provide developers with a streamlined pathway to integrate advanced payout capabilities into their applications, platforms and websites.
 *
 * The version of the OpenAPI document: 2024-01-01
 * Contact: developers@cashfree.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cashfree;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-08T11:40:44.940416Z[Etc/UTC]")
class Configuration {
    public static final String VERSION = "0.0.3";

    private static Cashfree.ApiClient defaultApiClient = new Cashfree.ApiClient();

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static Cashfree.ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(Cashfree.ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}
