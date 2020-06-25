package com.example.springboot.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author: zhw
 * @createDate: 2020/2/21
 */
public class JwtUserDetailServiceImpl implements UserDetailsService
{

	@Autowired
//	private AdminsMapper adminsMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
//		Admins admins = this.adminsMapper.findByUsername(username);
        Admins admins=null;
        if (admins == null)
		{
			throw new UsernameNotFoundException("No User found with UserName :" + username);
		}
		else
		{
			return JwtUserFactory.create(admins);
		}
	}
}
