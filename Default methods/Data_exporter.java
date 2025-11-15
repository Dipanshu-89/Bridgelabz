interface Exporter {
    void export();

    default void exportToJSON() {
        System.out.println("Exporting to JSON...");
    }
}

class CSVExporter implements Exporter {
    public void export() { System.out.println("CSV Exported"); }
}

class DemoExport {
    public static void main(String[] args) {
        Exporter e = new CSVExporter();
        e.export();
        e.exportToJSON();
    }
}

