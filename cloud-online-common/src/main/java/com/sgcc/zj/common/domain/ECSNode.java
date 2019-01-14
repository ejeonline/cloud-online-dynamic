package com.sgcc.zj.common.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

/**
 * @description: ECS节点
 * @author: liyingjie
 * @create: 2019-01-14
 */
@NodeEntity
public class ECSNode {

    private @Id
    @GeneratedValue
    Long id;

    private String ipAddress;

    private String ECSExplain;

    @Relationship(type = "BELONG_TO", direction = Relationship.INCOMING)
    private List<ProjectNode> projectNodes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getECSExplain() {
        return ECSExplain;
    }

    public void setECSExplain(String ECSExplain) {
        this.ECSExplain = ECSExplain;
    }

    public List<ProjectNode> getProjectNodes() {
        return projectNodes;
    }

    public void setProjectNodes(List<ProjectNode> projectNodes) {
        this.projectNodes = projectNodes;
    }

    public ECSNode(String ipAddress, String ECSExplain, List<ProjectNode> projectNodes) {
        this.ipAddress = ipAddress;
        this.ECSExplain = ECSExplain;
        this.projectNodes = projectNodes;
    }
}
