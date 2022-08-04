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
                       id bigint not null auto_increment primary key,
                       username varchar(50) not null unique,
                       password varchar(100) not null,
                       enabled bit(1) not null,
                       birth date not null,
                       phone varchar(20) not null,
                       email varchar(25) not null
)

CREATE table role(
                     id bigint not null auto_increment primary key,
                     name varchar(50) not null unique
)

CREATE TABLE `user_role` (
                             `user_id` bigint NOT NULL,
                             `role_id` bigint NOT NULL,
                             PRIMARY KEY (`user_id`,`role_id`),
                             KEY `user_role_FK_1` (`role_id`),
                             CONSTRAINT `user_role_FK` FOREIGN KEY (`user_id`) REFERENCES `member` (`id`),
                             CONSTRAINT `user_role_FK_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci



CREATE TABLE `restaurant_menu` (
                                   `restaurant_id` int NOT NULL,
                                   `menu` varchar(100) not null,
                                   CONSTRAINT `restaurant_id_FK` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

CREATE table RES_USER (
                          res_user_id bigint not null auto_increment primary key,
                          pass varchar(100),
                          name varchar(40),
                          email varchar(50),
                          roles varchar(20),
                          birth varchar(20),
                          mileage int
)

CREATE table RESTAURANT (
                            restaurant_id bigint not null auto_increment primary key,
                            res_user_id bigint,
                            goal_id bigint,
                            location varchar(100),
                            restaurant_name varchar(100),
                            category varchar(10),
                            standard_time int,
                            FOREIGN KEY (res_user_id)
                                REFERENCES RES_USER(res_user_id) ON DELETE CASCADE
)

CREATE table RESERVATION (
                             reservation_id bigint not null auto_increment primary key,
                             res_user_id bigint,
                             restaurant_id bigint,
                             reservation_date varchar(30),
                             reservation_status varchar(10),
                             FOREIGN KEY (res_user_id)
                                REFERENCES RES_USER(res_user_id) ON DELETE CASCADE,
                             FOREIGN KEY (restaurant_id)
                                REFERENCES RESTAURANT(restaurant_id) ON DELETE CASCADE
)

CREATE table MENU (
                      menu_id bigint not null auto_increment,
                      restaurant_id bigint not null,
                      menu_name varchar(20),
                      menu_price int,
                      menu_img blob,
                      FOREIGN KEY (restaurant_id)
                        REFERENCES RESTAURANT(restaurant_id) ON DELETE CASCADE,
                      PRIMARY KEY(menu_id, restaurant_id)
)

CREATE table GOAL (
                      goal_id bigint not null auto_increment primary key,
                      restaurant_id bigint,
                      goal_type varchar(10),
                      goal_money int,
                      recent_money int,
                      success varchar(1),
                      register_data date,
                      FOREIGN KEY (restaurant_id)
                          REFERENCES RESTAURANT(restaurant_id) ON DELETE CASCADE
)