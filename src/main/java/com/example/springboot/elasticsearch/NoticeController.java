package com.example.springboot.elasticsearch;

import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhw
 * @createDate: 2020/1/11
 */
@RestController

public class NoticeController {
    @Autowired
    private NoticeRepository nticeRepository;

    @GetMapping("/create")
    public String create(
            @RequestParam("id") Long id,
            @RequestParam("userName") String userName,
            @RequestParam("userPhone") String userPhone) {
        Notice userES = new Notice();
        userES.setId(id);
        userES.setUserName(userName);
        userES.setUserPhone(userPhone);
        return nticeRepository.save(userES).toString();
    }

    private String names;

    @GetMapping("/get")
    public String get() {
        names = "";
        Iterable<Notice> userES = nticeRepository.findAll();
        userES.forEach(userES1 -> {
            names += userES1.toString() + "\n";
        });
        return names;
    }

    private String searchs = "";


    @GetMapping("/search")
    public String search(@RequestParam("searchKey") String searchKey){


         searchs = "";
        // 构建查询条件
        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
        // 添加基本分词查询
        queryBuilder.withQuery(QueryBuilders.matchQuery("userName", searchKey));
        // 搜索，获取结果
        Page<Notice> items = nticeRepository.search(queryBuilder.build());
        // 总条数
        long total = items.getTotalElements();
        searchs += "总共数据数：" + total + "\n";
        items.forEach(userES -> {
            searchs += userES.toString() + "\n";
        });
        return searchs;
    }

}
