package com.rwto.beans.circular;

/**
 * @author renmw
 * @create 2023/9/6 17:16
 **/
public class TestC {
	private TestA testA;

	public TestC() {
	}

	public TestC(TestA testA) {
		this.testA = testA;
	}

	public TestA getTestA() {
		return testA;
	}

	public void setTestA(TestA testA) {
		this.testA = testA;
	}

	@Override
	public String toString() {
		return "TestC";
	}
}
