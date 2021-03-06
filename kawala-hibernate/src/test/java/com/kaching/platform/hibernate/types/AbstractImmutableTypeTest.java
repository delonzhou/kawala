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
package com.kaching.platform.hibernate.types;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.Serializable;

import org.junit.Before;
import org.junit.Test;

public class AbstractImmutableTypeTest {

  private AbstractImmutableType type;
  private Serializable serializable;

  @Before
  public void before() {
    type = new AbstractImmutableType() {
    };
    serializable = new Serializable() {
      private static final long serialVersionUID = 1L;
    };
  }
  
  @Test
  public void assemble() {
    assertEquals(serializable, type.assemble(serializable, null));
    assertEquals(serializable, type.assemble(serializable, null, null));
  }
  
  @Test
  public void deepCopy() {
    assertEquals(serializable, type.deepCopy(serializable));
  }
  
  @Test
  public void disassemble() {
    assertEquals(serializable, type.disassemble(serializable));
    assertEquals(serializable, type.disassemble(serializable, null));
  }
  
  @Test
  public void isMutable() {
    assertFalse(type.isMutable());
  }
  
}
