package com.ag9software.jhipstertest.web.rest.errors;

public class EmailAlreadyUsedException extends BadRequestAlertException {

    public EmailAlreadyUsedException() {
        super(ErrorConstants.EMAIL_ALREADY_USED_TYPE, "Email address already in use", "userManagement", "emailexists");
    }
}
