/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dev.rest;

import au.com.bytecode.opencsv.CSVReader;
import com.dev.rest.beans.LineDefinitions;
import com.dev.rest.beans.Routes;
import com.dev.rest.beans.Stations;
import com.dev.rest.dao.LineDefinitionsDAO;
import com.dev.rest.dao.RoutesDAO;
import com.dev.rest.dao.StationsDAO;
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
        
        String strLines = "src/java/assets/lines.csv";
        CSVReader readerLines = new CSVReader(new FileReader(strLines));
        List myEntriesLines = readerLines.readAll();
        
        readerLines = null;
        
        String strRoutes = "src/java/assets/routes.csv";
        CSVReader readerRoutes = new CSVReader(new FileReader(strRoutes));
        List myEntriesRoutes = readerRoutes.readAll();
        
        readerRoutes = null;
        
        String strStations = "src/java/assets/stations.csv";
        CSVReader readerStations = new CSVReader(new FileReader(strStations));
        List myEntriesStations = readerStations.readAll();
        
        readerStations = null;        
        
        
        LineDefinitions ldf = new LineDefinitions();
        Routes rts = new Routes();
        Stations sts = new Stations();
    
        LineDefinitionsDAO ldfDAO = new LineDefinitionsDAO();
        RoutesDAO rtsDAO = new RoutesDAO(); 
        StationsDAO stsDAO = new StationsDAO(); 
        
        int lineDefLengh = myEntriesLines.size();
        for(int i = 0; i < lineDefLengh; i++){
            String[] aux =  (String[]) myEntriesLines.get(i);
            
            ldf.setStation1(aux[0]);
            ldf.setStation2(aux[1]);
            ldf.setLine(aux[2]);
            ldfDAO.InserirLineDefinitions(ldf);
            
            System.out.println("Teste looping line Definitions Station2" + aux[1].toString());           
            
        }
        
        int routesLengh = myEntriesRoutes.size();
        for(int i = 0; i < routesLengh; i++){
            String[] aux =  (String[]) myEntriesRoutes.get(i);
            
            rts.setLine(aux[0]);
            rts.setName(aux[1]);
            rts.setColor(aux[2]);
            rts.setStripe(aux[3]);
            rtsDAO.InserirRoutes(rts);
            
            System.out.println("Teste looping Routes Name" + aux[1].toString());           
            
        }
        
        int stationsLengh = myEntriesStations.size();
        for(int i = 0; i < stationsLengh; i++){
            String[] aux =  (String[]) myEntriesStations.get(i);
            
            sts.setId(aux[0]);
            sts.setLatitude(aux[1]);
            sts.setLongitude(aux[2]);
            sts.setName(aux[3]);
            sts.setDisplay_name(aux[4]);
            sts.setZone(aux[5]);
            sts.setTotal_lines(aux[6]);
            sts.setRail(aux[7]);
            stsDAO.InserirStations(sts);
            
            System.out.println("Teste looping Stations Name" + aux[3].toString());           
            
        }
        
        
        
    }
}
