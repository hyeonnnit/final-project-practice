-- user 정보
insert into user_tb(role, username, password, person_name, phone, birth, email, gender, created_at) values(1, 'admin', '1234', '최주호', '010-1234-5678', '1970-12-03','admin@nate.com', 0, now());
insert into user_tb(role, username, password, person_name, phone, birth, email, gender, created_at) values(2, 'ssar', '1234', '이서현', '010-2222-2222', '1980-03-21','ssar@nate.com', 1,now());
insert into user_tb(role, username, password, person_name, phone, birth, email, gender, created_at) values(2, 'cos', '1234', '심유주', '010-3333-3333', '1988-09-22','cos@nate.com', 1,now());
insert into user_tb(role, username, password, person_name, phone, birth, email, gender, created_at) values(2, 'love', '1234', '이소연', '010-4444-4444', '1999-01-26','love@nate.com', 1,now());

-- product 정보
INSERT INTO product_tb(name, price, qty, img, created_at) VALUES ('성주 참외 1.5kg(4~7입)', 17900, 100, 'prod_3.jpg' ,NOW());
INSERT INTO product_tb(name, price, qty, img, created_at) VALUES ('바나나 실속 2종', 4800, 100, 'prod_4.jpg', NOW());
INSERT INTO product_tb(name, price, qty, img, created_at) VALUES ('당도선별 천혜향 1kg(4~6입)', 15000, 100, 'prod_1.jpg',NOW());
INSERT INTO product_tb(name, price, qty, img, created_at) VALUES ('대추 방울 토마토 750g', 9900, 100,'prod_2.jpg', NOW());
INSERT INTO product_tb(name, price, qty, img, created_at) VALUES ('애플청포도 500g', 11900, 100, 'prod_7.jpg',NOW());
INSERT INTO product_tb(name, price, qty, img, created_at) VALUES ('사과 4kg 이상', 28000, 100, 'prod_6.jpg',NOW());

-- cart 정보
INSERT INTO cart_tb(user_id, product_id, order_qty, is_checked, created_at) VALUES (2, 1, 20, false, NOW());
INSERT INTO cart_tb(user_id, product_id, order_qty, is_checked, created_at) VALUES (2, 3, 10, false, NOW());
INSERT INTO cart_tb(user_id, product_id, order_qty, is_checked, created_at) VALUES (2, 4,  5, false, NOW());
INSERT INTO cart_tb(user_id, product_id, order_qty, is_checked, created_at) VALUES (3, 2, 15, false, NOW());
INSERT INTO cart_tb(user_id, product_id, order_qty, is_checked, created_at) VALUES (3, 5, 10, false, NOW());
INSERT INTO cart_tb(user_id, product_id, order_qty, is_checked, created_at) VALUES (4, 2,  3, false, NOW());
INSERT INTO cart_tb(user_id, product_id, order_qty, is_checked, created_at) VALUES (4, 3,  20, false, NOW());