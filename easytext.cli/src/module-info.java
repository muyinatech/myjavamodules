module easytext.cli {
    requires easytext.analysis.api;

    // Consumer of Analyzer Service implementations
    uses muyinatech.myjavamodule.easytext.analysis.api.Analyzer;
}