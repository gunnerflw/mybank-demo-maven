package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	@Test
	public void testDataService() throws Exception{
		System.out.println("openshift pipelines maven test......");
		Assert.assertEquals(1,2);
	}
	
	@Test
	public void AppTest() {
		System.out.println("tekton maven task......");
		Assert.assertEquals(1,1);
	}
	
	@Test
        public void AppTest1() {
                System.out.println("tekton maven task......");
                Assert.assertTrue(1==2);
        }
	

}
