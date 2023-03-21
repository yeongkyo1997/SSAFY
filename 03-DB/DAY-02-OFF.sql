create table tb_tran(
    val varchar(10)
);

start transaction;

insert into tb_tran(val) values('a');

insert into tb_tran(val) values('b');

delete from tb_tran;

select *
    from tb_tran;
rollback;