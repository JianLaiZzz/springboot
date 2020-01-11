package com.example.springboot.elasticsearch;

import com.google.common.collect.Lists;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: zhw
 * @createDate: 2020/1/11
 */
@RestController

public class NoticeController {
    @Autowired
    private NoticeRepository nticeRepository;

    @GetMapping("/save")
    public void save(long id, String title){

        Notice article = new Notice();
        article.setId(id);
        article.setReadCount(123);
        article.setTitle("springboot整合elasticsearch，这个是新版本 2018年");
        nticeRepository.save(article);
    }


    /**
     * @param title   搜索标题
     * @param pageable page = 第几页参数, value = 每页显示条数
     */
    @GetMapping("/search")
    public List<Notice> search(String title, @PageableDefault(page = 1, value = 10) Pageable pageable){

        //按标题进行搜索
        MatchQueryBuilder queryBuilder = QueryBuilders.matchQuery("title", title);

        //如果实体和数据的名称对应就会自动封装，pageable分页参数
        Iterable<Notice> listIt =  nticeRepository.search(queryBuilder,pageable);
        //Iterable转list
        List<Notice> list= Lists.newArrayList(listIt);
        return list;
    }

}
