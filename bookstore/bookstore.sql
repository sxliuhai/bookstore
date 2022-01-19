create database bookstore;
use bookstore;
create table user(
`id` int primary key auto_increment,
`username` varchar(20),
`password` varchar(20));
create table book(
`id` int primary key auto_increment,
`name` varchar(20),
`author` varchar(20),
`price` double,
`sales` int,
`stock` int
);
create table user_order(
`id` varchar(50) primary key,
`date` Date,
`status` varchar(20),
`user_id` int,
foreign key(`user_id`) references user(`id`)
);
create table user_cart(
`id` int,
`name` varchar(20),
`count` int,
`price` double,
`total_price` double,
`order_id` varchar(50),
foreign key(`order_id`) references user_order(`id`),
foreign key(`id`) references book(`id`));
insert into book values(null,"c语言","张三",20,200,300);
insert into book values(null,"c++","张三",20,200,300);
insert into book values(null,"java","张三",20,200,300);
insert into book values(null,"python","张三",20,200,300);
insert into book values(null,"my sql","张三",20,200,300);
insert into book values(null,"spring","张三",20,200,300);
insert into user values(null,"测试用户","123456");
