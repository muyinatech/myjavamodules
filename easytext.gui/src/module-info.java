module easytext.gui {
    exports muyinatech.myjavamodule.easytext.gui to javafx.graphics;
    requires javafx.graphics;
    requires javafx.controls;
    requires easytext.analysis.api;
    // Consumer of Analyzer Service implementations
    uses muyinatech.myjavamodule.easytext.analysis.api.Analyzer;
}