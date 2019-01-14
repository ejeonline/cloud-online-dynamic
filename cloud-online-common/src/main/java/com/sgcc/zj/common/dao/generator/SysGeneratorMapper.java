package com.sgcc.zj.common.dao.generator;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 代码生成器
 * 
 * @author admin
 * @email admin@rsitf.com
 * @date 2016年12月19日 下午3:32:04
 */
@Repository
public interface SysGeneratorMapper {
	
	List<Map<String, Object>> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	Map<String, String> queryTable(String tableName);
	
	List<Map<String, String>> queryColumns(String tableName);
}
