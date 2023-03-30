package FactoryPattern;

import FactoryPattern.Models.*;

public class FactoryPattern {
    public static void main(String[] args) {
        Envelopes env1 = EnvelopesFactory.getEnvelopes(Size.A4, 20.0);
        Envelopes env2 = EnvelopesFactory.getEnvelopes(Size.A5, 10.0);
        Envelopes env3 = EnvelopesFactory.getEnvelopes(Size.A6, 5.0);

        System.out.println(env1);
        System.out.println(env2);
        System.out.println(env3);

    }
}
