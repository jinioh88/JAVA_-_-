package com.example.java_design.ch6;

import java.util.ArrayList;
import java.util.List;

public class PrinterManager {
    private static PrinterManager printerManager = null;
    private final List<Printer> printers = new ArrayList<>(3);

    protected PrinterManager() {
        printers.add(new Printer());
        printers.add(new Printer());
        printers.add(new Printer());
    }

    public synchronized static PrinterManager getInstance() {
        if(printerManager == null) {
            printerManager = new PrinterManager();
        }

        return printerManager;
    }

    public synchronized Printer getPrinter() {
        for(Printer printer : printers) {
            if(printer.isAvailable()) {
                return printer;
            }
        }

        return null;
    }
}
