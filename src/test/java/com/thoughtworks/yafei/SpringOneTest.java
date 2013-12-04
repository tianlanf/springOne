package com.thoughtworks.yafei;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SpringOneTest {
    @org.junit.Test
    public void shouldReturnSpringOneProperly() throws Exception {
        SpringOne springOne = new SpringOne();
        springOne.setName("Yafei");
        String saying = springOne.sayOne();
        assertThat(saying, is("This is spring one created by Yafei"));
    }
}
