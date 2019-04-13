package muyinatech.myjavamodule.easytext.filtering;

import muyinatech.myjavamodule.easytext.analysis.api.Analyzer;
import muyinatech.myjavamodule.easytext.analysis.api.Fast;

import java.util.ServiceLoader;


public class Main {
    public static void main(String args[]) {
        ServiceLoader<Analyzer> analyzers =
                ServiceLoader.load(Analyzer.class);

        analyzers.stream()
                .filter(provider -> isFast(provider.type()))
                .map(ServiceLoader.Provider::get)
                .forEach(analyzer -> System.out.println(analyzer.getName()));
    }

    private static boolean isFast(Class<?> clazz) {
        return clazz.isAnnotationPresent(Fast.class)
                && clazz.getAnnotation(Fast.class).value();

    }
}