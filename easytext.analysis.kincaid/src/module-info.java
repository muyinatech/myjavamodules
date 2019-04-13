module easytext.analysis.kincaid {
    requires easytext.analysis.api;

    // provides an implementation of the Analyzer service (Service Provider)
    provides muyinatech.myjavamodule.easytext.analysis.api.Analyzer with muyinatech.myjavamodule.easytext.analysis.kincaid.FleschKincaid;
}