CREATE table restaurant(
                           id int not null auto_increment primary key,
                           name varchar(40),
                           location varchar(100),
                           daily_profit int,
                           weekly_profit int
)

ALTER TABLE time_table

    ADD CONSTRAINT fkey

        FOREIGN KEY (res_id)

            REFERENCES restaurant (id);



CREATE table time_table(
                           id int not null auto_increment primary key,
                           res_id varchar(20),
                           t0H int,
                           t1 int,
                           t1H int,
                           t2 int,
                           t2H int,
                           t3 int,
                           t3H int,
                           t4 int,
                           t4H int,
                           t5 int,
                           t5H int,
                           t6 int,
                           t6H int,
                           t7 int,
                           t7H int,
                           t8 int,
                           t8H int,
                           t9 int,
                           t9H int,
                           t10 int,
                           t10H int,
                           t11 int,
                           t11H int,
                           t12 int,
                           t12H int,
                           t13 int,
                           t13H int,
                           t14 int,
                           t14H int,
                           t15 int,
                           t15H int,
                           t16 int,
                           t16H int,
                           t17 int,
                           t17H int,
                           t18 int,
                           t18H int,
                           t19 int,
                           t19H int,
                           t20 int,
                           t20H int,
                           t21 int,
                           t21H int,
                           t22 int,
                           t22H int,
                           t23 int,
                           t23H int,
                           t24 int,
                           foreign key (res_id)  references restaurant (id)
)

CREATE table member(
                       id varchar(20) not null primary key,
                       pass varchar(50),
                       role varchar(10),
                       name varchar(10),
                       birth date,
                       phone varchar(20),
                       email varchar(25)
)

