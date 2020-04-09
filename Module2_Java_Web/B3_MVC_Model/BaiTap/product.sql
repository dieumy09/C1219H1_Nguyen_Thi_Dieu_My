create database product;
use product;
create table product (
	id int ,
    name varchar(50),
    price int,
    description varchar(50),
    producer varchar(50)
 );
 
 insert into product(id, name, price, description, producer) value
	(1, "Knor", 15000, "che bien va an uong" , "Unilever"),
	(2, "Dove", 40000, "ve sinh va cham soc ca nhan" , "Unilever"),
	(3, "Lifebouy", 30000, "ve sinh va cham soc ca nhan" , "Unilever"),
	(4, "Closeup", 10000, "Ve sinh va cham soc ca nhan" , "Unilever"),
	(5, "Comfort", 25000, "dung dich giat tay" , "Unilever");

select * from product;