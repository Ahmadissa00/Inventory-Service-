create table if not exists `order` (
    id bigint auto_increment primary key,
    total decimal(10, 2) not null,
    quantity bigint not null,
    placed_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    customer_id bigint ,
    event_id bigint ,
    foreign key (event_id) references event(id) on delete set null ,
    foreign key (customer_id) references customer(id) on delete set null
);