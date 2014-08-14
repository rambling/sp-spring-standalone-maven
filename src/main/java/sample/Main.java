package sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.service.HelloService;

public class Main {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {

		final AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("classpath:META-INF/spring/*-context.xml");

		final HelloService service = context.getBean(HelloService.class);

		if (logger.isInfoEnabled()) {
			logger.info(service.getMessage());
		}
	}

}
