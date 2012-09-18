/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.milton.http.http11;

import io.milton.http.Request;
import io.milton.resource.Resource;
import io.milton.http.Response;
import io.milton.http.Response.Status;

/**
 * Used to generate error pages from ResponseHandlers.
 * 
 * Can be customised to produce custom pages, such as by including JSP's etc
 *
 * @author brad
 */
public interface ContentGenerator {
	/**
	 * Generate an error page for the given status
	 * 
	 * @param request
	 * @param response
	 * @param status 
	 */
	void generate(Resource resource, Request request, Response response, Status status);
	
}
