/*
package com.sgcc.zj.common.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sgcc.zj.common.domain.ElementRelationship;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

*/
/**
 * @description: 元素节点
 * @author: liyingjie
 * @create: 2019-01-10
 *//*

@NodeEntity
public class ElementNode {

    private @Id @GeneratedValue Long id;

    private String elementName;

    private String elementType;

    @Relationship(type = "BELONG_TO", direction = Relationship.INCOMING)
    private List<ElementNode> elementNodes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }


    public ElementNode(){

    }

    public ElementNode(String elementName, String elementType) {
        this.elementName = elementName;
        this.elementType = elementType;
    }

    public List<ElementNode> getElementNodes() {
        return elementNodes;
    }

    public void setElementNodes(List<ElementNode> elementNodes) {
        this.elementNodes = elementNodes;
    }
}
*/
