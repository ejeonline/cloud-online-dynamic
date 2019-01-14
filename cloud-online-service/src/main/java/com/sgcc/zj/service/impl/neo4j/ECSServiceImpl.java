package com.sgcc.zj.service.impl.neo4j;

import com.sgcc.zj.common.domain.ECSNode;
import com.sgcc.zj.common.repository.ECSRepository;
import com.sgcc.zj.service.neo4j.ECSService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @description: ECS图谱实现类
 * @author: liyingjie
 * @create: 2019-01-14
 */
@Service("ecsService")
public class ECSServiceImpl implements ECSService {

    @Resource
    private ECSRepository ecsRepository;


    @Override
    public ECSNode ecsSave(ECSNode node) {
        return ecsRepository.save(node);
    }


    private Map<String, Object> toD3sssFormat(Collection<ECSNode> ecsNodes) {
        List<Map<String, Object>> nodes = new ArrayList<>();
        List<Map<String, Object>> rels = new ArrayList<>();
        int i = 0;
        Iterator<ECSNode> result = ecsNodes.iterator();
        while (result.hasNext()) {
            ECSNode ecsNode = result.next();
            nodes.add(map("name", ecsNode.getIpAddress(), "label", "ecsNode"));
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
