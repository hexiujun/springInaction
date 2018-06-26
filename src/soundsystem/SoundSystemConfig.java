package soundsystem;

//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by j on 2017/7/5.
 */
@Configuration
//@ComponentScan
@Import(CDPlayerConfig.class)
@ImportResource("cd-config.xml")
public class SoundSystemConfig {
}
