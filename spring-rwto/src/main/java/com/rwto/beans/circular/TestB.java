package com.rwto.beans.circular;

/**
 * @author renmw
 * @create 2023/9/6 17:16
 **/
public class TestB {
	private TestC testC;

	public TestB() {
	}

	public TestB(TestC testC) {
		this.testC = testC;
	}

	public TestC getTestC() {
		return testC;
	}

	public void setTestC(TestC testC) {
		this.testC = testC;
	}

	@Override
	public String toString() {
		return "TestB";
	}
}
