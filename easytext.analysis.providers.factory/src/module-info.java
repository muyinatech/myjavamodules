module easytext.analysis.providers.factory {
    requires easytext.analysis.api;

    provides muyinatech.myjavamodule.easytext.analysis.api.Analyzer
            with muyinatech.myjavamodule.easytext.analysis.providers.factory.ExampleProviderFactory;
}