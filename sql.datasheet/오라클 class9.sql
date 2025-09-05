-- sal 컬럼을 기준으로 오름차순 -작은것 부터 큰 것으로
SELECT
    *
FROM
    emp
ORDER BY
    sal;

SELECT
    *
FROM
    emp
ORDER BY
    sal ASC;

-- sal 컬럼 기준으로 내림차순 - 큰 것 부터
SELECT
    *
FROM
    emp
ORDER BY
    sal DESC;

SELECT
    *
FROM
    emp
ORDER BY
    hiredate ASC;

SELECT
    *
FROM
    emp
ORDER BY
    ename ASC;

SELECT
    *
FROM
    emp
ORDER BY
    job ASC;

SELECT
    *
FROM
    emp
ORDER BY
    sal ASC;

SELECT
    *
FROM
    emp
ORDER BY
    deptno ASC,
    sal DESC;
-- depento asc, sal desc; 이 상황에서 연봉이 같은 애들 사원번호로 내림차순 정렬하시오.

-- 부서번호로 오름차순, 겹치면 sal 내림차순

SELECT
    *
FROM
    emp
WHERE
    deptno = 30;
    
-- sal이 1600인 사람만 출력

SELECT
    *
FROM
    emp
WHERE
    sal = 1600;

-- 크다는 항상 왼 쪽 기호 기준 >
--작다는 항상 오른 쪽 기호 기준 <

SELECT
    *
FROM
    emp
WHERE
    sal >= 1600;

SELECT
    *
FROM
    emp
WHERE
    sal <= 1600;

-- 부정

SELECT
    *
FROM
    emp
WHERE
    deptno != 30;

SELECT
    *
FROM
    emp
WHERE
    deptno <> 30;

-- and 절

SELECT
    *
FROM
    emp
WHERE
        deptno = 30
    AND job = 'SALESMAN';
    
-- or
/*
    emp 테이블에서 사무번호가 30이거나(또는) 직책이 일반사원의 정보를 모두 알려주세요
*/

SELECT
    *
FROM
    emp
WHERE
    deptno = 30
    OR job = 'CLERK';

/*
    job이 clerk이거나 sal이 2000 초과이며, deptno가 10인 사원 조회
*/
SELECT
    *
FROM
    emp
WHERE
    ( job = 'CLERK'
      OR sal > 2000 )
    AND deptno = 10;
/*
    deptno != 30 === deptno <> 30 === deptno ^= 30 not deptno = 30
*/

-- 월급 2000이상 4000미만인 사원을 출력하시오

SELECT
    *
FROM
    emp
WHERE
        sal >= 2000
    AND sal < 4000; 

-- 부서번호 10 혹은 20인 사원만 출력

SELECT
    *
FROM
    emp
WHERE
    deptno NOT IN ( 10, 20 );

-- 5.13 복습 활용

-- 급여가 3000만원 미만이고, 판매원인 사람을 출력하시오

SELECT
    *
FROM
    emp
WHERE
        sal < 3000
    AND job = 'SALESMAN'; 

-- 급여가 3000만원 미만이고, 판매원인 직원의 사원번호를 오름차순으로 정렬하시오.

SELECT
    *
FROM
    emp
WHERE
        sal < 3000
    AND job = 'SALESMAN'
ORDER BY
    empno;

-- 부서번호가 10 혹은 20이고, 급여가 2000이상인 사원의 사번을 내림차순으로 정렬하시오.

SELECT
    *
FROM
    emp
WHERE
        sal >= 2000
    AND deptno IN ( 10, 20 )
ORDER BY
    empno DESC;
    
-- 부서번호가 10과 20이 아니며, 급여가 3000 미만인 사원의 입사일을 오름차순으로 정렬하시오.

SELECT
    *
FROM
    emp
WHERE
        sal < 3000
    AND NOT deptno IN ( 10, 20 )
ORDER BY
    hiredate;

--   5.14 start 
--1번
SELECT
    *
FROM
    emp
WHERE
    deptno = 10;
--2번
SELECT
    *
FROM
    emp
WHERE
    NOT deptno = 10;
--3번
SELECT
    *
FROM
    emp
WHERE
    sal >= 3000;
--4번
SELECT
    *
FROM
    emp
WHERE
    sal BETWEEN 1500 AND 3000;
--5번
SELECT
    *
FROM
    emp
WHERE
        sal >= 2000
    AND deptno = 10;
--6번
SELECT
    *
FROM
    emp
WHERE
        sal > 1500
    AND sal < 3000
    AND deptno = 30;
--선생님 답변 괄호를 쓸 수 있을 때는 괄호를 사용하는게 가독성이 좋다.
SELECT
    *
FROM
    emp
WHERE
        deptno = 30
    AND ( sal > 1500
          AND sal < 3000 );
--7번
SELECT
    *
FROM
    emp
WHERE
        sal > 1500
    AND sal < 3000
    AND deptno = 30
ORDER BY
    sal;
--8번
SELECT
    *
FROM
    emp
WHERE
        sal > 1500
    AND sal < 3000
    AND deptno IN ( 20, 30 )
ORDER BY
    sal;
-- 같은 컬럼이 = 혹은 or로 연결되어 있는 경우 in으로 변경할 수 있다.
--9번
SELECT
    ename,
    sal
FROM
    emp
WHERE
        sal >= 1500
    AND deptno IN ( 20, 30 )
ORDER BY
    sal,
    ename;
-- 원래 푸는 방식, between을 사용하지 않을 경우
SELECT
    *
FROM
    emp
WHERE
        sal >= 1500
    AND sal <= 3000
    AND deptno IN ( 20, 30 )
ORDER BY
    sal;
-- between
SELECT
    *
FROM
    emp
WHERE
    sal NOT BETWEEN 2000 AND 3000
    AND deptno IN ( 20, 30 )
ORDER BY
    deptno;
--between으로 초과 미만을 적용시키는 방법
SELECT
    *
FROM
    emp
WHERE
    sal BETWEEN 2000 AND 3000
    AND sal != 2000
    AND sal != 3000;
-- LIKE= 검색할 때 주로 사용한다.
SELECT
    *
FROM
    emp
WHERE
    ename LIKE 'S%';

SELECT
    *
FROM
    emp
WHERE
    ename LIKE '_L';
-- 첫 째는 상관x, 둘 째는 무조건 L 그 이후로는 상관x

SELECT
    *
FROM
    emp
WHERE
    ename LIKE '%AM%';
    
--null은 계산이 안된다. null은 조건에서 빠진다. 값이 없다. 없는 상태

SELECT
    *
FROM
    emp
WHERE
    comm > 400;

-- union 유니온은 결합이란 뜻으로, 위 아래를 합쳐준다.
-- union 보다는 union all을 더 많이 사용한다.

SELECT
    *
FROM
    emp
WHERE
    comm IS NULL;

SELECT
    *
FROM
    emp
WHERE
    deptno = 10
UNION ALL
SELECT
    *
FROM
    emp
WHERE
    deptno = 10;

SELECT
    empno
FROM
    emp
UNION ALL
SELECT
    sal
FROM
    emp;

--p 130문제

--1번
SELECT
    *
FROM
    emp
WHERE
    ename LIKE '%S';

--2번
SELECT
    empno,
    ename,
    job,
    sal,
    deptno
FROM
    emp
WHERE
    job = 'SALESMAN';
    
--3번-1 (집합 연산자를 사용한 방식)
SELECT
    empno,
    ename,
    job,
    sal,
    deptno
FROM
    emp
WHERE
    deptno IN ( 20, 30 )
MINUS
SELECT
    empno,
    ename,
    job,
    sal,
    deptno
FROM
    emp
WHERE
    sal < 2000;
    
--3번-2 (집합 연산자를 사용하지 않은 방식)
SELECT
    empno,
    ename,
    job,
    sal,
    deptno
FROM
    emp
WHERE
        sal > 2000
    AND deptno IN ( 20, 30 );
--4번
SELECT
    *
FROM
    emp
WHERE
    NOT ( sal >= 2000
          AND sal <= 3000 );
-- 부서 10번을 사원번호 내림차순으로 정렬하여 출력

-- 아직 안배운 기술로 order by  적용 가능
SELECT
    *
FROM
    (
        SELECT
            *
        FROM
            emp
        WHERE
            deptno = 10
        UNION ALL
        SELECT
            *
        FROM
            emp
        WHERE
            deptno = 20
    )
ORDER BY
    deptno;
-- 5번
SELECT
    ename,
    empno,
    sal,
    deptno
FROM
    emp
WHERE
    ename LIKE '%E%'
    AND deptno = 30
    AND sal NOT BETWEEN 1000 AND 2000;
--6번
SELECT
    *
FROM
    emp
WHERE
    comm IS NULL
    AND ( job = 'MANAGER'
          OR job = 'CLERK' )
    AND mgr IS NOT NULL
    AND ename NOT LIKE '_L%';

SELECT
    ename,
    upper(ename),
    lower(ename),
    initcap(ename)
FROM
    emp;

SELECT
    ename
FROM
    emp
WHERE
    lower(ename) LIKE lower('%aM%');

SELECT
    lower('aBc'),
    upper('abc')
FROM
    dual;

SELECT
    ename,
    length(ename)
FROM
    emp
WHERE
    length(ename) = 5;

-- 어제 배운 거, between, like, null(is null), union(union all, minus), 함수 맛보기)

--사원 이름을 두번 째 부터 3글자만 출력

SELECT
    substr(ename, 2, 3)
FROM
    emp;

SELECT
    substr(ename, 20, 300)
FROM
    emp; -- 실제 글시 길이보다 넘어가면 null 이 나온다.
SELECT
    job,
    substr(job, -4, 2)
FROM
    emp;

SELECT
    job,
    substr(job, -40, 2)
FROM
    emp; -- 이 친구도 넘어가면 null이 나온다.
-- 이름의 뒤에 3글자 만 모두 출력하기.
SELECT
    ename,
    substr(ename, -3)
FROM
    emp;
--ename의 E를 '-'로 모두 교체
SELECT
    ename,
    replace(ename, 'E', '-')
FROM
    emp;
--ename을 이용하여 10자리로 만든다.
SELECT
    rpad(ename, 2, '@')
FROM
    emp;
--rpad 모자르면 채우고 넘치면 자르고
-- 이름을 마스킹하는 버전1
-- 앞에 두글자만 원본은 출력한다. 나머지는 4개의 별 표로 표시한다.
SELECT
    ename,
    rpad(ename, 2),
    substr(ename, 1, 2)
FROM
    emp;
-- 문제2
-- 앞에 두글자만 원본을 출력하고 나머지는 4개의 $로 표시
SELECT
    ename,
    substr(substr(ename, 1, 2))
FROM
    emp;

--문제 3 사원 이름 두글자만 보이고 나머지로, 단 원래 이름 길이만큼 표시

SELECT
    ename,
    rpad(
        substr(ename, 1, 2),
        6,
        '#'
    )
FROM
    emp;

--이름을 총 20자 중 가운데 정렬
--| 파이프

SELECT
    empno
    || ' : '
    || ename
FROM
    emp;

SELECT
    '  ab   c    d',
    TRIM('  ab   c    d')
FROM
    dual;
-- round
SELECT
    round(14.46), -- 하나만 입력하면 소수점 첫째자리 반올림
    round(14.46, 1),-- 소수점 두번 째 자리
    round(14.46, -1)
FROM
    dual;

SELECT
    trunc(14.46),
    trunc(14.46, 1),
    trunc(14.46, -1),
    trunc(-14.46)
FROM
    dual;

SELECT
    ceil(3.14),
    floor(3.14),
    ceil(-3.14),
    floor(-3.14),
    trunc(-3.14)
FROM
    dual;

SELECT
    sysdate,
    add_months(sysdate, 3)
FROM
    dual;

SELECT
    sysdate,
    to_char(sysdate, 'yyyy/mm/dd hh24:mi:ss') AS 현시각
FROM
    dual;

SELECT
    sal,
    to_char(sal, 'yyyy/mm/dd hh24:mi:ss') AS 현시각
FROM
    emp;

SELECT
    TO_DATE('2004/10/04', 'yyyy/mm/dd') - TO_DATE('2025/10/04', 'yyyy/mm/dd')
FROM
    dual;

SELECT
    *
FROM
    emp
WHERE
    hiredate > TO_DATE('1981-06-01', 'YYYY-MM-DD');

SELECT
    ename,
    sal * 12 + comm,
    sal * 12 + nvl(comm, 0)
FROM
    emp;


-- 각 사원의 연봉을 출력합니다, 그런데 월급*12 +comm
-- ename, 컬렴명 total_pay 출력

SELECT
    ename,
    sal,
    sal * 12 + nvl(comm, 0) AS total_pay
FROM
    emp;

SELECT
    empno,
    ename,
    job,
    sal,
    decode(job, 'MANAGER', sal * 1.1, 'SALESMAN', sal * 1.05,
           'ANALYST', sal, sal * 1.03) AS upsal
FROM
    emp;

SELECT
    empno,
    ename,
    job,
    sal,
    CASE job
        WHEN 'MANAGER'  THEN
            sal * 1.1
        WHEN 'SALESMAN' THEN
            sal * 1.05
        WHEN 'ANALYST'  THEN
            sal
        ELSE
            sal * 1.03
    END AS upsal
FROM
    emp;
-- nvl 사용하지 않고 decode case로 nvl이랑 동이할 결과 출력하기

SELECT
    nvl(comm, -1)
FROM
    emp;

SELECT
    decode(comm, NULL, -1, comm)
FROM
    emp;

SELECT
    comm,
    CASE
        WHEN comm IS NULL THEN
            '노수당'
        WHEN comm = 0 THEN
            '0원'
        WHEN comm > 0 THEN
            '급여 : ' || comm
    END AS case
FROM
    emp;

--1

SELECT
    empno,
    rpad(
        substr(empno, 1, 2),
        length(empno),
        '*'
    ) AS masking_empno,
    ename,
    ename,
    rpad(
        substr(ename, 1, 1),
        6,
        '*'
    ) AS nasking_ename
FROM
    emp
WHERE
    length(ename) = 5;

-- 월 평균 근무일 수는 21.5일. 하루 근무시간을 8시간. 하루급여. 시급. 계산 결과 출력.
-- 하루급여는 소수 셋째 자리에서 trunc, 시급은 소수 둘째 자리에서 round.

SELECT
    empno,
    ename,
    sal,
    trunc(sal / 21.5, 2),
    round(sal / 21.5 / 8, 1)
FROM
    emp;

SELECT
    mgr
FROM
    emp;

SELECT
    empno,
    ename,
    mgr,
    CASE
        WHEN mgr IS NULL THEN
            '0000'
        WHEN mgr LIKE '75%' THEN
            '5555'
        WHEN mgr LIKE '76%' THEN
            '6666'
        WHEN mgr LIKE '77%' THEN
            '7777'
        WHEN mgr LIKE '78%' THEN
            '8888'
        ELSE
            to_char(mgr)
    END
FROM
    emp;

select
    case
        when substr(mgr, 2, 1) = 5 or
    lapd(substr(mgr,2,1), 4, substr(mgr,2,1))
    from emp;

select sum(sal)
    from emp;

select count(*), count(comm), sum(comm)
    from emp;

-- 이름에 a가 들어가는 사람 
select count(*) from emp
where ename like '%A%';

select avg(sal)
from emp;

-- 다중행 함수, (집계 함수)는 where에서 사용할 수 없다.
-- 제일 많이 쓰는 건 카운트와 sum이다.!
select avg(sal), deptno
    from emp    
    group by deptno;
    
select job from emp
    group by job;

select job from emp
where deptno = 10
group by job;

select job, deptno, avg(sal) from emp 
group by deptno, job
having avg(sal) > 2000;

select job, count(*) as cnt
from emp
where sal > 1000 -- and cnt > 3;
group by job
having count(*) > = 3
order by cnt desc;

select * from emp, dept
order by empno;

select * from emp, dept
    where emp.deptno = dept.deptno
    order by empno;

select * from emp e, dept d
    where e.deptno = d.deptno
    order by empno;

--select ename from emp e, dept d
--    where e.deptno = d.deptno;
-- 별표와 컬럼은 동시에 쓰지 못한다.

select e1.empno, e1.ename, e1.mgr,
       e2.empno as 상사,
       e2.ename as 상사명
       from emp e1, emp e2
       where e1.mgr = e2.empno;
--조인할 때 테이블 개 수 -1개 이상의 조건이 있는게 대부분이다.

select e1.empno, e1.ename, e1.mgr,
    e2.empno as 상사번호,
    e2.ename as 상사명
    from emp e1, emp e2
    where e1.mgr = e2.empno(+)
    order by e1.empno;    

select empno, ename, deptno
from emp e join dept d using(deptno)
where sal>=3000;

select empno, ename, e.deptno
from emp e join dept d on(e.deptno = d.deptno)
where sal>=3000;
    

select e1.empno, e1.ename, e1.sal,
       e2.empno as 사원번호
       e2.sal as 급여
       from emp e1, emp e2
       where e1.sal = e2.empno;
       
select e1.empno, e1.ename, e1.mgr,
       e2.empno as 상사사원번호,
       e2.ename as 상사명
       from emp e1, emp e2
       where e1.mgr = e2.empno;
       
select * from emp,dept;

select * from 
emp e1 right outer join emp e2 on(e1.mgr = e2.empno);

select * from 
emp e1 left outer join emp e2 on(e1.mgr = e2.empno);

select * from 
emp e1 full outer join emp e2 on(e1.mgr = e2.empno);

--q1
select e.deptno, d.dname, e.empno, e.ename, e.sal 
from emp e join dept d on(e.deptno = d.deptno)
    where sal >2000
    order by d.deptno;
    
--q2.

select 
    e.deptno, 
    d.dname, 
    floor(avg(e.sal)),
    max(e.sal), 
    (min(e.sal)), 
    count(e.deptno)
    from emp e join dept d on(e.deptno = d.deptno)
    group by e.deptno, d.dname;
    
--q3. 테이블 2개 e.d 쪼인 1개

select 
    d.deptno, 
    d.dname, 
    e.empno, 
    e.ename, 
    e.job, 
    e.sal
     from dept d 
     left outer join emp e on(e.deptno = d.deptno)
     order by deptno, ename;
    
--q4. 테이블 4개 써야 함. e1, e2, d, s. 쪼인 3개  
select 
    d.deptno,          
    d.dname,           
    e1.empno,          
    e1.ename,         
    e1.mgr,   
    e1.sal,   
    d.deptno,
    s.grade,
    s.losal,
    s.hisal,
    e2.empno as mgr_empno,   
    e2.ename as mgr_ename    
from dept d
    left outer join emp e1 on d.deptno = e1.deptno
    left outer join emp e2 on e1.mgr = e2.empno
    left outer join salgrade s on e1.sal >= s.losal and e1.sal <= s.hisal
order by 
    d.deptno, 
    e1.empno, 
    e1.sal;

-- 깜짝퀴즈 
-- 각 부서별로 
-- 가장 높은 사람, 가장 낮은 사람의 급여 차이
select  deptno 부서번호,
        max(sal) 최고액, 
        min(sal) 최저액, 
        max(sal)- min(sal) 차액  
        from emp
        group by deptno;
-- job을 총 20자 중 
--    가운데 정렬
-- 전체 길이의 반-글씨 길이의 반
-- 일단 왼쪽 채우고 다음에 오른 쪽 채우자

select *
    from emp
    where sal > (select sal
                from emp
                where ename = 'JONES');

select *
    from emp
    where hiredate <=(select hiredate
                    from emp
                    where ename = 'SCOTT');

-- 전체 평균보다 급여를 많이 받는 사원을 뽑아보자
select * from emp
    where sal > ( select avg(sal)
                    from emp
                    );

select * 
        from emp
        where sal in 
        (select max(sal) from emp
        group by deptno);

select * from emp;
select * from emp, dept 
        where emp.deptno = dept.deptno;

select 
        e10.empno, 
        e10.ename, 
        e10.deptno, 
        d.dname, 
        d.loc
        from (select * from emp where deptno = 10) e10, 
        (select * from dept) d
        where e10.deptno = d.deptno;

select *
        from
        (select * from emp where deptno = 10) e10,
        dept d
        where e10.deptno = d.deptno;

select *
from (
        select job, count(*) cnt
        from emp
        group by job
        )
        where cnt >= 3;

select rownum, emp.*
from emp;

select *from(
select rownum rn, emp.*
from emp)
    where rn > 3 and rn < 6;
    
select rownum rn, emp.*
from emp;


select rownum rn, e.*
    from
    (
    select emp.*
    from emp 
    order by sal desc
    )
    e;

-- 왜 이렇게 할 수밖에 없었는가 기억하라.

select *
    from
    (  select rownum rn, e.*
    from(
    select emp.*
    from emp
    order by sal desc
    )e
    )
    where rn > 2 and rn <4 ;

with e10 as(
    select * from emp where deptno = 10
)
select ename from e10;

select empno, ename, job, sal,
        (select grade
        from salgrade
        where e.sal between losal and hisal) as 셀그,
        deptno,
        (select dname
        from dept
        where e.deptno = dept.deptno) as 디넴
        from emp e
        order by 셀그;

--전체 사원 중 ALLEN씨와 같은 직책인 사원정보/부서정보

select e.job,
       e.empno,
       e.ename,
       e.sal,
       e.deptno,
       d.dname
        from emp e
        join dept d on e.deptno = d.deptno
 where job = 'SALESMAN' 
 order by e.ename;



--전체사원의 평균급여보다 많이 받는 사원 정보. 부서 정보. 급여 등급정보.
select 
    *
from  emp e
     join dept d on e.deptno = d.deptno
     join salgrade s on e.sal >= s.losal and e.sal <= s.hisal
where e.sal > (select avg(sal) from emp);


--10번부서에서 근무하는 사원 중 30번 부서에 없는 직책인 사원의 사원정보

select  e.empno,
        e.ename,
        e.job,
        e.deptno,
        d.dname,
        d.loc
        from 
        emp e
        join dept d on e.deptno = d.deptno 
where e.deptno = 10 and job not in(
select job from emp 
where deptno = 30);
--직책이 SALESMAN인 사람의 최고 급여보다 많이 받는 사원의 정보

select * 
        from 
        emp e
    join salgrade s on e.sal >= s.losal and e.sal <= s.hisal
    where sal >
(select max(sal) from emp
    where job = 'SALESMAN');

-- q1.
 select * from emp
    where comm is null
    order by sal desc;
--q2. 급여 등급 별 사원 수를 등급 오름차 순으로 정렬 단, 모든 등급을 표시한다.
select e.sal,
      s.grade
    from 
    emp e
    join salgrade s on e.sal >= s.losal and e.sal <= s.hisal
    group by s.grade
    order by s.grade;
--이름, 급여, 급여 등급, 부서이름 조회,
--단, 급여 등급 3 이상만 조회. 급여 등급 내림차순, 급여 등급이 같은 경우 급여 내림 차순

select 
       e.ename,
       e.sal,
       s.grade,
       e.deptno
    from 
    emp e
    join salgrade s on e.sal >= s.losal and e.sal <= s.hisal
    where s.grade > =3
    order by s.grade desc, e.sal desc;
    
--부서명이 SALES인 사원 중 급여 등급이 2 또는 3인 사원을 급여 내림차순으로 정렬

select 
       e.empno,
       e.job,
       s.grade
    from 
    emp e
    join dept d on e.deptno = d.deptno
    join salgrade s on e.sal >= s.losal and e.sal <= s.hisal
    where (s.grade = 2 or s.grade = 3) and dname = 'SALES'
    order by sal desc;
 
 
-- ---------------------------------------------------------------
desc bonus;

create table emp_ddl(
empno NUMBER(4),
ename VARCHAR2(10),
job   VARCHAR2(9),
mgr number(4),
hiredate date,
sal number(7,2),
comm number(7,2),
deptno number(2)
);
desc emp_ddl;
select * from emp_ddl;

create table dept_ddl
    as select * from dept;
    
desc dept_ddl;
select * from dept_ddl
    where deptno = 10;
    
create table emp_ddl_30
as select * from emp
where deptno =30;

select * from emp_ddl_30;

create table empdept_ddl
    as select e.empno,
              e.ename,
              e.job,
              e.mgr,
              e.hiredate,
              e.sal,
              e.comm,
              d.deptno,
              d.dname,
              d.loc
              from emp e, dept d
              where 1 <> 1;
              
select * from empdept_ddl;

create table emp_alter
    as select * from emp;
    
select * from emp_alter;

alter table emp_alter
    add hp varchar2(20);
    
alter table emp_alter
    add age number(3) default 2;
    
alter table emp_alter
    rename column hp to tel;
    select * from emp_alter;
    
alter table emp_alter
    modify empno number(5);

desc emp_alter;
    
    alter table emp_alter
    modify empno number(4);

alter table emp_alter
    drop column age;
    
    select * from emp_alter;

rename emp_alter to 테이블;

rename emp_rename to 테이블;

select * from 테이블;

truncate table 테이블;

select * from 테이블;

drop table 테이블;

select * from 테이블;
------------------------------------------------------
--10장 insert into 와 values 가 짝꿍
-- update와 set이 짝꿍

create table dept_temp
as select * from dept;

select * from dept_temp;

insert into dept_temp (deptno, dname, loc)
            values(50, 'database', 'seoul');
            
select * from dept_temp;1

insert into dept_temp
    values (60, 'network','busan');
    
    select * from dept_temp;

insert into dept_temp (deptno, dname, loc)
values (70, 'web',null);

insert into dept_temp (deptno, dname, loc)
values (80, 'mobile',null);

insert into dept_temp (deptno, loc)
values (90, 'incheon');

create table emp_temp
    as select * from emp
    where 1 ^= 1;
    
select * from  emp_temp;

insert into emp_temp (empno, ename, hiredate)
values ( 2111, '이순신', to_date('2025-05-21', 'YYYY-MM-DD'));

insert into emp_temp (empno, ename, hiredate)
values ( 3111, '심청이', sysdate); 

insert into emp_temp
select * from emp where deptno = 10;
---------------------------------------------------------
create table dept_temp2
    as select * from dept;
    select * from dept_temp2;
    
update dept_temp2
    set loc = 'seoul';

-- rollback 절대로 롤백을 하지 말 것
-- update, delete의 where를 무조건 select에서 검증하고 사용하기.
update dept_temp2
set dname = 'database',
    loc = 'seoul2'
where deptno = 40;

select * from dept_temp2
where deptno = 40;

create table emp_tmp
as select * from emp;
select * from emp_tmp;

select sal, sal*1.03 from emp_tmp
    where sal < 1000;

update emp_tmp
set sal = sal*1.03
where sal < 1000;

select * from emp_tmp
 where sal < 1000;
 
 create table emp_temp2
 as select * from emp;
 
 select * from emp_temp2;
 
 
 rollback;
 
 delete emp_temp2
 where comm is null;
 
 create table emp_04
 as select * from emp;
 
 
 create table emp_tmp10
    as select * from emp;
 
 select * from emp_tmp10
    where sal > 1000;
    
update emp_tmp10
    set sal = round(sal*1.03)
    where sal > 500;  
    

select * from emp_tmp10;
 
 update dept_temp2
    set dname = (select dname
                from dept  
                where deptno = 40),
        loc = (select loc
                from dept
                where deptno = 40)
where deptno = 40;
 
 select * from dept_temp2;
 
 create table emp_temp2
    as select * from emp;
    
select * from dict;

select  table_name
    from user_tables;
    
select * 
    from user_indexes;
    
create index idx_emp_sal
    on emp(sal);


select/*+ index(e idx_emp_sal) */ --강제 힌트 
* 
from emp e
where sal = 2000;

create view vw_emp20
    as(select empno, ename, job, deptno from emp
       where deptno = 20);
       
       select * rom vw_emp20;

create sequence seq_dept123
    start with 10;

select seq_dept123.nextval
    from dual;

select seq_dept123.currval
    from dual;
    
insert into dept_temp (deptno, dname, loc)
values (seq_dept123.nextval, '테스트', '천안');
select * from dept_temp;

--인덱스는 얼터가 없다

create table table_pk(
    login_id varchar2(20)  primary key,
    login_pwd varchar2(20) not null,
    tel       varchar2(20)
    );

desc table_pk;

select * from user_indexes;

insert into table_pk
values('ID', 'PW', null);
--null로 추가
update table_pk
set login_id = null
where login_id = 'ID';
--개체무결성
select * from table_pk;

create table dept_fk(
    deptno number(2) constraint 
    deptfk_deptno_pk primary key,
    dname varchar2(14),
    loc varchar2(13)
    );

insert into dept_fk
    values ( 10, '부서' ,'위치');

insert into emp_fk
    values( 100, '이름', '10');

select * from dept_fk
;

update dept_fk
    set deptno = 20
where deptno = 10;

delete dept_fk
    where deptno = 10;

delete emp_fk
    where deptno = 10;



create table emp_fk( 
    empno number(4) constraint pk_emp_fk primary key,
    ename varchar2(10),
    deptno number(2) constraint fk_emp_fk references dept_fk (deptno));

select * from emp_fk;




--RDBMS 에서 R을담당

-- 테이블 생성
create table restaurant (
    restaurant_id varchar2(20) primary key,
    name varchar2(20),
    address varchar2(20),
    phone varchar2(11)
);

create table menu (
    menu_id varchar2(20) primary key,
    restaurant_id varchar2(20),
    menu_name varchar2(20),
    price varchar2(20),
    foreign key (restaurant_id) references restaurant(restaurant_id)
);

create table member (
    member_id varchar2(20) primary key,
    name varchar2(20),
    phone varchar2(11),
    address varchar2(20)
);

create table orders (
    order_id varchar2(20) primary key,
    member_id varchar2(20),
    restaurant_id varchar2(20),
    address varchar2(20),
    request varchar2(20),
    totalprice varchar2(20),
    order_type varchar2(20),
    order_time varchar2(20),
    order_boolean number(1, 2),
    order_menus varchar2(20),
    foreign key (member_id) references member(member_id),
    foreign key (restaurant_id) references restaurant(restaurant_id)
);

-- 1개 주문 조회

select
    o.order_id,
    m.name as member_name,
    m.phone as member_phone,
    r.name as restaurant_name,
    r.phone as restaurant_phone,
    o.address as order_delivery_address,
    o.request,
    o.totalprice,
    o.order_type,
    o.order_time,
    o.order_boolean,
    mn.menu_name as ordered_menu,
    mn.price as menu_price
from orders o
join member m on o.member_id = m.member_id
join restaurant r on o.restaurant_id = r.restaurant_id
join menu mn on o.order_menus = mn.menu_id
where o.order_id = 'ORD-001';




drop table tbl_todo;
drop sequence seq_tbl_todo;

create table tbl_todo(
    tno number primary key,
    title varchar2(4000) not null,
    dueDate date,
    finished number(1) 
);

select * from tbl_todo;

create sequence seq_tbl_todo;

insert into tbl_todo ( tno, title, dueDate, finished )
values (seq_tbl_todo.nextval, '', null, null);--',to_date('2025-08-20', 'yyyy-mm--dd'), 0);

delete tbl_todo
    where tno = 1;

commit ;

select * from tbl_todo where  tno = 26; 

update tbl_todo
set title = '배꾸기',
    duedate = '2025-01-01',
    finished = 1
where tno = 40;

drop table emp2;

select * from emp2;


create table emp2
as select * from emp;

select * from emp2
where empno = 7369;

delete emp2
where empno = 7369;

drop table movie;

select * from movie;

create table movie (
    movie_id number primary key,
    title varchar2(4000),
    img_url varchar2(4000),
    open_date date
);

insert into movie
    values( 1, 'F1', 'img', '2025-08-20');

delete from movie where movie_id = 1;

commit;

drop table employee;


CREATE TABLE employee (
    empno NUMBER(10) NOT NULL,
    ename VARCHAR2(50) NOT NULL,
    role VARCHAR2(10) NOT NULL,
    CONSTRAINT pk_employee PRIMARY KEY (empno),
    CONSTRAINT chk_role CHECK (role IN ('USER', 'ADMIN'))
);


INSERT INTO employee (empno, ename, role) VALUES (1001, 'John', 'USER');
INSERT INTO employee (empno, ename, role) VALUES (1002, 'Alice', 'ADMIN');
INSERT INTO employee (empno, ename, role) VALUES (1003, 'Bob', 'USER');

COMMIT;

select * from emp2;


select * from emp2
order by hiredate desc;
-- 각자 번호 붙이기
select rownum, * emp2.*from emp2
orderby hire date desc;

/* 5 */select job, count(*) as cnt
/* 1 */from emp
/* 2 */where sal > 1000
/* 3 */group by job
/* 4 */     having count(*) >=3
/* 6 */ order by cnt;


select rownum, t1.* from(
select emp2.*from emp2
order by hiredate desc
)t1;

select * from (
    select rownum rnum, t1.* from(
        select emp2.*from emp2
        order by hiredate desc
    )t1
)t2
where rnum >= 3 and rnum <= 6;

truncate table emp2;
drop table emp2;

INSERT INTO emp2 (empno, ename, job, mgr, hiredate, sal, comm, deptno)
SELECT 
    e.empno + lvl AS empno,                                 -- empno 증가
    lvl || '_' || e.ename AS ename,                         -- 이름 앞 숫자
    e.job, 
    e.mgr,
    e.hiredate + lvl AS hiredate,                           -- 하루씩 증가
    e.sal + lvl AS sal,                                     -- sal 1씩 증가
    e.comm, 
    e.deptno
FROM emp e
JOIN (
    SELECT LEVEL AS lvl 
    FROM dual 
    CONNECT BY LEVEL <= 21
) l
ON 1=1;

select * from emp2;

select count(*) from emp2;




