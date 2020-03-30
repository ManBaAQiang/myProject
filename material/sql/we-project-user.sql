/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/3/30 21:40:54                           */
/*==============================================================*/


drop table if exists user;

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   uid                  int not null,
   username             varchar(20) not null,
   sex                  int comment '0:ÄÐ;1:Å®',
   userDescribe         varchar(50),
   account              varchar(20) not null,
   icon                 varchar(20),
   userLevel            int,
   primary key (uid)
);

