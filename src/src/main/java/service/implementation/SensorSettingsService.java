package src.main.java.service.implementation;


import src.main.java.DAO.IGeneralDAO;
import src.main.java.DAO.implementation.SensorSettingsDAO;
import src.main.java.model.implementation.SensorSettings;

public class SensorSettingsService extends GeneralService<SensorSettings> {
    private final IGeneralDAO<SensorSettings, Integer> sensorSettingsDAOImplementation = new SensorSettingsDAO();
    //private final GeneralDAO<SensorSettings> SENSOR_SETTINGS_DAO = new SensorSettingsDAO();
    @Override
    public final IGeneralDAO<SensorSettings, Integer> getDAO() {
        return sensorSettingsDAOImplementation;
    }
}

//public IGeneralDAO<SensorSettings> getDAO() {
//return SENSOR_SETTINGS_DAO;
//}
//}