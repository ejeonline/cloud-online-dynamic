package com.sgcc.zj.common.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 项目节点
 * @author: liyingjie
 * @create: 2019-01-14
 */
@NodeEntity
public class ProjectNode {

    private @Id
    @GeneratedValue
    Long id;

    private String projectName;

    private String projectExplain;

    @Relationship(type = "BELONG_TO")
    private List<ECSNode> ecsNodes = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectExplain() {
        return projectExplain;
    }

    public void setProjectExplain(String projectExplain) {
        this.projectExplain = projectExplain;
    }

}
