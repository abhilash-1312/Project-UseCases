create table Books(
    bookid int primary key,
    title varchar(50),
    category varchar(50)
);

create table Students(
    studentid int primary key,
    name varchar(50)
);

create table IssuedBooks(
    issueid int primary key,
    studentid int,
    bookid int,
    issuedate date,
    returndate date
);

select s.studentid,s.name
from Students s
join IssuedBooks ib on s.studentid = ib.studentid
where ib.returndate is null
and ib.issuedate<sysdate-14;

select b.category,count(*) as BorrowCount
from IssuedBooks ib
join Books b on ib.bookid=b.bookid
group by b.category;

delete from Students
where studentid not in(
    select studentid
    from IssuedBooks
    where issuedate>=sysdate-(3*365)
);