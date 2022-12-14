/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package group6;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import group6.ApplicationPortlet;

/**
 * TestApplicationPortlet
 *
 * @author <a href="mailto:"></a>
 * @version $Id:$
 */
public class TestApplicationPortlet extends TestCase
{
    /**
     * Class specific log instance.
     */
    private final static Log log = LogFactory.getLog(TestApplicationPortlet.class);

    /**
     * Main test runner entry point.
     */
    public static void main(String args[])
    {
        junit.awtui.TestRunner.main(new String[]{TestApplicationPortlet.class.getName()});
    }
    
    /**
     * Test suite configuration for test*() methods in this class.
     */
    public static Test suite()
    {
        return new TestSuite(TestApplicationPortlet.class);
    }
    
    /**
     * Setup protocol method.
     */
    protected void setUp() throws Exception
    {
        super.setUp();        
    }

    /**
     * Cleanup protocol method.
     */
    protected void tearDown() throws Exception
    {
        super.tearDown();        
    }

    /**
     * Unit test method.
     */
    public void testApplicationPortlet() throws Exception
    {
        log.info("TestApplicationPortlet start...");

        log.info("TestApplicationPortlet testing: " + ApplicationPortlet.class.getName());

        log.info("TestApplicationPortlet done.");
    }
}
