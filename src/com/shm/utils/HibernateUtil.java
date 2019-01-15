package com.shm.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 抽取hibernate的工具类
 * @author SHM
 *
 */
public class HibernateUtil {
	private static SessionFactory factory;
	
//	private static ThreadLocal<Session> tl = new ThreadLocal<Session>();
	
	//了解：hibernate把可以预见的异常都转化成了运行时异常
	static{
		try {
			Configuration cfg = new Configuration();
			cfg.configure();
			factory = cfg.buildSessionFactory();
//			System.out.println(factory);
		} catch (ExceptionInInitializerError e) {
			throw new ExceptionInInitializerError("初始化SessionFactory失败，请检查配置文件");
		}
	}
	/**
	 * 获取一个新的Session对象
	 * 只要使用openSession方法，每次得到的都是一个新的session
	 * @return
	 */
	public static Session openSession(){
//		Session s = tl.get();
//		if(s == null){
//			tl.set(factory.openSession());
//		}
//		s = tl.get();
//		
//		return s;
		return factory.openSession();
	}
	
	/**
	 * 从当前线程上获取session对象
	 * @return
	 */

	public static Session getCurrentSession(){
		return factory.getCurrentSession();//只有配置了把session和线程绑定之后，才能适用此方法，否则返回值是null。
	}
}
