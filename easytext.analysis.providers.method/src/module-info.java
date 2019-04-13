module easytext.analysis.providers.method {

    requires easytext.analysis.api;

    provides muyinatech.myjavamodule.easytext.analysis.api.Analyzer
            with muyinatech.myjavamodule.easytext.analysis.providers.method.ExampleProviderMethod;
}