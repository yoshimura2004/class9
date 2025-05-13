-- sal 컬럼을 기준으로 오름차순 -작은것 부터 큰 것으로
select * from emp
order by sal;

select * from emp
order by sal asc;

-- sal 컬럼 기준으로 내림차순 - 큰 것 부터
select * from emp
order by sal desc;

select * from emp
order by hiredate asc;

select * from emp
order by ename asc;

select * from emp
order by job asc;

select * from emp
order by sal asc;

select * 
    from emp
order by deptno asc, sal desc;
-- depento asc, sal desc; 이 상황에서 연봉이 같은 애들 사원번호로 내림차순 정렬하시오.

select * 
    from emp
order by deptno asc, sal desc, empno desc;




