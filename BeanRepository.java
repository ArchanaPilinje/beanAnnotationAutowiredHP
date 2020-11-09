package hp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanRepository {

	@Bean
	public HP getHP() {
		return new HP();
	}
	
	@Bean
	public Printer getPrinter() {
		return new Printer(1080,240,"RGB");
	}
	
	@Bean
	public Laptop getLaptop() {
		return new Laptop("i3",13.6f,4);
	}
	
	@Bean
	public Display getDisplay() {
		return new Display(1080,13.6f);
	}
}
