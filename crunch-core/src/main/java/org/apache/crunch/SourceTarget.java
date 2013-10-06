/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.crunch;

/**
 * An interface for classes that implement both the {@code Source} and the
 * {@code Target} interfaces.
 *
 */
public interface SourceTarget<T> extends Source<T>, Target {
  /**
   * Adds the given key-value pair to the {@code Configuration} instance(s) that are used to
   * read and write this {@code SourceTarget<T>}. Allows for multiple inputs and outputs to
   * re-use the same config keys with different values when necessary.
   */
  SourceTarget<T> conf(String key, String value);
}
