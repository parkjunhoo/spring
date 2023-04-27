package exam01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import app3.MyBeanStyle;

public class TVUser {
	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("/config/bean.xml");
		BeanFactory bf = new XmlBeanFactory(res);
		
		TV tv =(TV)bf.getBean("tv1");
		TV lgtv =(TV)bf.getBean("tv2");
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		lgtv.powerOn();
		lgtv.volumeUp();
		lgtv.volumeDown();
		lgtv.powerOff();
	}

}
