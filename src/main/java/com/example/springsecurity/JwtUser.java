package com.example.springsecurity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;

/**
 * @author: zhw
 * @createDate: 2020/2/21
 */
public class JwtUser implements UserDetails
{

	private final Integer id;
	private final Integer state;
	private final String username;
	private final String password;
	private final String email;
	private final Collection<? extends GrantedAuthority> authorities;
	private final boolean enabled;
	private final Date lastPasswordResetDate;

	public JwtUser(Integer id, Integer state, String username, String password, String email,
			Collection<? extends GrantedAuthority> authorities, boolean enabled,
			Date lastPasswordResetDate)
	{
		this.id = id;
		this.state = state;
		this.username = username;
		this.password = password;
		this.email = email;
		this.authorities = authorities;
		this.enabled = enabled;
		this.lastPasswordResetDate = lastPasswordResetDate;
	}

	public Integer getState()
	{
		return state;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities()
	{
		return authorities;
	}

	@JsonIgnore
	@Override
	public String getPassword()
	{
		return password;
	}

	@Override
	public String getUsername()
	{
		return username;
	}

	@JsonIgnore
	@Override
	public boolean isAccountNonExpired()
	{
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isAccountNonLocked()
	{
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isCredentialsNonExpired()
	{
		return true;
	}

	@Override
	public boolean isEnabled()
	{
		return this.enabled;
	}

	@JsonIgnore
	public Integer getId()
	{
		return id;
	}

	public String getEmail()
	{
		return email;
	}

	@JsonIgnore
	public Date getLastPasswordResetDate()
	{
		return lastPasswordResetDate;
	}
}
