package com.mulesoft.training;

//import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenFaildTest extends FunctionalTestCase {

    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("maven-demoFlow", "this is the demo Faild");
    }
    
    @Override
    protected String getConfigFile() {
        return "maven-demo.xml";
    }

}
