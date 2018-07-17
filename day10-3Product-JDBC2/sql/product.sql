prodcode MEMBER(4)
prodname VARCHAR(50)
price    NUMBER(12)
quantity NUMBER(3)
regdate  DATE       DEFAULT sysdate
moddate  DATE       
pk_product : prodcode

CREATE TABLE PRODUCT(
    prodcode NUMBER(4)
   ,prodnae  VARCHAR(50)
   ,price    NUMBER(12)
   ,quantity Number(3)
   ,regdate  DATE   DEFAULT sysdate
   ,moddate  DATE
   ,CONSTRAINT pk_product PRIMARY KEY(prodcode)
);

SELECT p.PRODCODE
  FROM product p
 WHERE p.PRODCODE = ?
;

INSERT INTO PRODUCT(PRODCODE, PRODNAME, PRICE, QUANTITY)
VALUES(?, ?, ?, ?)
;



