package headfirst.designpatterns.flyweight;

import cn.hutool.core.util.ObjectUtil;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    Map<String, Tree> trees = new HashMap<>();

    public Tree getTree(String type) throws Exception {
        Tree tree = trees.get(type);
        if (ObjectUtil.isNotEmpty(tree)) {
            return tree;
        }
        if (type.equals("deciduous")) {
            trees.put(type, new DeciduousTree());
        } else if (type.equals("conifer")) {
            trees.put(type, new ConiferTree());
        } else {
            throw new Exception("Invalid kind of tree");
        }
        return trees.get(type);
    }
}