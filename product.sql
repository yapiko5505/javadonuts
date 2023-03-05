drop table product if exists;

create table product (
	id int auto_increment primary key, 
	name varchar(100) not null, 
	price int not null
);

insert into product values(null, 'ポンデドーナツ', 200);
insert into product values(null, 'チョコがけドーナツ', 250);
insert into product values(null, 'ダブルチョコレートドーナツ', 250);
insert into product values(null, 'チュロス', 200);
insert into product values(null, 'シュガーグレーズドーナツ', 200);
insert into product values(null, 'オールドファッションドーナツ', 200);
insert into product values(null, 'シナモンマサラダ', 200);
insert into product values(null, 'コーヒー', 250);
insert into product values(null, 'カフェオレ', 300);
insert into product values(null, '抹茶オレ', 300);