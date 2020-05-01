package pl.dudus.service;


import java.util.List;
import pl.dudus.model.Data;
import pl.dudus.repository.DataRepository;


/**
 *
 * @author Patryk Duduś
 */
public class DataService {
    private DataRepository dataRepository;

    public DataService() {
        dataRepository = new DataRepository();
    }
    

    public void deleteDataById(int id) {
        dataRepository.delete(id);
    }

    public List<Data> getAllData() {
        return dataRepository.findAll();
    } 

    public void update(Data data) {
        dataRepository.update(data);
    }

    public void add(Data data) {
        dataRepository.add(data);
    }
}
