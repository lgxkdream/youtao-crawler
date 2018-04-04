package com.youtao.crawler;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.youtao.crawler.thread.ThreadPool;

/**
 * 
 * @title: Main
 * @description: 爬虫入口
 * @Copyright: Copyright (c) 2018
 * @Company: lgxkdream.github.io
 * @author LiGang
 * @version 1.0.0
 * @since 2018年4月4日 下午4:47:48
 */
public class Main {
	
	public static ApplicationContext applicationContext;
	
	public static void main(String[] args) throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext*.xml");
		
		//从Spring容器中获取到所有可以执行的爬虫,并且放到线程池中执行
		Map<String, Crawler>  map = applicationContext.getBeansOfType(Crawler.class);
		for (Crawler crawler : map.values()) {
			ThreadPool.runInThread(crawler);
		}
		
	}

}
