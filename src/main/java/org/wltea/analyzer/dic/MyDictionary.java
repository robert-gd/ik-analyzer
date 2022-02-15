package org.wltea.analyzer.dic;

import org.wltea.analyzer.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

/**
 * 扩展词典，方便加载
 * @Author: luorenshu
 * @Date: 2022/02/15/10:17
 * @Description:
 **/
public class MyDictionary extends Dictionary {

    public MyDictionary(Configuration cfg) {
        super(cfg);
    }

    @Override
    protected Set<String> getExtDictWords() {
        Set<String> set = new HashSet<>();
        set.add("立刻");
        set.add("很紧急");
        set.add("过来一下");
        return set;
    }
}
