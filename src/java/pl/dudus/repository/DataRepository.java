package pl.dudus.repository;


import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pl.dudus.model.Data;
import pl.dudus.service.DBConnect;


/**
 *
 * @author Patryk Duduś
 */
public class DataRepository {
    
   private final DBConnect databaseConnection;
   private final Connection connection;

   public DataRepository() {
       databaseConnection = new DBConnect();
       connection = databaseConnection.getConnectionFromContext();
   }
   
    public List<Data> findAll() {
        List<Data> results = new ArrayList<>();
        try {
            ResultSet rs = connection.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE, java.sql.ResultSet.CONCUR_READ_ONLY)
                                     .executeQuery("select * from t_dane");       
            while(rs.next()) {
                String id = rs.getString("id");
                String nr = rs.getString("nr");
                String tytul = rs.getString("tytul");
                String opis = rs.getString("opis");
                    
                results.add(new Data(id, nr, tytul, opis));
            }
                
        } catch (SQLException ex) {
              ex.printStackTrace();
        }
        
        return results;
    }
    
    public void update(Data data) {
        String q =String.format("update t_dane set nr='%s', tytul='%s', opis='%s' where id='%s'", 
                    data.getNr(), data.getTytul(), data.getOpis(), data.getId());
        this.doStatement(q);
    }
    
    public void delete(int id) {
        String q = String.format("delete from t_dane where id=%s", id);
        this.doStatement(q);
    }
    
    public void add(Data data) {
        String q =String.format("insert into t_dane(id, nr, tytul, opis) values ('%s', '%s', '%s', '%s')", 
                    data.getId(), data.getNr(), data.getTytul(), data.getOpis());
        this.doStatement(q);
    }
    
    private void doStatement(String query) {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);     
        } catch (SQLException e) {
            System.out.println("Błąd podczas przetwarzania żądania SQL" + e);
       }
    }
    
    
}
