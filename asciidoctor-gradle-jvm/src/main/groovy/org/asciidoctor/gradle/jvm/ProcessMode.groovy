/*
 * Copyright 2013-2019 the original author or authors.
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
package org.asciidoctor.gradle.jvm

import groovy.transform.CompileStatic

/** Ways of execuring Asciidoctor processes.
 *
 * @since 2.0.0
 * @author Schalk W. Cronjé
 */
@CompileStatic
enum ProcessMode {

    /** Use Gradle worker in-process.
     *
     */
    IN_PROCESS,

    /** Use out-of-process Gradle worker.
     *
     */
    OUT_OF_PROCESS,

    /** Use a classic out-of-process Java execution.
     *
     */
    JAVA_EXEC
}