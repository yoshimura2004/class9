select * from emp;

select ename, job, hiredate from  emp
    where hiredate between '1981-02-20' and '1981-03-01'
    order by hiredate;

select * from emp
    where deptno in (10, 20)
    order by ename;
    
select ename as Employee, sal as Monthly from emp
    where sal < 1500 and  deptno in (10, 30);
    
    select * from emp
    where hiredate between '1982-01-01' and '1982-12-31';
    
select ename, sal, comm from emp
    where comm > nvl(sal * 1.1, 0);
    
select * from emp
    where job in ('CLERK', 'ANALYST') and sal not in (1000, 3000, 5000);

select * from emp
    where ename like '%LL%' and deptno = 30 or mgr = 7782;
    
select sysdate as "Current Date" from dual;  

select empno, ename, job, sal*1.15 as "새 급여", SAL*0.15 as "증가액" from emp;

-- emp테이블에서 이름, 입사일, 입사일로부터 6개월 후 돌아오는 월요일을 구하여 출력하는 select 문장을 출력
select ename, TO_CHAR(hiredate, 'YYYY-MM-DD') 입사일, 
    TO_CHAR(next_day(add_months(hiredate, 6), '월요일'), 'YYYY-MM-DD') "6개월 후 입사일"
    from emp;

select ename, hiredate, round(months_between(sysdate, hiredate)) "현재까지의 월 수", sal,
    round(months_between(sysdate, hiredate))*sal "현재까지의 급여" from emp;


select empno, rpad(substr(empno, 1, 2), 4, '%') "MASKING_EMPNO",
    ename, rpad(substr(ename,1,1),5,'❤') "MASKING_ENAME"  from emp;

select empno, ename, sal,  round(sal/21.5,1) "일급", round(sal/21.5/8,1) "시급"
    from emp;
    
select empno, ename, hiredate, 
    TO_CHAR(next_day(add_months(hiredate, 3), '월요일'), 'YYYY-MM-DD') "정직원 되는날" 
    ,  nvl(comm, 2 ) "COMM"
from emp;

select ename, lpad(sal, 15,'❤') from emp;

select ename, job, hiredate, TO_CHAR(hiredate, 'DAY') "지옥 시작요일" from emp;

select ename, length(ename), job from emp
    where length(ename) >= 6;

select ename, job, sal, comm, nvl(comm,0) + sal from emp;

select ename "사원명",substr(hiredate, 1, 2) "입사년도", substr(hiredate, 4, 2) "입사 월" from emp;

select * from emp
where
        substr(hiredate,5,1) = 4;
        
select * from emp
    where mod(empno,2) = 0;

select hiredate from emp;

select substr(hiredate, 1,2) "YY", substr(hiredate,4,2 ) "MON" , substr(hiredate, 7, 2) "DAY"
from emp;

select to_date('2025-05-18', 'YYYY-MM-DD') 오늘 from dual;
select to_date(sysdate)-to_date('2025-01-01', 'YYYY-MM-DD') 지난날 from dual;
select to_date(sysdate)-to_date('2025-01-01', 'YYYY-MM-DD') as 오늘까지 from dual;

select mgr, nvl(mgr,0) from emp;

select ename 이름, sal 급여, decode(job,'ANALYST', sal+200, 'SALESMAN', sal+180,
    'MANAGER', sal+ 150, 'CLERK', SAL+100, 'PRESIDENT', sal) 인상된급여
    from emp;
    
select max(sal)최고액, min(sal)최저액, sum(sal)총액, round(avg(sal))평균 from emp;

select job 담당업무, max(sal)최고액, min(sal)최저액, sum(sal)총액, round(avg(sal))평균 
    from emp
    group by job;

select job 담당업무, count(job)사원수 from emp
group by job;

select count(distinct mgr) 관리자수 from emp;

select  max(sal) 최고액, min(sal) 최저액, max(sal)-min(sal) 차액 from emp;

select job 직급, min(sal) 최저액 from emp
    having min(sal) >= 2000
    group by job
    order by min(sal);
    
select mod (15,7)
from dual;



select job from emp
    where deptno = 20 and job not in
(select job from emp
    where deptno =10);


select e.empno,
       e.ename,
       e.job,
       e.deptno,
       d.dname,
       d.loc
        from emp e
        join dept d on e.deptno = d.deptno
    where e.deptno = 20 and
    job not in
(select job from emp
    where deptno = 10);

자신과 같은 직책(JOB)을 가진 사원이 다른 부서에도 존재하는 사원의 사번(EMPNO), 이름(ENAME), 직책(JOB), 부서번호(DEPTNO)를 조회하세요.

SELECT e.empno, e.ename, e.job, e.deptno
FROM emp e
WHERE EXISTS (
    SELECT 1
    FROM emp sub
    WHERE sub.job = e.job
      AND sub.deptno <> e.deptno)
      order by job;

select * from emp
    where deptno in (10,20);
    
select * from emp
    where sal > 2000;
    
select * from  emp
    where comm is null;
    
select * from emp
    where deptno in (10, 20) and
    (select sal from emp
    where sal > 2000);
    
    -- 1번 문제 3문항
    
    select  empno, ename from emp; --q1. 테이블의 사원번호와 사원명만 출력
    select empno from emp
        order by empno desc; -- q2. 사원번호 높은 숫자부터 낮은 순서로 출력
        
    select rpad(substr(empno, 1, 2), 4, '*') from emp; -- q3. 보안을 위해 앞 2자리는 그대로 출력하고 나머지는 *로
    
    --2번 문제 2문항
    
    select              --q1. 사원번호, 사원명, 부서이름, 부서위치를 출력하세요
        e.empno, 
        e.ename, 
        d.dname, 
        d.loc        
    from emp e
    join dept d on e.deptno = d.deptno;
    
    select              --q2. 부서이름 기준으로 내림차순 정렬하세요
        e.empno, 
        e.ename, 
        d.dname, 
        d.loc        
    from emp e
    join dept d on e.deptno = d.deptno
    order by d.dname desc;
    
    
            
    
      
    