package soundsystem;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by j on 2017/7/4.
 */
@RunWith (SpringJUnit4ClassRunner.class)
@ContextConfiguration (classes = SoundSystemConfig.class)
public class CDPlayerTest {
    private final String separator = System.getProperty("line.separator");

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    public void setPlayer(MediaPlayer player) {
        this.player = player;
    }

    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void play() {
        player.play();
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band" + " by The Beatles" + separator, log.getLog());
    }
}
