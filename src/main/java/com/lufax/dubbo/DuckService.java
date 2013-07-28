package com.lufax.dubbo;

import org.duckapter.Duck;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DuckService<T> implements ApplicationContextAware, FactoryBean<T> {

	private Object service;
	private Class<T> interfaceName;
	private ApplicationContext context;

	private transient T instance;

	public T getObject() throws Exception {
		if (null == instance) {
			instance = Duck.type(service, interfaceName);
		}
		return instance;
	}

	public Class<T> getObjectType() {
		return interfaceName;
	}

	public boolean isSingleton() {
		return true;
	}

	public void setApplicationContext(ApplicationContext cxt)
			throws BeansException {
		this.context = cxt;
	}

	public Object getService() {
		return service;
	}

	public void setService(Object service) {
		this.service = service;
	}

	public Class<T> getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName(Class<T> interfaceName) {
		this.interfaceName = interfaceName;
	}

}
