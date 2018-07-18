package Day4;

import java.util.Random;

interface MyRandom{
    int nextInt();
}

public class Demo {

    public int generateNumber(Random random){
        return random.nextInt(10);
    }

    public int generateMyNumber(MyRandom random){
        return random.nextInt();
    }
}
