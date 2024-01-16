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
package com.americanexpress.sdk.prefill.configuration;

import lombok.Getter;
import lombok.Setter;

import java.security.interfaces.RSAPublicKey;

/**
 * This JWE configuration class holds the JWE Payload encryption builder
 * configuration
 */
@Getter
@Setter
public class JWEConfig {

	/**
	 * is JWE Payload Encryption enabled
	 */
	private boolean isJWEEncryptionEnabled;

	/**
	 * JWE Payload Public Key
	 */
	private RSAPublicKey publicKey;


	/**
	 * <p>Constructor for JWEConfig.</p>
	 *
	 * @param isJWEEncryptionEnabled a boolean
	 * @param publicKey a {@link java.security.interfaces.RSAPublicKey} object
	 */
	public JWEConfig(boolean isJWEEncryptionEnabled, RSAPublicKey publicKey) {
		this.isJWEEncryptionEnabled = isJWEEncryptionEnabled;
		this.publicKey = publicKey;
	}

	/**
	 * <p>Constructor for JWEConfig.</p>
	 *
	 * @param isJWEEncryptionEnabled a boolean
	 */
	public JWEConfig(boolean isJWEEncryptionEnabled) {
		this.isJWEEncryptionEnabled = isJWEEncryptionEnabled;
	}

}
