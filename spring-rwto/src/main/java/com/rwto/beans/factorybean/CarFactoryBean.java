package com.rwto.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author renmw
 * @create 2023/9/6 14:23
 **/
public class CarFactoryBean implements FactoryBean<Car> {

	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		car.setName("兰博基尼");
		car.setPrice("一百万");
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	@Override
	public String toString() {
		return "CarFactoryBean";
	}
}
