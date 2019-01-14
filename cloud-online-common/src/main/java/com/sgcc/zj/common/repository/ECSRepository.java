package com.sgcc.zj.common.repository;

import com.sgcc.zj.common.domain.ECSNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * @description: ECSRepository
 * @author: liyingjie
 * @create: 2019-01-14
 */
@Repository
public interface ECSRepository extends Neo4jRepository<ECSNode,Long> {

}
