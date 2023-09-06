package com.rwto.beans.circular;

/**
 * @author renmw
 * @create 2023/9/6 17:15
 **/
public class TestA {

	private TestB testB;


	public TestA() {
	}

	public TestA(TestB testB) {
		this.testB = testB;
	}

	public TestB getTestB() {
		return testB;
	}

	public void setTestB(TestB testB) {
		this.testB = testB;
	}

	@Override
	public String toString() {
		return "TestA";
	}
}
