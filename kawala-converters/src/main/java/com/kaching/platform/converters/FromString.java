/**
 * Copyright 2010 Wealthfront Inc. Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.kaching.platform.converters;

public interface FromString<T> {

  /**
   * Converts a textual representation into a value.
   * Throws an {@link IllegalArgumentException} if the value cannot be converted.
   * @param the textual representation to convert.
   * @return the value represented by the textual representation.
   */
  T fromString(String representation);

}
