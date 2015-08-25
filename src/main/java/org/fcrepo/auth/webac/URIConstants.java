/**
 * Copyright 2015 DuraSpace, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fcrepo.auth.webac;

import java.net.URI;

/**
 * URIs used by the WebAC module.
 *
 * @author Peter Eichman
 * @since Aug 25, 2015
 * @see <a href="http://www.w3.org/wiki/WebAccessControl/Vocabulary">
 *      http://www.w3.org/wiki/WebAccessControl/Vocabulary</a>
 * @see <a href="http://www.w3.org/ns/auth/acl">http://www.w3.org/ns/auth/acl</a>
 */
public class URIConstants {

    /**
     * Namespace for the W3C WebAC vocabulary.
     */
    public static final String WEBAC_NAMESPACE_VALUE = "http://www.w3.org/ns/auth/acl#";

    /**
     * Namespace for the W3C WebAC vocabulary.
     */
    public static final URI WEBAC_NAMESPACE = URI.create(WEBAC_NAMESPACE_VALUE);

    /**
     * Read access mode.
     */
    public static final String WEBAC_MODE_READ_VALUE = WEBAC_NAMESPACE_VALUE + "Read";

    /**
     * Read access mode.
     */
    public static final URI WEBAC_MODE_READ = URI.create(WEBAC_MODE_READ_VALUE);

    /**
     * Write access mode.
     */
    public static final String WEBAC_MODE_WRITE_VALUE = WEBAC_NAMESPACE_VALUE + "Write";

    /**
     * Write access mode.
     */
    public static final URI WEBAC_MODE_WRITE = URI.create(WEBAC_MODE_WRITE_VALUE);

    /**
     * Append access mode.
     */
    public static final String WEBAC_MODE_APPEND_VALUE = WEBAC_NAMESPACE_VALUE + "Append";

    /**
     * Append access mode.
     */
    public static final URI WEBAC_MODE_APPEND = URI.create(WEBAC_MODE_APPEND_VALUE);

    /**
     * Control access mode.
     */
    public static final String WEBAC_MODE_CONTROL_VALUE = WEBAC_NAMESPACE_VALUE + "Control";

    /**
     * Control access mode.
     */
    public static final URI WEBAC_MODE_CONTROL = URI.create(WEBAC_MODE_CONTROL_VALUE);

    private URIConstants() {
    }
}