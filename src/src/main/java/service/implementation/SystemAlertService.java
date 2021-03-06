package src.main.java.service.implementation;


import src.main.java.DAO.IGeneralDAO;
import src.main.java.DAO.implementation.SystemAlertDAO;
import src.main.java.model.implementation.SystemAlert;

public class SystemAlertService extends GeneralService<SystemAlert> {
    private final IGeneralDAO<SystemAlert, Integer> systemAlertDAOImplementation = new SystemAlertDAO();
    //private final GeneralDAO<SystemAlert> SYSTEM_ALERT_DAO = new SystemAlertDAO();
    @Override
    public final IGeneralDAO<SystemAlert, Integer> getDAO() {
        return systemAlertDAOImplementation;
    }
}

//public IGeneralDAO<SystemAlert> getDAO() {
//return SYSTEM_ALERT_DAO;
//}
//}