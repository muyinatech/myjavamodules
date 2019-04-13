package muyinatech.myjavamodule.easytext.analysis.providers.factory;

import muyinatech.myjavamodule.easytext.analysis.api.Analyzer;

import java.util.List;

public class ExampleProvider implements Analyzer {

    private String name;

    public ExampleProvider(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double analyze(List<List<String>> sentences) {
        return 0;
    }
}