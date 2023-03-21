use board_db;

# 1
select curdate() as '현재', date_add(curdate(), interval 1 day) as '1일 후', date_add(curdate(), interval 1 week) as '1주일 후', date_add(curdate(), interval 1 month) as '1달 후';

# 2
select id, title, created_at 
from article
where date(created_at) between '2022-07-07' and '2022-07-08';

# 3
select str_to_date('2022년 07월 06일 13시 50분 20초', '%Y년 %m월 %d일 %H시 %i분 %s초') as '날짜';

# 4
select board_id, count(board_id), sum(view_cnt)
from article
group by board_id;

# 5


# 6
select user_seq, id
from article
where user_seq = 1 and article_id = (

