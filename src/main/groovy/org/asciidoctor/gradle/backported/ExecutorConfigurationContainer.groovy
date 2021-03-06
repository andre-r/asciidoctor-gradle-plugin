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
package org.asciidoctor.gradle.backported

import groovy.transform.CompileStatic

/** Contains a number of executor configurations.
 *
 * @since 1.5.9 (Backported from 2.0)
 * @author Schalk W. Cronjé
 */
@CompileStatic
class ExecutorConfigurationContainer implements Serializable {
    final List<ExecutorConfiguration> configurations

    ExecutorConfigurationContainer(Iterable<ExecutorConfiguration> list) {
        this.configurations = list as List<ExecutorConfiguration>
    }

    ExecutorConfigurationContainer(ExecutorConfiguration single) {
        this.configurations = [single]
    }

    /** Writes a collection of {@link ExecutorConfiguration} to a file.
     *
     * @param destinationFile File to serialise exector configurations.
     * @param configs Executor configurations.
     */
    static void toFile(final File destinationFile,final Iterable<ExecutorConfiguration> configs) {
        destinationFile.withOutputStream { fout ->
            new ObjectOutputStream(fout).withCloseable { oos ->
                oos.writeObject(
                    new ExecutorConfigurationContainer(configs)
                )
            }
        }
    }
}

