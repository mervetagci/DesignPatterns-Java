package com.design.patterns.FactoryDesignPattern.LocalizationFiles;
import com.design.patterns.FactoryDesignPattern.LocalizationFactory;

public class LocalTr implements LocalizationFactory {
    //Override function inside interface
    @Override
    public void generateTerminalMessage(String messageParam) {
        System.out.println("Merhaba! Benim ismim " + messageParam);
    }
}
