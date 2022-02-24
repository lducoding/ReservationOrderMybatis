INSERT INto restaurant(name,location,daily_profit,weekly_profit) values('피자스쿨 경안점','경기도 광주시 경안동 28-56',15,90);
INSERT INto restaurant(name,location,daily_profit,weekly_profit) values('옥동식','서울특별시 마포구 서교동 양화로7길 44-10',30,200);
INSERT INto restaurant(name,location,daily_profit,weekly_profit) values('푸짐한 분식','경기도 광주시 탄벌동 12-33',18,120);
INSERT INto restaurant(name,location,daily_profit,weekly_profit) values('교촌치킨 탄벌점','경기도 광주시 탄벌동 11-667',30,180);
INSERT INto restaurant(name,location,daily_profit,weekly_profit) values('칼국수','경기도 광주시 역동 10-1',20,100);
INSERT INto restaurant(name,location,daily_profit,weekly_profit) values('간장게장','경기도 광주시 경안동 경안로 42번길',40,250);

INSERT INto time_table(res_id) values('1');
INSERT INto time_table(res_id) values('2');
INSERT INto time_table(res_id) values('3');
INSERT INto time_table(res_id) values('4');
INSERT INto time_table(res_id) values('5');
INSERT INto time_table(res_id) values('6');
INSERT INto time_table(res_id) values('7');


INSERT INto member(username ,password ,enabled ,birth,phone,email) values('seller','1234',1,'1984-12-12','016-1123-2233','lducoding@gmail.com');
INSERT INto member(username ,password ,enabled ,birth,phone,email) values('customer','king',1,'1994-04-12','010-2780-2233','lducoding@gmail.com');
INSERT INto role(name) values('seller');
INSERT INto role(name) values('customer');
INSERT INto user_role (user_id,role_id) values(1,1);
INSERT INto user_role (user_id,role_id) values(2,2);