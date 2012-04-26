package com.scottbyrns;

import com.scottbyrns.api.client.APIClient;
import com.scottbyrns.api.client.APIRequest;
import com.scottbyrns.api.client.RequestType;
import org.junit.Test;

import static junit.framework.Assert.fail;

/**
 * Copyright (C) 2012 by Scott Byrns
 * http://github.com/scottbyrns
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * <p/>
 * Created 4/25/12 3:26 PM
 */
public class TestClientAPI {

    @Test
    public void testRequestWithoutARequestURL () {
        APIRequest geocoderApiRequest = new APIRequest("http://maps.googleapis.com/maps/api/geocode/json?address={$address}&sensor={$sensor}");
        /*
            Null pointer when no request url is set.
            geocoderApiRequest.setRequestUrl("");
         */

        geocoderApiRequest.setRequestType(RequestType.GET);

        geocoderApiRequest.addRequestParameter("address", "280 N 8th St. Boise, Idaho");
        geocoderApiRequest.addRequestParameter("sensor", "false");

        try {
            APIClient.getInstance().makeRequest(geocoderApiRequest);
        }
        catch (NullPointerException e) {
            fail("A null pointer was thrown when attempting to make the api request.");
        }

    }

    @Test
    public void testRequestWithoutARequestType () {
        APIRequest geocoderApiRequest = new APIRequest("http://maps.googleapis.com/maps/api/geocode/");
        geocoderApiRequest.setRequestUrl("json?address={$address}&sensor={$sensor}");

        /**
         * Null pointer when no request type is set.
         * geocoderApiRequest.setRequestType(RequestType.GET);
         */

        geocoderApiRequest.addRequestParameter("address", "280 N 8th St. Boise, Idaho");
        geocoderApiRequest.addRequestParameter("sensor", "false");

        try {
            APIClient.getInstance().makeRequest(geocoderApiRequest);
        }
        catch (NullPointerException e) {
            fail("A null pointer was thrown when attempting to make an api request.");
        }
    }

    @Test
    public void testRequest () {
        APIRequest geocoderApiRequest = new APIRequest("http://maps.googleapis.com/maps/api/geocode/");
        geocoderApiRequest.setRequestUrl("json?address={$address}&sensor={$sensor}");

        geocoderApiRequest.setRequestType(RequestType.GET);

        geocoderApiRequest.addRequestParameter("address", "280 N 8th St. Boise, Idaho");
        geocoderApiRequest.addRequestParameter("sensor", "false");

        try {
            APIClient.getInstance().makeRequest(geocoderApiRequest);
        }
        catch (IllegalArgumentException e) {
            fail("An illigal argument exception was thrown.");
        }
    }
}
