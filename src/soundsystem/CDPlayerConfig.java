package soundsystem;

import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by j on 2017/7/4.
 */
@Configuration
// @ComponentScan(basePackages = "soundsystem")
// or @ComponentScan(basePackageClasses = CDPlayer.class)
// @Import(CDConfig.class)
@ImportResource("cd-config.xml")
public class CDPlayerConfig {

//    @Bean   // DI method 1
//    public CDPlayer cdPlayer() {
//        return new CDPlayer(sgtPeppers());
//    }

    @Bean   // DI method 2
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
