package FactoryPattern;

import FactoryPattern.Models.*;

public class FactoryPattern {
    public static void main(String[] args) {
        Envelopes env1 = EnvelopesFactory.getEnvelopes("A4", "20g");
        Envelopes env2 = EnvelopesFactory.getEnvelopes("A5", null);
        Envelopes env3 = EnvelopesFactory.getEnvelopes("A6", "5");
        Envelopes env4 = EnvelopesFactory.getEnvelopes(null, "250");


        System.out.println(env1);
        System.out.println(env2);
        System.out.println(env3);
        System.out.println(env4);
    }
}
