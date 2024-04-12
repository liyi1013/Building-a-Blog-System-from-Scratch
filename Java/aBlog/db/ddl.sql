create schema blog;


create table article
(
    id        int auto_increment comment 'id',
    title     varchar(255) not null comment '文章标题',
    content   text         null comment ' 文章详情',
    author    varchar(255) not null comment '作者',
    add_date  datetime     not null comment '创建时间',
    pub_date  datetime     not null comment '更新时间',
    is_delete bool         null comment '逻辑删除',
    constraint article_pk
        primary key (id)
)
    comment '文章';

create index article_title_index
    on article (title);
