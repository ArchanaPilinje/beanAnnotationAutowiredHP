package hp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HpApplication {

	public static void main(String[] args) {
		SpringApplication.run(HpApplication.class, args);
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanRepository.class);
		HP x=ctx.getBean(HP.class);
		System.out.println(x);
	}

}
