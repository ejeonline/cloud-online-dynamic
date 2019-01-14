/*
package com.sgcc.zj.common.repository;

import com.sgcc.zj.common.domain.ElementNode;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

*/
/**
 * @description: 元素接口
 * @author: liyingjie
 * @create: 2019-01-10
 *//*

@Repository
public interface ElementNodeRepository extends Neo4jRepository<ElementNode,Long> {
    @Query("MATCH (m:ElementNode)<-[r:belong_to]-(a:ElementNode) RETURN m,r,a LIMIT {limit}")
    Collection<ElementNode> graph(@Param("limit") int limit);
}
*/
