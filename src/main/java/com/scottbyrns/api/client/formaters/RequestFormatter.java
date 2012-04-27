package com.scottbyrns.api.client.formaters;

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
 * Created 4/26/12 8:36 PM
 *
 *
 * A class to provide basic formatting for request strings before they become part of the URL.
 */
public abstract class RequestFormatter
{

    /**
     * Format a string before it is integrated into the URL.
     *
     * @param request The request string.
     * @return The formatted request.
     */
    public abstract String formatRequest (String request);
}
