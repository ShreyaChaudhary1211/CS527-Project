package edu.harvard.h2ms;

import edu.harvard.h2ms.domain.core.User;
import edu.harvard.h2ms.repository.UserRepository;
import edu.harvard.h2ms.service.UserDetailsServiceImpl;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.test.context.junit4.SpringRunner;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
public class RandoopErrorTest0 {

    public static boolean debug = false;
    private User user;

    @TestConfiguration
    static class UserDetailsServiceContextConfiguration {
        @Bean
        public UserDetailsService userDetailsService() {
            return new UserDetailsServiceImpl();
        }
    }

    @Autowired
    private UserDetailsService userDetailsService;

    @MockBean
    private UserRepository userRepository;

    @Before
    public void setUp() {
        user = new User("John", "Quincy", "Adams", "jqadams@h2ms.org", "password", "Other");
        Mockito.when(userRepository.findOneByEmail("jqadams@h2ms.org")).thenReturn(user);
    }

    @Test(expected= UsernameNotFoundException.class)
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userDetailsService.loadUserByUsername("hi!");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        userDetailsService.loadUserByUsername("jQaDamS@h2ms.org");    }
}

