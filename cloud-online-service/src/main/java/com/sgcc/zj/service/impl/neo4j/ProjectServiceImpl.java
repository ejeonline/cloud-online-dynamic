package com.sgcc.zj.service.impl.neo4j;

import com.sgcc.zj.common.domain.ProjectNode;
import com.sgcc.zj.common.repository.ProjectRepository;
import com.sgcc.zj.service.neo4j.ProjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: project实现类
 * @author: liyingjie
 * @create: 2019-01-14
 */
@Service("projectService")
public class ProjectServiceImpl implements ProjectService {


    @Resource
    private ProjectRepository projectRepository;

    @Override
    public ProjectNode projectSave(ProjectNode node) {
        return projectRepository.save(node);
    }
}
