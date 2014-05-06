package com.github.toastshaman.dropwizard.auth.jwt;

import com.github.toastshaman.dropwizard.auth.jwt.model.JsonWebToken;

public interface JsonWebTokenParser {

    JsonWebToken parse(String token);
}