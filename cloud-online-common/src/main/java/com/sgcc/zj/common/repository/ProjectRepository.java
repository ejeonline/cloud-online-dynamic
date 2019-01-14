package com.sgcc.zj.common.repository;

import com.sgcc.zj.common.domain.ProjectNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * @description: ProjectRepository
 * @author: liyingjie
 * @create: 2019-01-14
 */
@Repository
public interface ProjectRepository extends Neo4jRepository<ProjectNode,Long> {

}
