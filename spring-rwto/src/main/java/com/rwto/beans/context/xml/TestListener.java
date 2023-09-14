package com.rwto.beans.context.xml;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author renmw
 * @create 2023/9/14 16:37
 **/
public class TestListener implements ApplicationListener<TestEvent> {


	@Override
	public void onApplicationEvent(TestEvent event) {
		event.print();
	}
}
