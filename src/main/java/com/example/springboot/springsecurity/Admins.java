package com.example.springboot.springsecurity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author: zhw
 * @createDate: 2020/2/21
 */
public class Admins implements Serializable
{
	private Integer aid;
	private String aname;
	private String pwd;
	private Integer aexist;
	private Integer state;
	private Integer doid;
	private String by1;
	private Date lastPasswordResetDate;

	private String email;

	private List<Authority> authorities;

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public List<Authority> getAuthorities()
	{
		return authorities;
	}

	public void setAuthorities(List<Authority> authorities)
	{
		this.authorities = authorities;
	}

	public Integer getAid()
	{
		return aid;
	}

	public void setAid(Integer aid)
	{
		this.aid = aid;
	}

	public String getAname()
	{
		return aname;
	}

	public void setAname(String aname)
	{
		this.aname = aname;
	}

	public String getPwd()
	{
		return pwd;
	}

	public void setPwd(String pwd)
	{
		this.pwd = pwd;
	}

	public Integer getAexist()
	{
		return aexist;
	}

	public void setAexist(Integer aexist)
	{
		this.aexist = aexist;
	}

	public Integer getState()
	{
		return state;
	}

	public void setState(Integer state)
	{
		this.state = state;
	}

	public Integer getDoid()
	{
		return doid;
	}

	public void setDoid(Integer doid)
	{
		this.doid = doid;
	}

	public String getBy1()
	{
		return by1;
	}

	public void setBy1(String by1)
	{
		this.by1 = by1;
	}

	public Date getLastPasswordResetDate()
	{
		return lastPasswordResetDate;
	}

	public void setLastPasswordResetDate(Date lastPasswordResetDate)
	{
		this.lastPasswordResetDate = lastPasswordResetDate;
	}
}
