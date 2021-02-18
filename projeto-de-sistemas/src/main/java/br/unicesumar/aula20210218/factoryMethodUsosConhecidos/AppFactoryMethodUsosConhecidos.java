package br.unicesumar.aula20210218.factoryMethodUsosConhecidos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Calendar;

public class AppFactoryMethodUsosConhecidos {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle://....", "user", "password");

            Calendar calendar1 = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();

            System.out.println(calendar1.hashCode());
            System.out.println(calendar2.hashCode());
            System.out.println(calendar1 == calendar2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
