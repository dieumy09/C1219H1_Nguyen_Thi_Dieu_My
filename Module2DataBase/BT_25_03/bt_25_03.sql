create database bt_25_03;
use  bt_25_03;

-- table structure for table categories
create table categories (
	id int(11) not null primary key,
    name varchar(50),
    description varchar(500)
);

-- table structure for table  suppliers
create table suppliers (
	id int(11) primary key,
    name varchar(100),
    email varchar(50),
    phone_number varchar(20),
    address varchar(500)
);

-- table structure for table employees
create table employees (
	id int(11) primary key,
    first_name varchar(50),
    last_name varchar(50),
    phone_number varchar(20),
    address varchar(500),
    email varchar(50),
    birthday datetime
);

-- table structure for table customers
create table customers(
	id int(11) primary key,
    first_name varchar(50),
    last_name varchar(50),
    phone_number varchar(20),
    address varchar(500),
    email varchar(50),
    birthday datetime
);

-- table structure for table products
create table products(
	id int(11) primary key,
    name varchar(50),
    image_uri varchar(1000),
    price decimal(18,2),
    discount decimal(18,2),
    stock decimal(18,2),
    category_id int (11),
    supplier_id int(11),
    description varchar(1000),
    constraint fk_category_id foreign key (category_id) references categories(id),
    constraint fk_suppiler_id foreign key (supplier_id) references suppliers(id)
);

-- table structure for table orders
create table orders(
	id int(11) primary key,
    created_date datetime,
    shipped_date datetime,
    status varchar(50),
    description varchar(1000),
    shipping_address varchar(50),
    shipping_ctiy varchar(20),
    payment_type varchar(20),
    customer_id int(11),
    employee_id int(11),
    constraint fk_customer_id foreign key (customer_id) references customers(id),
    constraint fk_employee_id foreign key (employee_id) references employees(id)
);

-- table structure for table order_datails
create table order_details(
	id int(11) primary key,
    order_id int(11),
    product_id int(11),
    quantity decimal(18,2),
    constraint fk_order_id foreign key (order_id) references orders(id),
    constraint fk_product_id foreign key (product_id) references products(id)
);


    