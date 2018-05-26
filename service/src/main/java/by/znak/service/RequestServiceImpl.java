package by.znak.service;

import by.znak.dao.RequestDao;
import by.znak.dao.RequestDaoImpl;
import by.znak.entities.Request;

public class RequestServiceImpl implements RequestService{
    public Request create(Request request) {
        RequestDao requestDao = new RequestDaoImpl();
        return requestDao.create(request);
    }

    public Request update(Request request) {
        RequestDao requestDao = new RequestDaoImpl();
        return requestDao.update(request);
    }

    public Request read(Long id) {
        RequestDao requestDao = new RequestDaoImpl();
        return requestDao.read(id);
    }

    public void delete(Request request) {
        RequestDao requestDao = new RequestDaoImpl();
        requestDao.delete(request);
    }
}
