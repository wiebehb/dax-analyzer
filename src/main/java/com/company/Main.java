package com.company;
import com.company.readfiles.*;

public class Main {

    public static void main(String[] args) throws Exception {


        /* input csv and convert to string array */

        ReadFiles r = new ReadFiles();
        r.convertToArray();
        //r.printArray();


        /* convert string array to date and float in order to perform calculations */

        Formulas f = new Formulas();
        f.createDateArray(r.getArray());
        f.createDataArray(r.getArray());
        f.printArray();
    }
}
