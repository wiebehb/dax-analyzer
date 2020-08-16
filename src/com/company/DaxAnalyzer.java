package com.company;
import com.company.readfiles.*;


public class DaxAnalyzer {

    public static void main(String[] args) {
        ReadFiles r = new ReadFiles();
        r.convertToArray();

        Formulas f = new Formulas();
        f.createDateArray(r.getArray());
        f.createDataArray(r.getArray());
        f.printArray();
    }
}
