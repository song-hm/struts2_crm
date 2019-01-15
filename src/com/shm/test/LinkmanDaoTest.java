package com.shm.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.shm.domain.Linkman;
import com.shm.service.ILinkmanService;
import com.shm.service.impl.LinkmanServiceImpl;

/**
 * 测试联系人的业务层和持久层接口
 * @author SHM
 *
 */
 public class LinkmanDaoTest {

	@Test
	public void testListLinkman() {
		ILinkmanService linkmanService = new LinkmanServiceImpl();
		List<Linkman> linkmans = linkmanService.listLinkman();
		for(Linkman l:linkmans) {
			System.out.println(l);
		}
	}

}
