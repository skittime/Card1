package lesson9;

import java.util.ArrayList;

public class V2Radiator {
    V2Radiator(ArrayList list) {
        for (int x = 0; x < 5; x++) {
            list.add(new SimUnit("V2Radiator"));

        }
    }
}

class V3Radiator extends V2Radiator {
    V3Radiator(ArrayList lglist) {
        super(lglist);
        for (int g = 0; g < 10; g++) {
            lglist.add(new SimUnit("V3Radiatpr"));

        }
    }
}

class RetentionBot {
    RetentionBot(ArrayList rlist) {
        rlist.add(new SimUnit("Тепловая машина"));

    }
}

class SimUnit {
    String botType;
    int unitNext = 0;

    SimUnit(String type) {
        botType = type;
        System.out.println("Новая машина создана " + unitNext);
    }


    int powerUse() {
        if ("Тепловая машина".equals(botType)) {
            return 2;
        } else {
            return 4;
        }
    }
}

