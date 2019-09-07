package io.mem.al.repository;

import io.mem.al.model.Registration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@DataJpaTest
@Profile("test")
public class RegistrationRepositoryTest {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Test
    public void test_registration_repo_findByUserName() {
        Registration byUserName = registrationRepository.findByUserName("brown.fox");
        assertNotNull(byUserName);
    }
}