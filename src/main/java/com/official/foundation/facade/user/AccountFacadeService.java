package com.official.foundation.facade.user;

import com.official.foundation.domain.po.user.Account;
import com.official.foundation.facade.BaseFacadeService;

public interface AccountFacadeService extends BaseFacadeService<Account,Long>{
	/**
	 * 根据用户名/邮箱/验证手机 获取账号信息
	 * @param username
	 * @return
	 */
	public Account getAccountByUsername(String username);
	/**
	 * 用户注册
	 * @param account
	 * @return
	 */
	public Account register(Account account);
	/**
	 * 更新账号信息
	 * @param account
	 * @return
	 */
	public Account updateAccount(Account account);
}
