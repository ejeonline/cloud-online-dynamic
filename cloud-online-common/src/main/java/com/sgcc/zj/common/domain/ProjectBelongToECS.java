package com.sgcc.zj.common.domain;

import org.neo4j.ogm.annotation.*;

/**
 * @description: 所属关系
 * @author: liyingjie
 * @create: 2019-01-14
 */
@RelationshipEntity("BELONG_TO")
public class ProjectBelongToECS {

    private @Id
    @GeneratedValue
    Long id;

    @StartNode
    private ProjectNode projectNode;

    @EndNode
    private ECSNode ecsNode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProjectNode getProjectNode() {
        return projectNode;
    }

    public void setProjectNode(ProjectNode projectNode) {
        this.projectNode = projectNode;
    }

    public ECSNode getEcsNode() {
        return ecsNode;
    }

    public void setEcsNode(ECSNode ecsNode) {
        this.ecsNode = ecsNode;
    }

    public ProjectBelongToECS(ProjectNode projectNode, ECSNode ecsNode) {
        this.projectNode = projectNode;
        this.ecsNode = ecsNode;
    }
}
