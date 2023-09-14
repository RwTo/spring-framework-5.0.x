package com.rwto.beans.context.xml;

import org.springframework.context.ApplicationEvent;

/**
 * @author renmw
 * @create 2023/9/14 16:36
 **/
public class TestEvent extends ApplicationEvent {

	private String msg;
	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public TestEvent(Object source) {
		super(source);
	}

	public TestEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	public void print(){
		System.out.println("listener:"+msg);
	}
}
