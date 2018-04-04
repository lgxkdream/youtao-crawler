package com.youtao.crawler.pojo;

import java.util.Date;

/**
 * 
 * @title: BasePojo
 * @description: 
 * @Copyright: Copyright (c) 2018
 * @Company: lgxkdream.github.io
 * @author LiGang
 * @version 1.0.0
 * @since 2018年4月4日 下午4:48:21
 */
public abstract class BasePojo {
	
	/**
	 * 创建时间
	 */
	protected Date created;
	
	/**
	 * 更新时间
	 */
	protected Date updated;

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

}
