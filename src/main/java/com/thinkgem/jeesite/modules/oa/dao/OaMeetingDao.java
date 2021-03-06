/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.oa.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.oa.entity.OaMeeting;

/**
 * 会议管理DAO接口
 * @author wanyy
 * @version 2015-11-24
 */
@MyBatisDao
public interface OaMeetingDao extends CrudDao<OaMeeting> {
	
}