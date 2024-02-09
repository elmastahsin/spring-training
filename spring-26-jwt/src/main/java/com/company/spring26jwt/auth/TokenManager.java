package com.company.spring26jwt.auth;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;

@Service
public class TokenManager {


    Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    private static final String secretKey = "pttemkart";
    private static final int validity = 24 * 60 * 60 * 1000;

    public String createToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuer("pttemkart.com")
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + validity))
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();
    }

    //token validate
    public boolean validateToken(String token) {
        if (getUserFromToken(token) != null && !isExpired(token)) {
            return true;
        }
        return false;
    }

    private boolean isExpired(String token) {
        Claims claims = getClaims(token);
        return claims.getExpiration().before(new Date(System.currentTimeMillis()));}

    //getUserFromToken
    public String getUserFromToken(String token) {
        Claims claims = getClaims(token);
        return claims.getSubject();
    }

    private static Claims getClaims(String token) {
        return  Jwts.parser().setSigningKey(secretKey).parseClaimsJwt(token).getBody();
    }
}

