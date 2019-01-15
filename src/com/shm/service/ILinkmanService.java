package com.shm.service;

import java.util.List;

import com.shm.domain.Linkman;

/**
 * 联系人的业务层接口
 * @author SHM
 *
 */
public interface ILinkmanService {

	/**
	 * 查询联系人列表
	 * @return
	 */
	List<Linkman> listLinkman();
}
