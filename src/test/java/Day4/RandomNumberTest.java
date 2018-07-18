package Day4;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RandomNumberTest {

    @Test
    public void TEST001_random_5() {
        Demo demo = new Demo();
        assertEquals(5, demo.generateNumber(new Random(){
            public int nextInt(int bound){
                return 5;
            }
        }));
    }

    @Test
    public void TEST002_my_random_5() {
        Demo demo = new Demo();
        assertEquals(5, demo.generateMyNumber(new MyRandom(){
            public int nextInt(){
                return 5;
            }
        }));
    }
}
