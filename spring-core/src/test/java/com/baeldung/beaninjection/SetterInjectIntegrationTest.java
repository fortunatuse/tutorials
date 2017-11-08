package com.baeldung.beaninjection;

import com.baeldung.configuration.ApplicationContextTestInjectBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
  loader = AnnotationConfigContextLoader.class,
  classes = ApplicationContextTestInjectBean.class)
public class SetterInjectIntegrationTest {

    private Asset asset;

    @Autowired
    public void  setAsset(Asset asset){
        this.asset = asset;
    }


    @Test
    public void givenAutowiredAnnotation_WhenOnSetter_ThenBeanInjected() {

        assertNotNull(asset);
        assertEquals("My Asset", asset.getName());
    }
}
