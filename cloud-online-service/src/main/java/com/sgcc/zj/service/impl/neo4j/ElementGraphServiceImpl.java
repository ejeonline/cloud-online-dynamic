/*
package com.sgcc.zj.service.impl.neo4j;

import com.sgcc.zj.common.domain.ElementNode;
import com.sgcc.zj.common.domain.ElementRelationship;
import com.sgcc.zj.common.repository.ElementNodeRepository;
import com.sgcc.zj.common.repository.ElementRelationshipRepository;
import com.sgcc.zj.service.neo4j.ElementGraphService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

*/
/**
 * @description: 图谱实现类
 * @author: liyingjie
 * @create: 2019-01-14
 *//*

@Service("elementGraphService")
public class ElementGraphServiceImpl implements ElementGraphService {

    @Resource
    private ElementNodeRepository elementNodeRepository;
    @Resource
    private ElementRelationshipRepository elementRelationshipRepository;

    @Override
    public ElementNode elementNodeSave(ElementNode node) {
        ElementNode save = elementNodeRepository.save(node);
        return save;
    }

    @Override
    public Map<String, Object> graph(int limit) {
        Collection<ElementNode> result = elementNodeRepository.graph(limit);
        return toD3sssFormat(result);
    }

    private Map<String, Object> toD3sssFormat(Collection<ElementNode> elementNodes) {
        List<Map<String, Object>> nodes = new ArrayList<>();
        List<Map<String, Object>> rels = new ArrayList<>();
        int i = 0;
        Iterator<ElementNode> result = elementNodes.iterator();
        while (result.hasNext()) {
            ElementNode elementNode = result.next();
            nodes.add(map("name", elementNode.getElementName(), "label", "elementNode"));
            int target = i;
            i++;
            for (ElementRelationship elementRelationship : elementNode.getElementRelationships()) {
                Map<String, Object> toNode = map("name", elementRelationship.getToNode().getElementName(), "label", "ECS");
                int source = nodes.indexOf(toNode);
                if (source == -1) {
                    nodes.add(toNode);
                    source = i++;
                }
                rels.add(map("source", source, "target", target));
            }
        }
        return map("nodes", nodes, "links", rels);
    }
    private Map<String, Object> map(String key1, Object value1, String key2, Object value2) {
        Map<String, Object> result = new HashMap<String, Object>(2);
        result.put(key1, value1);
        result.put(key2, value2);
        return result;
    }

}
*/
