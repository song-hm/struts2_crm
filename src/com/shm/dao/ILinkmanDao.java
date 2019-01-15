package com.shm.dao;

import java.util.List;

import com.shm.domain.Linkman;

/**
 * 联系人持久层接口
 * @author SHM
 *
 */
public interface ILinkmanDao {

	/**
	 * 查询联系人列表
	 * @return
	 */
	List<Linkman> listLinkman();

}
