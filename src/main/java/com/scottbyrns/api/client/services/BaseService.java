package com.scottbyrns.api.client.services;

import com.scottbyrns.api.client.APIClient;
import com.scottbyrns.api.client.APIRequest;

/**
 * Abstraction of behaviors shared between all services.
 */
public class BaseService
{

    protected APIRequest createAPIRequest (String baseUrl)
    {
        return new APIRequest(baseUrl);
    }

    protected APIClient getAPIClient ()
    {
        return APIClient.getInstance();
    }

}
