/*
 * Copyright 2020 American Express Travel Related Services Company, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.americanexpress.sdk.prefill.exception;

/**
 * The PrefillAuthenticationError class raises an error when invalid API Key or
 * Secret is sent to the API
 */
public class PrefillAuthenticationError extends PrefillException {

	private static final String USER_MESSAGE = "Prefill Authentication Error";

	/**
	 * <p>Constructor for PrefillAuthenticationError.</p>
	 *
	 * @param developerMessage a {@link java.lang.String} object
	 * @param cause a {@link java.lang.Throwable} object
	 */
	public PrefillAuthenticationError(String developerMessage, Throwable cause) {
		super(USER_MESSAGE, developerMessage, cause);
	}

	/**
	 * <p>Constructor for PrefillAuthenticationError.</p>
	 *
	 * @param developerMessage a {@link java.lang.String} object
	 */
	public PrefillAuthenticationError(String developerMessage) {
		super(USER_MESSAGE, developerMessage);
	}
}
