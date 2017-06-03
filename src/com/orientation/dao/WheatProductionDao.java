package com.orientation.dao;

import java.util.List;

import com.orientation.model.WheatProduction;

import core.dao.Dao;

/**
 * 附件的数据持久层的接口
 * @框架唯一的升级和技术支持地址：http://shop111863449.taobao.com
 */
public interface WheatProductionDao extends Dao<WheatProduction> {

	List<Object[]> queryFlowerList(String epcId);

	void deleteAttachmentByForestryTypeId(Long umTypeId);

	List<Object[]> querySensorList();

}
