/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dev.rest;

import au.com.bytecode.opencsv.CSVReader;
import com.dev.rest.beans.LineDefinitions;
import com.dev.rest.dao.LineDefinitionsDAO;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 *
 * @author Felisbino
 */
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String strFile = "src/java/assets/routes.csv";
        CSVReader reader = new CSVReader(new FileReader(strFile));
        List myEntries = reader.readAll();
        
        for(int i = 0; i < 14; i++){
            String[] aux =  (String[]) myEntries.get(i);
            System.out.println("Teste " + aux[1].toString());
        }
        
        LineDefinitions ldf = new LineDefinitions();
        ldf.setStation1(1);
        ldf.setStation2(2);
        ldf.setLine(1);
    
        LineDefinitionsDAO ldfDAO = new LineDefinitionsDAO();
        ldfDAO.InserirLineDefinitions(ldf);
        
    }
}
