package com.company.readfiles;
import java.text.SimpleDateFormat;
import java.util.*;

public class Formulas {

    ReadFiles r = new ReadFiles();

    float[][] dataArray = new float[r.findRowNumber()][7];
    Date[] dateArray = new Date[r.findRowNumber()];


    /* convert date in dax file to right format */

    public void createDateArray(String[][] n) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        for(int x = 0; x < n.length; x++) {
            for(int y = 0; y<n[x].length; y++) {
                if(y==0) {
                    try{
                        Date newdate = (Date)df.parse(n[x][0]);
                        dateArray[x] = newdate;
                    }
                    catch(Exception e) {
                        System.out.println(e);
                    }
                }
            }
        }
    }


    /* create a float array for non date columns */

    public void createDataArray(String[][] n) {
        for(int x=0; x<n.length; x++) {
            for(int y = 0; y<n[x].length; y++) {
                switch(y) {
                    case 0:
                        dataArray[x][y] = 0;
                        break;
                    case 1:
                        dataArray[x][y] = 0;
                        break;
                    case 2:
                        float a = Float.parseFloat(n[x][y]);
                        dataArray[x][y] = a;
                        break;
                    case 3:
                        float b = Float.parseFloat(n[x][y]);
                        dataArray[x][y] = b;
                        break;
                    case 4:
                        float c = Float.parseFloat(n[x][y]);
                        dataArray[x][y] = c;
                        break;
                    case 5:
                        float d = Float.parseFloat(n[x][y]);
                        dataArray[x][y] = d;
                        break;
                    case 6:
                        float e = Float.parseFloat(n[x][y]);
                        dataArray[x][y] = e;
                        break;
                }
            }
        }
    }


    /* print data array */

    public void printArray(){
        for(int x = 0; x< dataArray.length; x++) {
            for(int y = 0; y < dataArray[x].length; y++) {
                System.out.printf("%s ", dataArray[x][y]);
            }
            System.out.println();
        }
    }

    public float[][] getArray(){
        return dataArray;
    }
}
