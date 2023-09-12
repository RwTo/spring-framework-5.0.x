package com.rwto.beans.context.xml;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;
import org.springframework.util.StringValueResolver;

import java.util.Set;

/**
 * @author renmw
 * @create 2023/9/12 17:44
 **/
public class ObscenityRemovingBeanFactoryPostProcessor implements BeanFactoryPostProcessor , Ordered {

	private Set<String> obscenities;

	public void setObscenities(Set<String> obscenities) {
		this.obscenities = obscenities;
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		for (String definitionName : beanFactory.getBeanDefinitionNames()) {
			BeanDefinition beanDefinition = beanFactory.getBeanDefinition(definitionName);
			StringValueResolver stringValueResolver = new StringValueResolver(){

				@Override
				public String resolveStringValue(String strVal) {
					if (obscenities.contains(strVal)){
						return "*****";
					}
					return strVal;
				}
			};
			BeanDefinitionVisitor visitor = new BeanDefinitionVisitor(stringValueResolver);
			visitor.visitBeanDefinition(beanDefinition);
		}
	}


	@Override
	/*控制执行顺序，数字小的先执行*/
	public int getOrder() {
		return -1;
	}
}
