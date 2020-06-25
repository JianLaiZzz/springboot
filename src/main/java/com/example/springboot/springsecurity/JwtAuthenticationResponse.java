package com.example.springboot.springsecurity;

import java.io.Serializable;

/**
 * @author: zhw
 * @createDate: 2020/2/21
 */
public class JwtAuthenticationResponse implements Serializable
{
	private static final long serialVersionUID = 4784951536404964122L;
	private final String token;

	public JwtAuthenticationResponse(String token)
	{
		this.token = token;
	}

	public String getToken()
	{
		return this.token;
	}
}
