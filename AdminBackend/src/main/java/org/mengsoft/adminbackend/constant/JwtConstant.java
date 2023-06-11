package org.mengsoft.adminbackend.constant;

public class JwtConstant {
    /**
     * token
     */
    public static final int JWT_ERRCODE_NULL = 40000;			//Token not exist
    public static final int JWT_ERRCODE_EXPIRE = 40001;			//Token Expire
    public static final int JWT_ERRCODE_FAIL = 40002;			//Validation failed

    /**
     * JWT
     */
    public static final String JWT_SECERT = "8677df7fc3a34e26a61c034d5ec8245d";			//密匙
    public static final long JWT_TTL = 24 * 60 * 60 * 1000;
}
