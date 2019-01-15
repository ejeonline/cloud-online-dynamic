package com.sgcc.zj.manager.controller.neo4j;

import com.sgcc.zj.common.domain.ElementNode;
import com.sgcc.zj.manager.CloudOnlineManagerApplicationTests;
import com.sgcc.zj.service.neo4j.ElementGraphService;
import org.junit.Test;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

@Component
public class GraphControllerTest extends CloudOnlineManagerApplicationTests {



    @Resource
    private ElementGraphService elementGraphService;

    @Test
    public void mytest(){

        Map<String, Object> elements = elementGraphService.elementNodeGraph(100);
        System.out.println(elements.toString());

        /*ElementNode node = new ElementNode();
        node.setElementName("test");
        node.setElementType("testssss");
        elementGraphService.save(node);*/

    }
}