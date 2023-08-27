package com.rwto.beans;

import org.springframework.stereotype.Component;

/**
 * @author ：Rwto
 * @date ：Created in 2023/8/27 22:49
 * @description：
 */
@Component
public class User {
	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
