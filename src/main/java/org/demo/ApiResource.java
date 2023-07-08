package org.demo;

import org.demo.swagger.api.UserApi;
import org.demo.swagger.dto.User;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.Valid;

@ApplicationScoped
public class ApiResource implements UserApi {

    final static Logger log = Logger.getLogger(ApiResource.class);


    @Override
    public void createUser(@Valid User body) {

    }

    @Override
    public void deleteUser(String username) {

    }

    @Override
    public User getUserByName(String username) {
        log.infov("looking for id {0}", username);
        return null;
    }

    @Override
    public void updateUser(@Valid User body, String username) {

    }

}
