drop table customer;
drop procedure sp_insert_customer;
drop sequence seq_cust_userid;

CREATE TABLE customer
(   userid  VARCHAR2(4)
   ,name    VARCHAR2(15)    NOT NULL
   ,birthday    NUMBER(4)
   ,address VARCHAR2(50)
   ,phone   VARCHAR2(13)
   ,grade   VARCHAR2(6) DEFAULT 'SILVER'
   ,regdate DATE
   ,moddate DATE
   ,CONSTRAINT pk_customer_userid PRIMARY KEY(userid)
   ,CONSTRAINT ck_customer_grade CHECK (grade IN('SILVER', 'GOLD', 'VIP')) 
);


CREATE SEQUENCE seq_cust_userid
START WITH 1
NOCYCLE;

CREATE OR REPLACE PROCEDURE SP_INSERT_CUSTOMER
(  v_name       IN  customer.name%TYPE
  ,v_address    IN  customer.address%TYPE  
  ,v_phone      IN  customer.phone%TYPE
  ,v_msg        OUT VARCHAR2
)
IS
   v_new_userid     customer.userid%TYPE;
BEGIN
   v_new_userid := 'C' || LPAD(seq_cust_userid.nextval, 3 , '0');
   
   INSERT INTO customer(userid, name, address, phone)
   VALUES (v_new_userid, v_name, v_address, v_phone)
   ;
   
   commit;
   
   v_msg := v_new_userid || ' : ' || v_name || '정보가 저장되었습니다.';   
END SP_INSERT_CUSTOMER;
