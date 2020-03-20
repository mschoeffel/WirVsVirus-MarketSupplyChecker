package de.wevsvirus.service;

import de.wevsvirus.model.Test;
import de.wevsvirus.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private TestRepository testRepository;

    @Autowired
    public TestService(TestRepository testRepository){
        this.testRepository = testRepository;
    }

    public Test createTest(Test test){
        return testRepository.save(test);
    }

}
