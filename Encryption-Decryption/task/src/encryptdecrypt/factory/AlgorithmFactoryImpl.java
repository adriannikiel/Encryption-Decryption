package encryptdecrypt.factory;

import encryptdecrypt.algorithm.*;

public class AlgorithmFactoryImpl extends AlgorithmFactory {

    @Override
    public Algorithm create(String type) {

        switch (type) {
            case "unicode":
                return new UnicodeAlgorithm();
            case "shift":
                return new ShiftAlgorithm();
            default:
                throw new IllegalStateException("Invalid argument -->\t[" + type + "]");
        }
    }

}