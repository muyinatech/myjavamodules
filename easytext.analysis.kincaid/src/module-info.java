module easytext.analysis.kincaid {
    requires easytext.analysis.api;

    provides muyinatech.myjavamodule.easytext.analysis.api.Analyzer with muyinatech.myjavamodule.easytext.analysis.kincaid.FleschKincaid;
}