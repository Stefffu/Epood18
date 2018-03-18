package ee.ut.veebirakendus.epood.service;

import java.util.List;

import ee.ut.veebirakendus.epood.bean.Toode;
import ee.ut.veebirakendus.epood.repository.ToodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToodeService implements IToodeService {

    @Autowired
    private ToodeRepository repository;

    @Override
    public List<Toode> findAll() {

        List<Toode> tooted = (List<Toode>) repository.findAll();

        return tooted;
    }
}