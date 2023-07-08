package org.demo;

import org.jboss.logging.Logger;
import org.openapi.spec.api.UserApi;
import org.openapi.spec.dto.User;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.Valid;

@ApplicationScoped
public class ApiResource implements UserApi {

    final static Logger log = Logger.getLogger(ApiResource.class);

    @Override
    public User createUser(@Valid User user) {
        return null;
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
    public void updateUser(String username, @Valid User user) {

    }
}
