package com.rwto.custom.tag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author renmw
 * @create 2023/9/5 19:34
 **/
public class MyNameSpaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
	}
}
