package com.example.springboot.elasticsearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @author: zhw
 * @createDate: 2020/1/11
 */
@Component
public interface NoticeRepository extends ElasticsearchRepository<Notice, Long>
{
}
