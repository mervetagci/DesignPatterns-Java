package com.design.patterns.FactoryDesignPattern;
import com.design.patterns.FactoryDesignPattern.LocalizationFiles.LocalTr;
import com.design.patterns.FactoryDesignPattern.LocalizationFiles.LocalEn;
import java.util.Locale;
import java.util.logging.Logger;

public class FactoryClass {
    Logger logger = Logger.getLogger(getClass().getName());
    //This constructor method written for sonar lint test issues
    private FactoryClass(){
    logger.info("constructor runs");
    }
    public static void printMessage(Locale locale) {
        switch (locale.getLanguage()) {
            case "en":
                new LocalEn().generateTerminalMessage("Maria");
                break;
            case "tr":
                new LocalTr().generateTerminalMessage("Merve");
                break;
            default:
                throw new IllegalArgumentException("Not supported Local era!");
        }
    }
}
