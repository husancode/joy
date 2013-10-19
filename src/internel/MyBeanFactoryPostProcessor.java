package internel;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import bean.Service;

/**
 * @author husan
 * @Date 2013-10-17
 * @description
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{
	
	public void postProcessBeanFactory(
			ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(beanFactory.getBeanPostProcessorCount());
		/*Service service = (Service)beanFactory.getBean("service");
		service.do1();
		System.out.println(service);*/
	}

}
