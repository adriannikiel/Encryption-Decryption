package encryptdecrypt.factory;

import encryptdecrypt.algorithm.Algorithm;

public abstract class AlgorithmFactory {

    public abstract Algorithm create(String type);
}
