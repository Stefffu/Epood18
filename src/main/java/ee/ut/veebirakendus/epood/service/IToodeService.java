package ee.ut.veebirakendus.epood.service;

import ee.ut.veebirakendus.epood.bean.Toode;

import java.util.List;

public interface IToodeService {

    public List<Toode> findAll();
    public void lisa(Toode toode);
    public long kogus();
}